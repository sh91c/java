package ex01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

// 스윙은 현재 OS의 GUI클래스(X windows?)들을 상속받아 사용한다 -> extends JFrame
// Frame  : AWT   - 현재 OS의 부품을 호출, 각 OS마다 그래픽적인 요소가 달라지는 문제가 있음..
// JFrame : Swing - 각각의 OS 사이의 그래픽 차이를 극복하기 위한 라이브러리

// 1. JFrame 상속
public class SwingTest01 extends JFrame {
	
	JButton	btn1, btn2, btn3, btn4, btn5;

	// 2. 생성자
	public SwingTest01() {
		super("스윙 테스트 연습");
		
		setLayout( new FlowLayout() );
		btn1 = new JButton("버튼1");
		btn2 = new JButton("버튼2");
		btn3 = new JButton("버튼3");
		btn4 = new JButton("버튼4");
		btn5 = new JButton("버튼5");
		
		// 배치한 순서에 따라 출력
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 300);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new SwingTest01();
	}

}
