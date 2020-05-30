package ex14;

public class Cat extends Animal {
	
	public void climb() {
		System.out.println(name + "이(가) 캣 타워를 올라갑니다.");
	}

	
	// abstract로 만들어진 부분은 각 클래스마다 코딩을 해야함.
	@Override
	public void cry() {
		System.out.println("야~~옹");
	}

}
