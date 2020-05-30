package ex04;
// 클래스 만들기 : 점수를 받아 총점 평균 등급 출력하기
public class StudentCl {
	// 필드
	String num, name;
	int kor, eng, mat;
	
	
	// 생성자

	public StudentCl(String num, String name, int kor, int eng, int mat) {
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	
	// 메소드
	public void disp() {
		int tot = this.kor + this.eng + this.mat;
		int avg = (int)(tot / 3.0 + 0.5);
		char grade = ' ';
		if(90 <= avg && avg <= 100)
			grade = 'A';
		else if(80 <= avg && avg < 90)
			grade = 'B';
		else if(70 <= avg && avg < 80)
			grade = 'C';
		else if(60 <= avg && avg < 70)
			grade = 'D';
		else if(50 <= avg && avg < 60)
			grade = 'E';
		else if(0 <= avg && avg < 50)
			grade = 'F';		
		String fmt = "   %s     %s     %d     %d    %d     %d     %d      %c\n";
		String msg = String.format(fmt, this.num, this.name, this.kor, this.eng, this.kor, tot, avg, grade);
		System.out.printf(msg);
//		String fmt = "%s님의 계좌 잔액은 %.3f원 입니다.";
//		String msg = String.format(fmt, name, money);
	}
}
