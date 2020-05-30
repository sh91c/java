package ex09;

public class Cow {
	String name;
	int    age ;
	
	public void eat(String food) {
		System.out.println(this.name + "이 " + food + "을 먹는다.");
	}
	
	public void moo() {
		System.out.println("뭄무무 뭄무~");
	}

	@Override
	public String toString() {
		return "Cow [name=" + name + ", age=" + age + "]";
	}
}
