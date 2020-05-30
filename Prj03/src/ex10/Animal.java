package ex10;

public class Animal {
	String name;
	int    age ;
	
	public void eat(String food) {
		System.out.println(this.name + "이(가) " + food + "을(를) 먹는다.");
	}

	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + "]";
	}
}
