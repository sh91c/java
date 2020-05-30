package ex07;

//인터페이스를 활용한 다중상속 구현
//자바 클래스는 다중상속 불가능 -> 인터페이스를 이용해서 다중상속 구현

// 1. class + interface

interface Racoon {
	public void dig();
}

class Duck {
	public void swim() {
		System.out.println("헤엄친다");
	} 
}

// 2. interface + inteface
class DuckRacoon extends Duck  implements Racoon  {

	@Override
	public void dig() {
		System.out.println("땅을 판다");		
	}
	
}

public class TestMain {

	public static void main(String[] args) {
		DuckRacoon dr = new DuckRacoon();
		dr.swim();
		dr.dig();

	}

}

/*
package ex07;



//첫 번째 경우 : class + interface

class Duck{
	public void swim() {
		System.out.println("헤엄친다.");
	}
}

class Racoon {
	public void dick() {
		System.out.println("땅을 판다.");
	}
}

//두 번째 경우 : interface + interface

class DuckRacoon extends Duck, Racoon {
	
}

public class TestMain {

	public static void main(String[] args) {
		DuckRacoon dr = new DuckRacoon();

	}

}
*/