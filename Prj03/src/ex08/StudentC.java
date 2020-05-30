package ex08;
// 학생 1명에 대한 클래스
public class StudentC {
	// 필드
	String name;
	int num, kor, eng, mat, tot, avg, rank;
	char grade;
	
	// 생성자
	public StudentC(int num, String name, int kor, int eng, int mat) {
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	// 메소드
	public int getTot() {
		this.tot = this.kor + this.eng + this.mat;
		return this.tot;
	}
	
	public int getAvg() {
		this.avg = (int) (this.tot / 3.0 + 0.5);
		return this.avg;
	}
	
	public char getGrade() { 
		if( 90 <= this.avg && this.avg <= 100)
			this.grade = 'A';
		if( 80 <= this.avg && this.avg < 90)
			this.grade = 'B';
		if( 70 <= this.avg && this.avg < 80)
			this.grade = 'C';
		if( 60 <= this.avg && this.avg < 70)
			this.grade = 'D';
		if( 50 <= this.avg && this.avg < 60)
			this.grade = 'E';
		if( 0 <= this.avg && this.avg < 50)
			this.grade = 'F';
		return this.grade;
	}
}
