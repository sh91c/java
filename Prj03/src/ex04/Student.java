package ex04;

public class Student {
	// Fields
	private int num;
	private String name;
	private int kor, eng, mat;

	// Getter Setter (클래스 밖에서 안으로 들어오는 것)
	// 단축키 : 맥 알트+커멘드+s -> generate 게터세터 / 윈 : 알+쉬+s -> 게터세터생성
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	// Constructor
//	public Student() {} 기본 생성자 형태
//	this 는 자신의 클래스 내 필드를 가리키게 됌.
	public Student(int num, String name, int kor, int eng, int mat) {
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	

	// Method
	public int getTot() {
		int tot = this.kor + this.eng + this.mat;
		return tot;
	}

	public int getAvg() {
		int avg = (int) ((this.kor + this.eng + this.mat) / 3.0 + 0.5);
		return avg;
	}

	public char getGrade() {
		char[] grd = { 'F', 'F', 'F', 'F', 'F', 'F', 'E', 'D', 'C', 'B', 'A', 'A' };
		return grd[getAvg()/10];
	}

	public void dispScores() {
		System.out.printf("번호: %d 이름: %s 국어: %d 영어: %d 수학: %d 총점: %d 평균: %d 등급: %c\n", this.num, this.name, this.kor,
				this.eng, this.mat, getTot(), getAvg(), getGrade());
	}
}
