package ex03;

public class Person {
	// 필드
	String name;
	String tel;

	// 메소드 오버라이드
	@Override
	public String toString() {
		return "Person [name=" + name + ", tel=" + tel + "]";
	}

}
