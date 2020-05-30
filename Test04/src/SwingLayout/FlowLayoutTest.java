package SwingLayout;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutTest extends JFrame {

	public FlowLayoutTest() {
		super("FlowLayout Test Ex01");
		this.setLayout(new FlowLayout());
		
		JButton [] btns = new JButton[5];
		for (int i = 0; i < btns.length; i++) {
			btns[i] = new JButton("버튼"+(i+1));
			this.add(btns[i]);
			
			// final을 여기서 사용하기엔 기능상 문제는 없지만 문법적으로 알맞지 않음.
			final int index = i;
			btns[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String msg = btns[index].getText();
					System.out.println(msg);
				}
			});
		}
//		JButton btn1 = new JButton("단추1");
//		JButton btn2 = new JButton("단추2");
//		JButton btn3 = new JButton("단추3");
//		JButton btn4 = new JButton("단추4");
//		JButton btn5 = new JButton("단추5");
//		
//		this.add(btn1);
//		this.add(btn2);
//		this.add(btn3);
//		this.add(btn4);
//		this.add(btn5);
		
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(400,300);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new FlowLayoutTest();

	}

}
