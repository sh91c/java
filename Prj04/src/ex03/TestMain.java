package ex03;

class Member {
	// field
	private String  id;
	private String  name;
	private String  password;
	private int     age;
	private boolean adult;
	
	
	// getter setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;  // 나이가 set이 될 수 있다면 adult에 대한 부분을 추가해줘야 함.
		if(age > 19)
			this.adult = true;
		else
			this.adult = false;
	}

	public boolean isAdult() { // 불린 타입일 경우 is가 붙음
		return adult;
	}

	
	// constructor
	public Member() {}
	// 굳이 불린값인 adult를 매개변수로 받을 이유는 없음 -> 계산해야하기 때문에
	public Member(String id, String name, String password, int age) {
		this.id       = id;
		this.name     = name;
		this.password = password;
		this.age      = age;
		
		if(age > 19)
			this.adult	= true;
		else
			this.adult  = false;
	}

	
	// method
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name
				+ ", password=" + password + ", age=" + age
				+ ", adult=" + adult
				+ "]";
	}
	
	
	
}

public class TestMain {

	public static void main(String[] args) {
		Member m1 = new Member("1", "채수빈", "1234", 27);
		System.out.println(m1);
		
//		m1.setAge(14);
//		System.out.println(m1);
		
		Member m2 = new Member("2", "크러쉬", "1234", 20);
		System.out.println(m2);
		
//		Member m3 = new Member("1", "채수빈", "1234", 27); -> 복사를 해야할 때
		Member m3 = m1;									   // 복사가 된걸까? ㄴ
		System.out.println(m3);							   // 이름만 m3 인거지, m1의 주소를 가르치는 것과 다르지 않음.
		
		System.out.println("m1 나이가 바뀜");
		m1.setAge(17);
		System.out.println(m1);
		System.out.println(m3); // -> m3도 같이 바뀌는 것을 확인할 수 있음. 복사 된것이 아니다!
		
		
		// 객체 복사 m2 -> m3. new하지 않은 복사이기 때문에 Shallow copy(얕은 복사) 라고 함.
		Member_copy(m2, m3);
		System.out.println("m2를 셸로우 카피한 m3 출력: ");
		System.out.println(m3);
		
		// Deep copy (깊은 복사): new를 사용. 아래 member_deepcopy 함수 참고
		Member m4 = member_deepcopy(m2);
		System.out.println("딥 카피로 m2를 m4 복사했음");
		System.out.println(m4);
		
		// 클론 명령어가 있지만 인터페이스를 무조건 1개 사용해야함.
	}

	private static Member member_deepcopy(Member src) {
		Member dest = new Member();
		dest.setId( src.getId() );
		dest.setName( src.getName() );
		dest.setAge( src.getAge() );
		dest.setPassword( src.getPassword() );
		return dest;
	}

	private static void Member_copy(Member src, Member dest) {
		
		dest.setId( src.getId() );  //  dest.id <= src.id 복사
		dest.setName( src.getName() );
		dest.setAge( src.getAge() );
		dest.setPassword( src.getPassword() );
	}

	
	
	
	
	
	
	
	
	
	
}
