package thread01;

import java.awt.Toolkit;

public class BeepTask implements Runnable { // 인터페이스 안에 메소드가 있으면 있는 것 만큼 출력됨

	@Override
	public void run() { // Runnable 인터페이스에 run()이 있음.
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

}
