package swingEvent;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingEvent03 extends JFrame implements ActionListener {

	JButton btn1;
	JLabel  lbl1;
	
	public SwingEvent03() {
			super("SWING EVENT EX03");
			this.setLayout(new FlowLayout());
			
			btn1 = new JButton("단추1");
			lbl1 = new JLabel();
			
			this.add(btn1);
			this.add(lbl1);
			
			btn1.addActionListener(this);
			
			this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			this.setSize(300, 300);
			this.setVisible(true);
	}
	
	

	public static void main(String[] args) {
		new SwingEvent03();
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();
		lbl1.setText(btn1.getText() + "이 눌러졌습니다.");
	}
}
