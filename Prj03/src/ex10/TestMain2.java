package ex10;
// ************* 다형성 ************* //

// 하나의 함수만 가지고 여러개의 ~~
public class TestMain2 {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.name = "길냥이";
		
		Dog dog = new Dog();
		dog.name = "리트리버";
		
		// cat과 dog를 넣으면 *.eat이 실행되도록 하기
		animal_eat(cat);  // cat 타입을 아래 Animal타입으로 넣음.
		animal_eat(dog);  // dog 타입을 아래 Animal타입으로 넣음.
	
		// cat, dog의 부모는 animal.. -> animal_eat을 하나로 만들어 볼 수 없을까
		Cow cow = new Cow();
		cow.name = "카우킹";
		
		animal_eat(cow);  // Cow 타입을 아래 Animal타입으로 넣음.
	
	}
//	private static void animal_eat(Dog dog) {
//		dog.eat("참치");
//		
//	}
//
//	private static void animal_eat(Cat cat) {
//		cat.eat("캣닢");
//		
//	}
	
	//  -->> 이렇게 만들래

	private static void animal_eat(Animal beast) {
		beast.eat("참치");
//		((Dog)beast).bark();  // 이건 dog만 가능하기 때문에 cat, cow 안됨.
//		-->> 이렇게 만들래
		if(beast instanceof Dog) // beast가 인스턴스 Dog 이면,
			((Dog)beast).bark();
		if(beast instanceof Cat) // beast가 인스턴스 Cat 이면,
			((Cat)beast).meow();
		if(beast instanceof Cow) // beast가 인스턴스 Cow 이면,
			((Cow)beast).moo();
	}

}
