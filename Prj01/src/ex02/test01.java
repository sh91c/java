package ex02;

public class test01 {

	public static void main(String[] args) {
		// [이항 연산자]
		int a1 = 3, a2 = 4;
		int r1 = a1 + a2;
		System.out.println(r1);
		
		// [단항 연산자: 증감 연산자]
		int b1 = 3, b2 = 3;
		int r2 = ++b1; // 선행(prefix) - b1을 먼저 증가 후 r2에 대입
		int r3 = b2++; // 후행(postfix) - b2를 r3에 먼저 대입 후 증가
		System.out.println("++b1: " + r2 +",  "+ "b2++: " + r3);
		
		// [사칙연산]
		int r4 =  3 + 4 * 7;
		System.out.println(r4); // 31
		int r5 = 3 + 7 / 2;
		System.out.println(r5); // 6
		double r6 = 3.0 + 7.0 / 2.0;
		System.out.println(r6); // 6.5 실수를 계산할 때의 작성
		
		int c1 = 7, c2 =2;
		double r8 = 3.0 + (double)c1 / (double)c2; // [casting 연산자 : 강제 형 변환]
		System.out.println(r8);
		
		c1 = 0; c2 = 2;
		int r9 = c1 / c2;
		System.out.println("r9: "+ r9);
		
		//divide by zero 예외(Exception)처리 : 실행할 때 발생하는 오류(계산 자체의 오류)
		//분모가 0이면 예외처리, 0.0이면 계산출력은 무한대
		//예외 처리 try ~ catch문법
		try {
			c1 = 7; c2 = 0;
			int r11 = c1 / c2;
			System.out.println("r11: " + r11);
		} catch(ArithmeticException e) {
			System.out.println("r11에 대한 에러가 발생했습니다."+e.getMessage());
		} catch(Exception e) {
			System.out.println("오류가 발생했습니다." + e.getMessage());
		}
		
		System.out.println("End");
		
		// ---------------------비교 연산---------------------
		
//		int num1 = 1;
//		String name1 = "아이유";
		int age1 = 25;
		String address = "부산";
		char gender1 ='여';
		// 여자를 찾아라.
		boolean bl1 = gender1 == '여';
		System.out.println(bl1);
		// 20대 찾기
		boolean bl2 = age1 >= 20 && age1 < 30;
		System.out.println(bl2);
		// 20대 여자, 부산, 대구, 창원 찾기
		boolean bl3 = age1 > 20 && age1 < 30 && gender1 =='여' && (address =="부산" || address =="대구" || address =="창원");
		System.out.println(bl3);
	}
}
