package thread01;

import java.awt.Toolkit;

public class BeepPrint03 {

	public static void main(String[] args) {
		// 1번 방법.
//		Thread thread = new BeepThread();
//		
//		thread.start();
		
//		for (int i = 0; i < 5; i++) {
//			System.out.println("Beep!");
//			try {
//				thread.sleep(500);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
		
		// 2번 방법
		Thread thread = new Thread() {

			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		};
		
		thread.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Beep!");
			try {
				thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
