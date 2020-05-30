package ex04;

public class CloneMain {

	public static void main(String[] args) {
		StudentCl s1 = new StudentCl("1","가",70,80,79);
		StudentCl s2 = new StudentCl("2","나",67,86,79);
		StudentCl s3 = new StudentCl("3","다",92,85,70);
		StudentCl s4 = new StudentCl("4","라",92,67,55);
		
		System.out.println("번호   이름   국어   영어   수학   총점   평균   등급"); 
		s1.disp();
		s2.disp();
		s3.disp();
		s4.disp();
	}

}
