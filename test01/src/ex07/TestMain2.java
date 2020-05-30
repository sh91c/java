package ex07;

interface IDuck {
	void swim();
}

interface IRacoon {
	void dig();
}

class DuckRacooni implements IDuck, IRacoon {

	@Override
	public void dig() {
		System.out.println("땅을 판다");		
	}

	@Override
	public void swim() {
		System.out.println("헤엄친다");		
	}
	
}

public class TestMain2 {

	public static void main(String[] args) {
		DuckRacooni jdr = new DuckRacooni();
		jdr.swim();
		jdr.dig();
		

	}

}
