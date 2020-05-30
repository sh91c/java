package swingEvent;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class SwingEvent02 extends JFrame {
	
	JButton    btn1, btn2, btn3;
//	JButton [] btns;
//	List<JButton> btnList = ArrayList<>();
	JLabel     lbl1;
	
	
	public SwingEvent02() {
		super("SwingEventTest02");
		
		this.setLayout(new FlowLayout());
		
		btn1 = new JButton("버튼1");
		btn2 = new JButton("버튼2");
		btn3 = new JButton("버튼3");
		lbl1 = new JLabel("레이블 입니다.");
		
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.add(lbl1);
		
		btn1.addActionListener(new BtnClick());
		btn2.addActionListener(new BtnClick());
		btn3.addActionListener(new BtnClick());
		
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setSize(300,300);
		this.setVisible(true);
	}
	
	// 중첩 클래스를 활용하여 이벤트 처리하는 방법
	// 이벤트 연결을 inner class 로 코딩
	private class BtnClick implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton) e.getSource();
			String text = btn.getText();
			System.out.println(text);
			lbl1.setText(text + "이 클릭되었습니다." );
		}
		
	}
	
	public static void main(String[] args) {
		new SwingEvent02();

	}

}
