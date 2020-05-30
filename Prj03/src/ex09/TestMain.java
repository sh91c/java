package ex09;

public class TestMain {

	public static void main(String[] args) {
		Cat cat  = new Cat();
		cat.name = "개냥이";
		cat.age  = 4;
		System.out.println(cat);
		cat.eat("생선");
		cat.meow();
		
		Dog dog  = new Dog();
		dog.name = "리트리버";
		dog.age  = 3;
		System.out.println(dog);
		dog.eat("소갈비");
		dog.bark();
	
		Cow cow = new Cow();
		cow.name = "카우킹";
		cow.age  = 7;
		System.out.println(cow);
		cow.eat("인간");
		cow.moo();
	}

}
