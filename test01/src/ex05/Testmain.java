package ex05;

class Member {
	private String id;
	public Member(String id) {
		this.id = id;
	}
	
	// 추가
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if(this.id.equals(member.id)) // 문자열 비교
				return true;
			else
				return false;
		}
		return super.equals(obj);  // 주소 비교
	} 
	
}

public class Testmain {

	public static void main(String[] args) {
		Member m1 = new Member("sky");
		Member m2 = new Member("blue");
		Member m3 = new Member("blue");		
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		
		System.out.println(m1 == m2);
		System.out.println(m2 == m3);
		
		// .equals()는 재정의하지 않으면 주소비교를 한다.
		// 객체의 인스턴스를 비교하려면 equals()를 값을 비교하도록 재정의해야다.
		// String 타입의 경우에는 값을 비교하도록 재정의 되어있다. String이 특이한 케이스임.
		System.out.println(m1.equals(m2));
		System.out.println(m2.equals(m3));
		
		System.out.println("===================================");
		
		// 문자열 값 비교
		String name1 = "이순신";
		String name2 = "이순신";
		
		System.out.println(name1 == name2); 	 // true -> 사용하지말것 (주소를 비교한 것)
												 // 컴파일러가 최적화 : 같은 문자열은 변수 1개만 만들고 같이 사용함.
		System.out.println(name1.equals(name2)); // true -> String 타입은 값 비교
												 // 이외의 타입은 재정의를 해야 값을 비교함
		
		System.out.println("===================================");
		
		String name3 = new String("이순신");
		String name4 = new String("이순신");
		
		System.out.println(name3 == name4);      // false
		System.out.println(name3.equals(name4)); // true
		
		// *** 문자열 비교는 무조건 equals 사용 ***
		
	}

}
