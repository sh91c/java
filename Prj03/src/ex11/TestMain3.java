package ex11;

public class TestMain3 {

	public static void main(String[] args) {
		Professor p1 = new Professor("채수빈", "010-2222-2222");
		((Person)p1).info();
//		p1.teaching();
		
		System.out.println();
		
		Professor p2 = new Professor("Dean", "010-3333-3333", "R&B");
		p2.info();
		p2.teaching();
		
		System.out.println();
		
		// *** 연습 문제 *** //
		Student s1 = new Student("크러쉬", "010-4444-4444", "보컬", 100);
		s1.study();
		s1.info();
		
		
		
		
	}

}
