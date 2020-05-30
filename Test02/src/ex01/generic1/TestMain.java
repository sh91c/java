package ex01.generic1;

class Apple {}
class Banana {}

class Box {
	Object fruit;
}

public class TestMain {

	// *** 제너릭 사용 안했을 때 : Box에 과일만 담고싶은 의도가 실패하게 된다( 아무 타입이나 다 담을 수 있기 때문에 )
	
	public static void main(String[] args) {
		Box box = new Box();
		Apple redApple = new Apple();
		Banana yellowBanana  = new Banana();
		
		// 박스에 저장
		box.fruit = redApple;
		Apple apple1 = (Apple) box.fruit;
		
		box.fruit = "홍길동";
		
	}

}
