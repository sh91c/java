package ex01.generic2;
// 제너릭 가변 타입

class Apple2{}
class Melon{}

// T: Type의 약자, 들어오는 type에 맞게 설정된다. 레퍼런스 타입만 사용가능
class NewBox<T> {
	T t;
}

public class TestMain2 {

	public static void main(String[] args) {
		Apple2         greenApple   = new Apple2();
		NewBox<Apple2> box1         = new NewBox<Apple2>();
		box1.t			            = greenApple; // 넣기
		Apple2 newapple             = box1.t;     // 꺼내기
		
		NewBox<String> box2         = new NewBox<String>();
		box2.t                      = "홍길동";
		String name                 = box2.t;

		Melon melon					= new Melon();
		NewBox<Melon> box3			= new NewBox<Melon>();
		box3.t						= melon;
		Melon	newMelon		    = box3.t;
		
		// int (X) -> Integer (O) : Wrapper Class 
		NewBox<Integer> box4		= new NewBox<Integer>();
		box4.t						= 12345;
		int num1					= box4.t;
		System.out.println(num1);
	}

}
