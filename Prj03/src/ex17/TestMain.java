package ex17;

interface Duck {
	public void swim();
}

interface Racoon {
	public void dig();
}

class DuckRacoon implements Duck, Racoon {  // 하나의 클래스가 여러 인터페이스를 임플리먼트로 구현할 수 있다! O
											// 하나의 클래스가 여러 클래스를 익스텐드할 수 있다! X

	@Override
	public void dig() {
		System.out.println("땅을 팝니다.");
		
	}

	@Override
	public void swim() {
		System.out.println("헤엄을 칩니다.");
		
	}
	
}

public class TestMain {

	public static void main(String[] args) {
		DuckRacoon dr = new DuckRacoon();
		dr.swim();
		dr.dig();

	}

}
