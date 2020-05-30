package ex02;

public class TestMain {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.num = 1;
		s1.name = "채소";
		s1.jumsu = 100;
		Student s2 = new Student();
		s2.num = 2;
		s2.name = "수빈";
		s2.jumsu = 90;
		
		Student s3 = new Student(3, "아이", 80);
		
		s2.jumsu = s2.jumsu + 5;
		
		System.out.println("번호 이름 점수");
		System.out.println(s1.num + " " + s1.name + " " + s1.jumsu);
		System.out.println(s2.num + " " + s2.name + " " + s2.jumsu);
		System.out.println(s3.num + " " + s3.name + " " + s3.jumsu);
	}

}
