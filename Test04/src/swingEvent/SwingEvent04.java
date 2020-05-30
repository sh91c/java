package swingEvent;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

// 4번째 이벤트 처리방법 : 익명 클래스를 사용

public class SwingEvent04 extends JFrame {
	
	JButton  btn1;
	JTextField txt1;
	
	public SwingEvent04() {
		super("SWING EVENT EX04");
		this.setLayout(new FlowLayout());
		
		txt1 = new JTextField(10);
		this.add(txt1);
		
		btn1 = new JButton("새 버튼");
		this.add(btn1);
		
							   // 익명 클래스 작성법
//		btn1.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println(e.toString());
//				String txtString = txt1.getText() + "님 안녕하세요.";
//				System.out.println(txtString);
//				
//			}
//		});
		
		// 람다식 작성 : 자바 1.8 이상에서만 작동함
		btn1.addActionListener( (e) -> {
			System.out.println(e.toString());
			String txtString = txt1.getText() + "님 안녕하세요.";
			System.out.println(txtString);
		});
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(300, 300);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new SwingEvent04();

	}

}
