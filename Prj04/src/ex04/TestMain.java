package ex04;
// clone() 내장 함수와 Cloneable 내장 인터페이스 



//class Member{ 5. 예외발생함
class Member implements Cloneable{  // 6. implements Cloneable 추가해야 예외처리가 된다. (내장 인터페이스)
	String  id;
	String  name;
	String  password;
	int     age;
	boolean adult;

	public Member(){}

	public Member(String id, String name, String password, int age) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		if(age > 19)
			this.adult = true;
		else
			this.adult = false;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", password=" + password + ", age=" + age + ", adult=" + adult
				+ "]";
	}

	public Member getClone() {
		// 2. clone() 객체를 복사해준다.
		// 3. CloneNotSupportedException 를 발시키므로 예외처리를 한다.
		// 4. 반드시 해줘야할 것 : implements Cloneable을 사용! 안하면 예외발생!
		Member cloned = null;
		try {
			cloned = (Member) clone(); // 1. -> clone()함수를 이름만 작성하고(내장함수) 서라운드 트라이 캐치 선택 (작성법을 다시 한번 상기하자)
		} catch (CloneNotSupportedException e) { // 1-1. throw 해도 상관없음.
			e.printStackTrace();
		}
		return cloned;
	}
	
	
}

public class TestMain {

	public static void main(String[] args) {
		Member m1 = new Member("blue", "하늘이", "1111", 17);
		System.out.println(m1);
		
		// getClone() : 객체를 복사해주는 메소드.(만들어야함)
		Member m2 = m1.getClone();
		System.out.println(m2);
		
		m1.age = 29;				// 7. 복사가 되었는지 확인해보기
		System.out.println(m1.age);
		System.out.println(m2.age);
	}

}
