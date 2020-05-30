package ex08;
// 학생 다수에 대한 클래스
public class StudentsC {
	// 필드
	StudentC [] students;					// 이 부분 이해안됌.
	
	// constructor
	public StudentsC(StudentC[] students) { // 이 부분 이해안됌.
		this.students = students;
	}
	public StudentsC() {}
	
	
	// method
	public void makeRank(StudentC[] students) {
		for (int i = 0; i < students.length; i++) {
			students[i].rank = 1;
			for (int j = 0; j < students.length; j++) {
				if(students[i].getTot() < students[j].getTot()) {
					++students[i].rank;
				}
			}
		}
	}
	
	
	public void output(StudentC [] students) {
		System.out.println("번호===이름===국어===영어===수학===총점===평균===등급===석차");
		String format = "%d     %s   %3d     %3d    %3d   %3d     %d      %c      %d";
		for (int i = 0; i < students.length; i++) {
			String msg = String.format(format, students[i].num, students[i].name,
					students[i].kor, students[i].eng, students[i].mat, students[i].getTot(),
					students[i].getAvg(), students[i].getGrade(), students[i].rank);
			System.out.println(msg);
		}
	}
}
