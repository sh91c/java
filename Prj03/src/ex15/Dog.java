package ex15;

public class Dog implements IPet {
	String name;
	
	@Override
	public void cry() {
		System.out.println(name + "이 멍멍하고 짖는다.");

	}

}
