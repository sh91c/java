package ex01;

import java.util.Date;
// 자바 내부 클래스를 불러온 것.

public class Ex03 {

	// @ : annotation, 컴파일러한테 deprecation을 무시할 수 있도록 해줌.
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.out.println("Hello");
		
		short num1 = 32767;
		
		System.out.println(num1);
		num1 = (short) (num1 + (short) 3);
		System.out.println(num1);
		
		int age = 13;
//		float height = 178.3f;
//		float height = (float) 178.3;
		double height = 178.3;
		
		boolean adult = true; // true; || false; 불린 상수라고함, null은 레퍼런스 클래스에서 초기화하는 데이터
		if(age < 19) {
			adult = false;
		}
		System.out.println(adult);
		
		height = height + 10;
		System.out.println(height);
		
//		System.out.println(0==0.0);
//		 int와 double 을 비교 혹은 계산할 때 데이터 타입이 다르니 암시적(implicit)으로 int를 double로 변환한다.
		
		Date today = new Date();
//		java.util.Date today = new java.util.Date();
//		ctrl + shift + o 누름
		
		int year = today.getYear();
		System.out.println(year);
		
	}

}
