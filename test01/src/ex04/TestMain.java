package ex04;

public class TestMain {

	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.name = "논다";
		dog1.age  = 4;
		dog1.eat();
		dog1.bark();
		
		Cat cat1 = new Cat();
		cat1.name = "미로";
		cat1.age  = 1;
		cat1.eat();
		cat1.meow();
		
		Animal an1 = new Animal();
		an1.name   = "흑우";
		an1.age    = 6;
		an1.eat();
		
		// 자식 클래스의 내용을 부모클래스에 대입할 수 있지만
//		an1 = dog1;
//		an1.eat();
//		Dog newDog = dog1;
		// 자식 클래스끼리는 대입을 할 수 없다.
//		newDog = cat1;
		// 부모 클래스를 자식 클래스에 대입하려면 캐스팅해야함
//		newDog = (Dog) an1; 
//		newDog.eat(); // -> 결과는 newDog으로 나옴
		
		// ** 키포인트 **
		System.out.println("=================");
		animal_eat(an1);
		animal_eat(dog1);
		animal_eat(cat1);
		
	}

	private static void animal_eat(Animal animal) {
		animal.eat();
		// 부모클래스에 자식 클래스를 들고옴, instanceof를 사용해서
		if(animal instanceof Dog)
			((Dog) animal).bark();
		if(animal instanceof Cat)
			((Cat) animal).meow();
		// 객체 상속의 다형성을 나타냄
	}

}
