package ex02;

class Student {
	int num;
	String name;
	int kor, eng, mat;
}

public class TestMain {

	public static void main(String[] args) {
		Student s01 = new Student();

		s01.num = 1;
		s01.name = "아이유";
		s01.kor = 100;
		s01.eng = 90;
		s01.mat = 80;
		
		int tot = s01.kor + s01.eng + s01.mat;
		int avg = (int)(tot / 3.0 + 0.5);
		System.out.printf("번호: %4d 이름: %4s 총점: %4d 평균: %4d", s01.num, s01.name, tot, avg);

	}

}
