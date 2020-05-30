package ex01;

public class Test01 {
	// 간단한 함수 만들기 
	
	static int add(int v1, int v2){
		int val;
		val = v1 + v2;
		return val;
	}
	
	public static void main(String[] args) {
		int v1, v2;
		int val1;
		
		v1 = 7; v2 = 2;
		//val1 = v1 + v2;
		val1 = Test01.add(v1,v2);		
//		System.out.println(v1 + " + " + v2 + " = " + val1 );
		System.out.printf("%d + %d = %d\n\n", v1, v2, val1);
		
		
		// static이 없어도 실행 가능
		Test01 t1 = new Test01();
		int val2 = t1.add(v1, v2);
		System.out.printf("%d + %d = %d\n\n", v1, v2, val2);
		
		
		
		
	}

}
