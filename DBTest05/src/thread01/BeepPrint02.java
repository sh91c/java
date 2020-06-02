package thread01;

import java.awt.Toolkit;

public class BeepPrint02 {

	public static void main(String[] args) {
		// 1번 방법 : 별도 Class로 작업 
//		Runnable beepTask = new BeepTask(); // ~~able : interface
//		Thread thread = new Thread(beepTask);
//		thread.start(); // start() -> BeepTask()안에 있는 run()을 동시에 실행하도록 호출 : 부 thread
		
		
		// 2번 방법 : 익명클래스로 작업
//		Thread thread = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				Toolkit toolkit = Toolkit.getDefaultToolkit();
//				for (int i = 0; i < 5; i++) {
//					toolkit.beep();
//					try {
//						Thread.sleep(500);
//					} catch (Exception e) {
//						e.printStackTrace();
//					}
//				}
//			}
//		});
//		
//		thread.start();
		
		// 3번 방법 : 람다식 사용, 인터페이스를 임플리먼트해서 사용함(보이지않음)
		Thread thread = new Thread(() -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for (int i = 0; i < 5; i++) {
				toolkit.beep();
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} );
		thread.start();
		
		  // Main Thread
		for (int i = 0; i < 5; i++) {
			System.out.println("Beep!");
			try {
				thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} // Main Thread
	}

}
