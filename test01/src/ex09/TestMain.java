package ex09;

// 중첩클래스 : nested class
// {Outer class {inner class} } 클래스 안에 클래스가 있음

class Test{ // outer class
	static int a = 10;
	int b = 20;
	
	void write() {
		final int c = 30;
		int d = 40;
		
		class LocalTest { // inner class
			void write() {
				System.out.println("a: " + a);
				System.out.println("b: " + b);
				System.out.println("c: " + c);
				
				// 값 변경 불가능 : final
//				c = 12; => error
//				d = 100; => final을 붙이지 않아서 (이너 클래스 밖에 있는 변수임)
				int innerC = c;
				innerC    += 30; // 사용가능
				
				int innerD = d;  // 원칙은 error : final을 붙이지 않아서 
				innerD    += 40;
				
				System.out.println("d: " + d);
				
				System.out.println(innerC);
				System.out.println(innerD);
			} // inner write end
			
		} // class LocalTest end
		
		LocalTest lt = new LocalTest();
		lt.write();
		
	} // outer write end
}

public class TestMain {

	public static void main(String[] args) {
		Test te = new Test();
		te.write();

	}

}
