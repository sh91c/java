package thread01;

import java.awt.Toolkit;

public class BeepPrint01 {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		// 비프음과 "띵"출력을 동시에 하고싶다.
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);   // 0.5초를 기다린다.
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		
	}

}
