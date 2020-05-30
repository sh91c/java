package ex03;

public class TestMain {

	public static void main(String[] args) {
		// 객체 상속
		// 상속 : 공통되는 부분을 추출하여 부모클래스로 뺀다
		
		Person p1 = new Person();
		p1.name = "차은우";
		p1.tel  = "010-1111-1111";
		
		System.out.println(p1);
		
		Professor pr1 = new Professor();
		pr1.name = "소미";
		pr1.tel  = "010-2222-2222";
		pr1.subject = "음악";
		
		System.out.println(pr1);
		pr1.teaching();
		
		Student s1 = new Student();
		s1.name = "연우";
		s1.tel  = "010-3333-3333";
		System.out.println(s1);
		s1.study();
		
	}

}
