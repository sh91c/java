package swingEvent;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class EventA implements ActionListener { // 2. 해당 객체(클래스)는 ActionListener 인터페이스를 상속받아야 한다.

	@Override // unimplements EventA
//	public void actionPerformed(ActionEvent e) { // 1번에서 버튼을 눌렀을 때의 정보가 e에 들어가기 때문에 e를 사용하는것이 중요하다.
	public void actionPerformed(ActionEvent e) {
		
		JButton btn = (JButton) e.getSource();  // 이벤트(e)는 Object 타입이다. -> casting 사용 : 이벤트를 발생시킨 component를 알아냄.
		
		System.out.println(e.toString());       // 어떤 정보인지 확인해보자.
		String text = btn.getText();
		System.out.println(text);
	} 
	
} // 단점 버튼마다 클래스를 만들어야함. 하나로 만들 수 있음.. 이벤트 정보에 따라 조건문을 사용!

public class SwingEvent01 extends JFrame {

	JButton btn1, btn2, btn3;
	JLabel  lbl1;
	
	public SwingEvent01() {
		super("Swing Event Ex01");
		
		this.setLayout(new FlowLayout());
		
		btn1 = new JButton("버튼1");
		btn2 = new JButton("버튼2");
		btn3 = new JButton("버튼3");
		lbl1 = new JLabel("출력");
		
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.add(lbl1);
		btn1.addActionListener(new EventA()); // 1. addActionListener(객체)를 넣어야하는데
		btn2.addActionListener(new EventA()); // 1. addActionListener(객체)를 넣어야하는데
		btn3.addActionListener(new EventA()); // 1. addActionListener(객체)를 넣어야하는데
		
		this.setSize(400, 300);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new SwingEvent01();

	}

}
