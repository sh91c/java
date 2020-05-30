package collection03;

public class Member {
	// field
	private String name;
	private int age;

	// Getter
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	// constructor
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 객체에 대한 중복제거를 위한 재정의
	@Override public int hashCode() { 
		return name.hashCode() + age; 
		}
	
	@Override public boolean equals(Object obj) { 
		if(obj instanceof Member) {
			Member mem = (Member) obj; 
			return mem.name.equals(this.name) && (mem.age == this.age); 
		} 
		return false; 
	}
}
