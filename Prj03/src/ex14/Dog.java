package ex14;

public class Dog extends Animal {

	public void swim() {
		System.out.println(name + "이(가) 수영을 합니다.");
	}

	// abstract로 만들어진 부분은 각 클래스마다 코딩을 해야함.
	@Override
	public void cry() {
		System.out.println("멍멍!");
	}

}
