package member;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MemberList extends JFrame {
	// 필드
	DefaultTableModel model;
	JTable 			  jt;
	JScrollPane       pane;
	JPanel			  pbtn;
	JButton			  btnInsert;
	
	// 제목이름들
//	String [] colNames = {"아이디", "암호", "이름", "태어난 연도" };
	Vector<String> colNames;
	
	// Data로 사용될 객체 정보
	// VO : Value Object
	// DTO : Data Transfer Object
	
	// Vector<MemberVO> 는 DefaultTableModel의 데이터로 인지하지 못함
	// 해결책: MemberVO를 Inner Vector에 담아서 VOut Vector에 담아서 처리
	// Vector<memberVO> (X) => Vector (O)
	// DefaultTableModel 은 Vector 사용 가능하지만
	//						Vector<memberVO> 는 ClassCastExeption을 발생시킴( 구버전 작성법 )
	Vector dataList;
	
	// 생성자
	public MemberList() throws IOException {
		super("회원목록");
		
		// 제목줄 처리
		colNames = getColumnNames();
		// data 처리
		dataList = getDataList();
		model = new DefaultTableModel(dataList, colNames);
		
		jt    = new JTable(model);
		pane  = new JScrollPane(jt);
		this.add(pane);
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(500, 300);
		this.setVisible(true);
	}
	
	private Vector getDataList() throws IOException {
		Vector list = new Vector();
		
		MemberVO m;
		Vector   v;
		
		// 파일처리
		File file = new File("src/member/member.dat");
		System.out.println(file.getAbsolutePath());
		
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		String line = "";
		while( (line = br.readLine()) != null ) {
			String[] user = line.trim().split(",");
			String uID  = user[0].trim();
			String uPW  = user[1].trim();
			String uNM  = user[2].trim();
			int    uBY  = Integer.valueOf(user[3].trim());
			
			m = new MemberVO( uID, uPW, uNM, uBY);
			v = m.getVector();
			list.add(v);
			
			System.out.println( uID + uPW + uNM + uBY );
		
		}
		
		
		br.close();
		fr.close();
		
		System.out.println("리스트 수:" + list.size());
		return list;
	}

	private Vector<String> getColumnNames() {
		Vector<String> colNames = new Vector<String>(); // GUI는 쓰레드를 사용해서 vectorList를 사용한다
		colNames.add("아이디");
		colNames.add("암호");
		colNames.add("이름");
		colNames.add("나이");
		colNames.add("성인여부");
		return colNames;
	}

	// 메소드
	public static void main(String[] args) throws IOException {
		
		new MemberList();

	}

}
