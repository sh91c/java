package ex14;

public class TestMain {

	public static void main(String[] args) {
		Cat cat1  = new Cat();
		cat1.name = "루미";
		cat1.climb();
		cat1.cry();
		
		Dog dog1 = new Dog();
		dog1.name = "웰시코기";
		dog1.swim();
		dog1.cry();

		life(dog1, "참치");
		life(cat1, "참치");
		
		// abstract class는 new 생성자 사용 불가능.
//		Animal beast = new Animal(); 공통된 코드를 모아놓은 역할만 했음.
		
	}

	private static void life(Animal pet, String food) {
		if(pet instanceof Cat)
			((Cat)pet).climb();
		else if(pet instanceof Dog)
			((Dog)pet).swim();
		
	}
}
