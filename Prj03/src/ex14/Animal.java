package ex14;
// abstract 공부하기
abstract public class Animal {
	// abstract 클래스는 new생성자로 객체를 만들 수 없다.
	String name;
	
	
	
	public void eat(String food) {
		System.out.println(name + "이(가) " + food + "을(를) 먹는다.");
	}
	
	abstract public void cry();  // 코딩이 없는 메소드라면 abstract를 붙임.(클래스에도)
}
