package ex15;

public class TestMain {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.name ="전투견";
//		dog.cry();
		
		Cat cat = new Cat();
		cat.name = "야옹";
//		cat.cry();
		
		
		// 위처럼 작성하면 개체 1개당 동작을 매번 호출해야하니 아래처럼
		// pet_action 메소드를 만들어 한번에 동작하도록 작성하자.
		pet_action(cat);
		pet_action(dog);
		
	}
	
	private static void pet_action(IPet pet) {
		pet.cry();
	}

}
