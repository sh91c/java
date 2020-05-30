package ex01.generic2;
// 제너릭을 활용할 때

class Apple{}

class Box<Apple>{
	Apple t;
}

public class TestMain {

	public static void main(String[] args) {
		Apple redApple = new Apple();
		Box<Apple> box = new Box<Apple>();
		// 넣기
		box.t          = redApple;
		// 꺼내기
		Apple apple1   = box.t;
		
//		box.t = "홍길동"; 에러

	}

}
