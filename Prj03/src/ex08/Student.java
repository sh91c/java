package ex08;

public class Student {
	
	// 필드
	int      num;
	String   name;
	int      kor;
	int      eng;
	int      mat;
	int      tot;
	int      avg;
	char     grade;
	int      rank;
	
	// 생성자
	public Student(int num, String name, int kor, int eng, int mat) {
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	
	// 메소드
	public int getTot() {
		int tot = kor + eng + mat; 
		return tot;
	}
	
	public int getAvg() {
		int avg = (int)((kor + eng + mat) / 3.0 + 0.5);
		return avg;
	}
	
	public char getGrade() {
		int avg = (int)((kor + eng + mat) / 3.0 + 0.5);
		char grd = 0;
		if(90<= avg && avg <= 100) {
			grd = 'A';
		} else if(80<=avg && avg<90) {
			grd = 'B';
		} else if(70<=avg && avg<80) {
			grd = 'C';
		} else if(60<=avg && avg<70) {
			grd = 'D';
		} else if(50<=avg && avg<60) {
			grd = 'E';
		} else if(0<=avg && avg<50) {
			grd = 'F';
		}
		return grd;
	}
	
	
}
