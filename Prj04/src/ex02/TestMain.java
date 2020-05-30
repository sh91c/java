package ex02;

// Nested Class : 중첩 클래스 // 미리 알아두기

class Test{									// 클래스 안에
	static int a  = 10;
	int        b  = 20;
	
	void write() {
		final int c = 30;  // 여기 이후부터 상속이 더 이상 되지 않음. -> 실제로는 중첩클래스와 연관이 있음
		int d = 40;
		
		// Inner Class
		class LocalTest {					// 클래스를 넣었다. ( 클래스 -> 함수 => 클래스 )
			void write() {
				System.out.println("a: " + a);
				System.out.println("b: " + b);
				System.out.println("c: " + c);
				System.out.println("d: " + d);
			}
		} // 내부 클래스는 클래스안에서만 사용하고 외부에서는 사용하지 않으려고 작성.
		LocalTest ob = new LocalTest();
		ob.write();
	}
}

public class TestMain {

	public static void main(String[] args) {
		Test ob = new Test();
		ob.write();

	}

}
