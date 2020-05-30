package swingEvent;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

// 5번째 이벤트 처리 작성법
// Adapter 클래스를 활용 : 필요한 이벤트만 사용할 수 있다.

public class SwingEvent05 extends JFrame{

	JButton btn1;
	JLabel la = new JLabel("Hello");
	
	public SwingEvent05() {
		super("SWING EVENT EX 05");
		this.setLayout(new FlowLayout());
		
		this.add(la);
		la.setLocation(30, 30);
		
		btn1 = new JButton("OK!");
		btn1.addMouseListener(new MyMouseAdapter());
		this.add(btn1);
		
		Container c = getContentPane();
		c.addMouseListener(new MyMouseAdapter());
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(400,400);
		this.setVisible(true);
	}
	
	class MyMouseAdapter extends MouseAdapter{

		@Override
		public void mousePressed(MouseEvent e) {
			super.mousePressed(e);
			int x = e.getX();
			int y = e.getY();
			System.out.println("클릭 위치(" + x + "," + y + ")");
			la.setLocation(x, y);
		}
		
	}
	
	public static void main(String[] args) {
		new SwingEvent05();

	}

}
