package ex11;

public class Person {
	// field --> Access modifier : private
	private String name; // private 일때 상속되지 않음
	private String tel;
	
	
	
	// private 필드의 함수를 외부에서 visible하게 사용할 수 있도록 하는 방법
	// -->> Getter , Setter를 이용!
		// getter: 외부에서 값을 읽어들일 때 사용함!
	public String getName() {
		return this.name;
	}
		// 단축키 알 + 컨 + 에스로 제너레이트 할 수도 있다.
	public String getTel() {
		return this.tel;
	}
	// setter: (예시)키보드로 입력을 받아서 값을 보관하고 싶을 때 사용함!
	public void setName(String name) {
		this.name = name;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	// constructor  : Main(){}에서 new를 할 때 실행되는 명령 *메모리 힙 영역
	public Person() {
		System.out.println("기본 생성자 입니다.");
	}
	
	public Person(String name, String tel) {
		this(); // 자신이 가지고 있는 기본생성자를 호출
		this.name = name;
		this.tel = tel;
	}

	
	// method
	public void info() {
		System.out.println("이름: " + name);
		System.out.println("전화번호: " + tel);
	}
	
}