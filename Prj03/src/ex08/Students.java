//package ex08;
//
//public class Students {
//	// 필드
//	Student [] students;
//	
//	// 생성자
//	
//	public Students(Student[] students) {
//		this.students = students;
//	}
//
//
//	public Students() {
//		// TODO Auto-generated constructor stub
//	}
//
//
//	// 메소드
//	public void output() {
//		String msg = "";
//		for (int i = 0; i < students.length; i++) {
//			msg += students[i].num + ". " + students[i].name 
//					+ ", " + students[i].kor + ", " 
//					+ students[i].eng + ", " + students[i].mat
//					+ "\n";
//		}
//		System.out.println(msg);
//	}
//	public void output(Student [] students) {
//		String msg = "";
//		for (int i = 0; i < students.length; i++) {
//			msg += students[i].num + ". 이름 : " + students[i].name 
//					+ " 국어:  " + students[i].kor + " 영어: " 
//					+ students[i].eng + " 수학: " + students[i].mat
//					+ "\n";
//		}
//		System.out.println(msg);
//	}
//	
//}
package ex08;

public class Students {
	// 필드
	Student [] students;
	
	// 생성자
	public Students(Student[] students) {
		this.students = students;
	}
	// 기본 생성자 : 변수 생성시 초기값 설
	public Students() {
	}
	
	
	// 메소드
		// 석차 계산
	public void makeRank(Student [] students) {
		for (int i = 0; i < students.length; i++) {
			students[i].rank = 1;
			for (int j = 0; j < students.length; j++) {
				if( students[i].getTot() < students[j].getTot() ) {
					++students[i].rank;
				}
			}
		}
	}
		// 출력
	public void output(Student [] students) {
		String format = "";
		String msg = "";
		System.out.println("번호   이름   국어   영어   수학   총점   평균   등급   석차");
		format = "  %2d %3s    %3d    %3d    %3d    %3d    %3d     %2c     %2d";
		for (int i = 0; i < students.length; i++) {
			msg = String.format(format, students[i].num, students[i].name, students[i].kor, students[i].eng, students[i].mat,
					students[i].getTot(), students[i].getAvg(), students[i].getGrade(), students[i].rank);
			System.out.println(msg);
		}
	}
	
}

