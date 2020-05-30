package SwingLayout;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayoutTest extends JFrame {

	public BorderLayoutTest() {
		// 타이틀 출력
		this.setTitle("Border Layout Test ex01");
		
		this.setLayout(new BorderLayout());
	
		// Frame에 Component 배치
		JButton btn1 = new JButton("단축1");
		JButton btn2 = new JButton("단축2");
		JButton btn3 = new JButton("단축3");
		JButton btn4 = new JButton("단축4");
		JButton btn5 = new JButton("단축5");
		JButton btn6 = new JButton("단축6");
		JButton btn7 = new JButton("단축7");
		
		this.add(btn1, BorderLayout.NORTH);
		this.add(btn2, BorderLayout.EAST);
		this.add(btn3, BorderLayout.WEST);
		this.add(btn4, BorderLayout.SOUTH);
		
		JPanel pan1 = new JPanel(new FlowLayout()); // JPanel은 눈에 보이지 않는 컨테이너,, 여기에 담을것을 넣음
		pan1.add(btn5);
		pan1.add(btn6);
		pan1.add(btn7);
		this.add(pan1, BorderLayout.CENTER);
		
		// Frame 보여주기
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(400, 300);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new BorderLayoutTest();
	}

}
