package ex06;

public class Test02 {

	public static void main(String[] args) {
		// 문자열 찾기
		String s1 = "이순신";
		System.out.println( s1.contains("순신")); // 문자열이 포함되는 경우 
		System.out.println( s1.contentEquals("순신")); // 전체 일치할 경우 
		
		int pos1 = s1.indexOf("순신"); // 문자열의 위치를 찾음 찾는 첫번째 글자 기준 
		if (pos1 < 0) {
			System.out.println("문자열을 찾지 못했습니다.");
		} else {
			System.out.println("순신의 위치 : " + pos1);
		}
		//           01234 5 67890123 45678901 2 3
		String s2 = "Java 언어, Java 웹, Java 싫어";
		
		int pos2 = s2.indexOf("Java");
		System.out.println(pos2);
		int pos3 = s2.indexOf("Java", pos2 + 1);
		System.out.println(pos3);
		
		int pos4 = s2.lastIndexOf("Java"); // 뒤에서부터 인덱스 검색
		System.out.println(pos4);
		int pos5 = s2.lastIndexOf("Java", pos4 - 1);
		System.out.println(pos5);
		
		System.out.println(s2.toLowerCase());
		int pos6_1 = s2.toLowerCase().indexOf("java");
		System.out.println(pos6_1);
		int pos6_2 = s2.toLowerCase().indexOf("java", pos6_1 + 1);
		System.out.println(pos6_2);
		int pos6_3 = s2.toLowerCase().indexOf("java", pos6_2 + 1);
		System.out.println(pos6_3);
		
		// 비어있는 문자열 검사
		String sa1 = "abcdef";
		String sa2 = "";
		
		System.out.println(sa1.isEmpty()); // false
		System.out.println(sa2.isEmpty()); // true
		System.out.println(sa2.equals("")); // true
		System.out.println(sa2 == ""); // true (주소를 비교했음)
		
		// 문자열을 숫자로 변환
		String sv1 = "100";
//		int n1 = (int) sv1; // error
		int n1 = Integer.parseInt(sv1); // parsing -> int로 parsing하겠다. parseInt, parseFloat 등등 JS에서 많이 사용
		System.out.println(n1 * 2.5);
		
		int n2 = Integer.valueOf(sv1); // Integer.valueOf()를 사용하는 것을 추천
		System.out.println(n2 * 2.5);
		Integer in2 = Integer.valueOf(n2);
		System.out.println(in2);
		
		System.out.println("==================================================");
		
		System.out.println("문자열을 실수형으로 변경");
		String sv2 = "189.345";
		double n3  = Double.parseDouble(sv2);
		System.out.println(n3 / 10);
		
		System.out.println("==================================================");
		
		System.out.println("모든 숫자를 문자(열)로 변경");
		int num1 = 123;
//		String sv4 = num1.toString(); 사용할 수 없다. 에러.
//		String sv4 = (String) num1; int는 String으로 캐스팅 될 수 없다.
		String sv4 = num1 + "";
		String sv5 = String.valueOf(num1); // 추천 (정수형을 문자로)
		System.out.println(sv4);
		System.out.println(sv5);
		
		double num2 = 123.123456789012345678901;
		String sv6 = String.valueOf(num2); // 추천 (실수형도 동일)
		System.out.println(sv6);
	}
}
