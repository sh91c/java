package ex10;

public class TestMain {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.name = "루미";
		cat.age  = 4;
		System.out.println(cat);
		cat.eat("캣닢");
		cat.meow();

		Dog dog = new Dog();
		dog.name = "리트리버";
		dog.age  = 14;
		System.out.println(dog);
		dog.eat("소갈비");
		dog.bark();
		
		Cow cow = new Cow();
		cow.name = "카우킹";
		cow.age  = 42;
		System.out.println(cow);
		cow.eat("인간");
		cow.moo();
		
		// 2월 19일 수요일 수업 시작
		
		// 다른 타입 객체는 저장안됨 : type 불일치
		// Cat cat = new Dog(); ..error..
		
		// casting : 타입을 바꾸는 작성법
		// 부모클래스이면 자식클래스의 인스턴스를 받을 수 있다.
		Animal anim = new Cat(); // casting 첫 번째 : 부모를 바꿀때 upCasting
		anim.name = "혼종은 아니고 뮤턴트";
		anim.eat("고기");
		Cat cat3 = (Cat) anim;  // casting 두 번째 : 다시 자식으로 바꿀때 downCasting
		cat3.meow();
		
		// Cat cat4 = new Animal(); -> type mismatch
		
		// Dog타입으로 캐스팅한 예제
		anim = new Dog(); // -> 위에서 Animal 타입으로 한번 선언했으니 anim만 작성
		anim.name ="강아지";
		anim.eat("beaf");
		Dog dog2 = (Dog) anim;
		dog2.bark();
		
		// 위 두개의 예시는 모두 Animal 클래스를 상속받은 자식 클래스가 있어야 가능함.
	}

}
