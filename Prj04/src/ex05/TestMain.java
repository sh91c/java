package ex05;

class Member {
	String id;

	public Member(String id) {
		this.id = id;
	}
}

class Member2 {
	String id;

	public Member2(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) { // 2. 시그니쳐라서 무조건 부모인 Object로 따라가야함.
		Member2 mm = (Member2) obj; // 3. 매개변수로 받은 Object타입인 obj를 Member2 타입으로 캐스팅해야함.
									//    무조건 해야함. (업캐스팅, 다운캐스팅 관련)
		if(this.id.equals(mm.id))   // 4. 그래서 현재의 id 값과 인자로 받은 mm의 id값을 비교
			return true;
		else
			return false;
	}
	
	
	
}

public class TestMain {

	public static void main(String[] args) {
//		String name1 = "이순신";
//		String name2 = "이순신";
//		System.out.println(name1 == name2);			// hashcode 비교(주소), 문자열 비교시 사용 금지
//		System.out.println(name1.equals(name2));	// 값을 비교

		// -------------------------------------------------------------------------------------------//
		
//		Member m1 = new Member("blue");
//		Member m2 = new Member("blue");
//		Member m3 = new Member("red");
//
//		System.out.println(m1 == m2); // 주소비교
//		System.out.println(m1 == m3); // 주소비교
//
//		System.out.println(m1.equals(m2));
//		System.out.println(m1.equals(m3));
		// 왜 false? -> equals는 재정의하기 하지않으면 == 과 동일하다...
		
		// -------------------------------------------------------------//
		
		Member2 mm1 = new Member2("blue");
		Member2 mm2 = new Member2("blue");
		Member2 mm3 = new Member2("red");
		
		System.out.println(mm1 == mm2); // 주소비교
		System.out.println(mm1 == mm3); // 주소비교
		
		// 1. override equals()를 통해 값을 비교하는 것으로 로직변경 필요
		System.out.println(mm1.equals(mm2)); // 5. true
		System.out.println(mm1.equals(mm3)); // 5-1. false
		

	}
}
