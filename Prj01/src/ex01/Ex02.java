package ex01;

public class Ex02 {
	// 클래스는 함수이다.
	// 클래스 이름의 첫 글자는 대문자로 작성한다.
	public static void main(String []args) {
		// 메인 함수(제일 첫번째로 실행되는 함수)
		int thisYear  = 2020;
		int birthYear = 1991;
		int age;
		// type: int(정수형) 등
		// type 변수이름 = 값;
		// 자바는 객체지향 언어. 그래서 클래스 안에 작성을 해야함.
		// 여러 클래스가 있을 수 있지만 클래스 안에는 main함수가 무조건 1개는 있어야 함.
		// 변수 이름: 시작은 영문자 이후 숫자, 언더바, 달러까지 허용.
		//			  대소문자 구분에 엄격하다.
		
		String name = "최상훈";
		// String은 클래스이다.
		age = thisYear - birthYear + 1;
		
		System.out.println("이름: " + name);
				
		System.out.println("나이는 " + age +"살 입니다.");
		
		// *** 조건문 if ***
		if (age >= 19) {
			System.out.println("성인 입니다.");
		}
		// 만약에 아이유의 나이가 19세 이상이면 성인이고
		else {
			System.out.println("미성년자 입니다.");
		}
		//그렇지 않다면 미성년자이다.
	}

}
