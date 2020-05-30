package ex06;

public class Test01 {
	// 문자열(String) 조작
	public static void main(String[] args) {
		
		// 문자열을 저장하는 방법 두 가지
		//           0123456 7 8 901234
		String s1 = " Hello 이순신 123 "; // 공백도 데이터로 본다.
		String s2 = new String("안녕하세요 Mark 31");
		
		System.out.println(s1); // 15자
		System.out.println(s2);

		// 문자열 길이
		int len1 = s1.length(); 
		System.out.println(len1);
		// 배열.length는 속성, 속성은 변수처럼 사용가능.
		// 문자열.length()는 함수.
		
		// 특정위치의 문자
		char c1 = s1.charAt(8); // 6의 위치에 있는 글자를 뽑아냄 문자라서 charAt
		System.out.println(c1);
		System.out.println(s1.codePointAt(7)); // 유니코드 값을 추출
		
		// 문자열 비교
		String s3 = "이순신";
		String s4 = "이순신";
		boolean isSame1 = s3 == "이순신"; // true : 이름 비교하려고 == 을 사용하면 안됌. 클래스끼리 == 는 주소를 비교함. 사용금지.
		System.out.println(isSame1); // 데이터 "이순신"을 비교한 것이 아니라 주소를 비교함
		
		boolean isSame2 = s3 == s4; // true : 주소를 비교함. 이것도 사용금지.
		System.out.println(isSame2); 
		
		boolean isSame3 = s3.equals("이순신"); // 문자를 비교할 때는 무조건 *.equals("문자열")을 추천함.
		System.out.println(isSame3); // 그래서 주소가 아닌 데이터로 비교함.
		
		String s5 = new String("이순신");
		String s6 = new String("이순신");
		
		boolean isSame4 = s5 == s6; // false : 주소끼리 비교했으니 false가 정상
		System.out.println(isSame4); 
		
		boolean isSame5 = s5.equals(s6); // true : 데이터끼리 비교했으니 true가 정상
		System.out.println(isSame5);
		
		// 문자열 크기 비교(크기비교, 순서)
		String s7 = "이순신";
		String s8 = "이이";
		
		int eq = s7.compareTo(s8);
		System.out.println(eq);  // 문자열 순서비교
								 // 음수 : 앞문자열이 작다.
								 // 0    : 같다.
								 // 양수 : 앞문자열이 크다.
		
		eq = s7.compareToIgnoreCase(s8); // 문자열 순서비교( 대 소문자를 무시함. )
		System.out.println(eq);
		
		// 문자열 결합
		String s9 = s7 + "," + s8;
		System.out.println(s9);
		
		String s10 = s7.concat(",").concat(s8); // Method Chaining: 문자열을 연달아 작성
		System.out.println(s10);
		
		// 자바 1.6 부터 문자열 연산은 컴파일러에 의해 전부 스트링빌더로 사용되고 있음
		// StringBuilder() : 문자열 연산시 속도가 빠름
		//                 thread safe X
		// StringBuffer()  : 문자열 연산시 속도가 빠름
		//                 thread safe X
		StringBuilder sb = new StringBuilder();
		sb.append(s8);
		sb.append("-------------");
		sb.append(s8);
		System.out.println(sb.toString());
		
		System.out.println(sb.length());
		System.out.println(sb.substring(13, 16));
//		System.out.println(sb.substring(13)); 13째 부터 끝까지
//		sb.subString(start, end)
		// Start : 0 부터 시작
		// end   : 1 부터 시작
		
		
		
	}

}