package swingTest;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SwingLogin extends JFrame {

	// 생성자
	public SwingLogin() {
		super("첫번째 프레임");
		
		this.setLayout(new GridLayout(3, 2));
		
		// 컵포넌트 생성
		JLabel      lblUserId = new JLabel("아이디");
		this.add( lblUserId );
		
		JTextField  txtUserID = new JTextField(10);
		this.add(  txtUserID  );
		txtUserID.setText("sky");
		
		JLabel     lblPassword = new JLabel("암호");
		this.add( lblPassword );

		JPasswordField   pwPass = new JPasswordField(10);
		this.add(pwPass);
		pwPass.setText("blue");
		
		JButton    btnOk = new JButton("로그인");
		this.add(btnOk);
		
		JButton    btnCancel = new JButton("취소");
		this.add(btnCancel);
		
		// 이벤트 연결
		// 버튼을 누르면
		btnOk.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {				
				System.out.println("로그인 버튼을 클릭하였습니다");
				
				String uid  =  txtUserID.getText().toLowerCase().trim();
				// @ : annotation - 컴파일러에게 알려주는 설정정보 : 바로 다음라인에 적용
				@SuppressWarnings("deprecation")   
				String pwd  =  pwPass.getText().toLowerCase().trim();
				//String pwd  =  new String(pwPass.getPassword());
				String result  = getLogin(uid, pwd);
				System.out.println(result);
			}

			private String getLogin(String uid, String pwd) {
				
				String result = null;
				
				File            file = new File("src/swingTest/member.dat");  // (.clss)assembly 가 존재하는 경로(현재 경로)
				System.out.println("현재 경로:" + file.getAbsolutePath());
				FileReader      fr   = null;
				BufferedReader  br   = null;
				try {
					fr   = new FileReader(file);
					br   = new BufferedReader(fr);
					
					String line = ""; 
					while( (line = br.readLine()) != null  ) {
						String [] mem   = line.split(",");
						String  memid   = mem[0];  
						// 아이디가 있다
						if( memid.equals(uid)  ) {
							String  mempass = mem[1];  
							String  memname = mem[2];
							
							if( memid.equals(uid)  ) {
								if ( mempass.equals(pwd) ) {
									if( br != null )  br.close();
									if( fr != null )  fr.close();
									return memname;  // 아이디와 암호 일치
								} else {
									if( br != null )  br.close();
									if( fr != null )  fr.close();
									return "암호가 틀립니다";
								}
							} 						
						} // 중첩 반복문 한번에 탈출하는 명령어 찾기
					}
					if( br != null )  br.close();
					if( fr != null )  fr.close();
					return "아이디가 일치하지 않습니다";
				} catch (FileNotFoundException e) {					
					System.out.println( "member.dat 파일없음");
				} catch (IOException e) {					
					System.out.println( "오류발생:" + e.getMessage() );					
				} 		
				return result;
			}
			
		} );
		
		btnCancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String message = "취소 버튼을 클릭하였습니다";
				String title   = "로그인 취소";
//				System.out.println("취소 버튼을 클릭하였습니다");	
//				JOptionPane.showMessageDialog(null, message, title, JOptionPane.WARNING_MESSAGE); // 취소 버튼 눌렀을 때 다이얼로그 출력하기 1번 스타일
//				JOptionPane.showConfirmDialog(null, message, title, JOptionPane.OK_CANCEL_OPTION); // 2번 스타일(확인 및 취소버튼이 있음)
				// JOptionPane 검색하면 많은 예제가 있음
				String problem = JOptionPane.showInputDialog(null, "뭐가 문제야?", "문제들", JOptionPane.OK_CANCEL_OPTION); // 3번 스타일
				System.out.println(problem);
			}
		});
		
		pack();
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//this.setSize(400, 300);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new SwingLogin();
	}

}
