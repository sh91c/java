package swingjtable;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class JTableTest1 extends JFrame{

	public JTableTest1() {
		super("JTable Test ex01");
		
		String [] columnnames = {
				"상품번호", "상품이름", "상품가격", "상품설명"
		}; 
		
		Object [][] rowData = getDataSet();
//		Object [][] rowData = {
//				{1, "맛동산", 1000, "오리온"},	
//				{2, "초코파이", 7000, "롯데"},	
//				{3, "오예스수박맛", 2000, "해태"}	
//		};
		
		// DataSet 기법
		DefaultTableModel tm = new DefaultTableModel(rowData, columnnames);
		JTable jt = new JTable(tm);
		JScrollPane		  scrollPane = new JScrollPane(jt);
		this.add(scrollPane);
		
		// data 추가
		Object [] insertRow = new Object[] {4, "새우깡", 2000, "농심"};
		tm.addRow(insertRow);
		this.add(scrollPane);
		
		// data 조작
		// 1. 행과 열의 개수
		System.out.println("줄 수: " + jt.getRowCount());
		System.out.println("칸 수: " + jt.getColumnCount());
		
		// 2. 특정 위치의 칼럼 이름 가져오기
		System.out.println("2 번째 칸의 제목: " + tm.getColumnName(2));
		System.out.println("2 번째 칸의 제목: " + jt.getColumnName(2));
		
		// 3. 데이터 줄 삭제
		tm.removeRow(0); // 1번 줄 삭제 되었음(제목 줄은 제외된다.)
		
		// 4. 특정위치의 data 가져오기: (2, 2) 위치의 자료
		System.out.println("(2, 2) 위치의 data: " + tm.getValueAt(2, 2));		
		
		// 5. data 수정하기
		tm.setValueAt(10000, 2, 2);
		
		// 6. 선택한 row selection 하기
		jt.setRowSelectionInterval(1, 1);
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(400, 300);
		this.setVisible(true);
	}

	private Object[][] getDataSet() {
		Object [][] rowData = {
				{1, "맛동산", 1000, "오리온"},	
				{2, "초코파이", 7000, "롯데"},	
				{3, "오예스수박맛", 2000, "해태"}	
		};
		return rowData;
	}

	public static void main(String[] args) {
		new JTableTest1();
		

	}

}
