package swingTest;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.SystemColor;

public class SwingCalc extends JFrame {

	JTextField txt1, txt2;
	static JButton    btnAdd;
	JLabel     lbl;
	static JButton btnSub;
	static JButton btnMul;
	static JButton btnDiv;
	
	public SwingCalc() {
		getContentPane().setBackground(SystemColor.window);
		// 제목
		this.setTitle("계산기");
		// 화면 배치
		getContentPane().setLayout(new FlowLayout());
		
		lbl    = new JLabel("   결과   ");
		
		txt1   = new JTextField(25);
		txt1.setToolTipText("첫 번째 값");
		txt1.setText("");
		txt1.setHorizontalAlignment(SwingConstants.TRAILING);
		
		getContentPane().add(txt1);
		txt2   = new JTextField(25);
		txt2.setToolTipText("두 번째 값");
		txt2.setHorizontalAlignment(SwingConstants.TRAILING);
		txt2.setText("");
		getContentPane().add(txt2);

		
		btnAdd = new JButton("Add");
		btnAdd.setForeground(new Color(255, 204, 255));
		btnAdd.setBackground(SystemColor.window);
		getContentPane().add(btnAdd);
		
		btnSub = new JButton("Sub");
		btnSub.setForeground(new Color(51, 255, 153));
		getContentPane().add(btnSub);
		
		btnMul = new JButton("Mul");
		btnMul.setForeground(new Color(255, 102, 0));
		getContentPane().add(btnMul);
		
		btnDiv = new JButton("Div");
		btnDiv.setForeground(new Color(153, 204, 204));
		getContentPane().add(btnDiv);
		getContentPane().add(lbl);
		
		// 이벤트 연결
		this.btnAdd.addActionListener(new MyBtnClick());
		this.btnSub.addActionListener(new MyBtnClick());
		this.btnMul.addActionListener(new MyBtnClick());
		this.btnDiv.addActionListener(new MyBtnClick());
		
		// JFrame(form) 크기 출력 부분
//		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(350, 400);
		this.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new SwingCalc();

	}

	class MyBtnClick implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			int v1 = Integer.valueOf(txt1.getText());
			int v2 = Integer.valueOf(txt2.getText());
			int v = 0;
			
			JButton btn = (JButton) e.getSource();
			switch ( btn.getText() ) {
			case "Add" : v = v1 + v2; break;
			case "Sub" : v = v1 - v2; break;
			case "Mul" : v = v1 * v2; break;
			case "Div" : v = v1 / v2; break;
			}
			lbl.setText( String.valueOf(v) );
		}
		
	}
}
