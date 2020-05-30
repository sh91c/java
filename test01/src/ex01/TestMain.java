package ex01;

class Student {
	// 1. data : 데이터
	String  name = "";
	int 	kor, eng, mat;
	int 	tot, avg;
	
	
	// 기본생성자(오버로드 된 생성자가 있으면 기본생성자는 필수)
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	// 인자가 있는 생성자(=오버로드 된 생성자)
	public Student(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	
	// 3. method : 기능(함수)형태로 만들어야 함
	void calcTot() {
		tot = this.kor + this.eng + this.mat;
		
	}
	void calcAvg() {
		avg = this.tot / 3;
	}

	
	// s2 한번에 출력해보기 ( 알트 컨트롤 s > 제너럴 toString(); -> 모두 선택 )
	@Override
	public String toString() {
		calcTot();
		calcAvg();
		return "Student [name=" + name
				+ ", kor=" + kor
				+ ", eng=" + eng
				+ ", mat=" + mat
				+ ", tot=" + tot
				+ ", avg=" + avg + "]";
	}
	
}

public class TestMain {
	
	public static void main(String[] args) {
		
		System.out.println("테스트");
		
		// 2 클래스 틀 만듬
		Student s1 = new Student();
		Student s2 = new Student("채수빈", 90, 100, 80); // -> 생성자
		// 2.1 클래스 틀 안의 데이터를 정의함
		s1.name = "아이유";
		s1.kor  = 90; s1.eng  = 100; s1.mat  = 80;
		
		// 3. 계산(method)
//		int tot, avg;
//		tot = s1.kor + s1.eng + s1.mat;
//		avg = tot / 3;
		s1.calcTot();
		s1.calcAvg();
		// 4. 출력
		System.out.println("이름: " + s1.name);
		System.out.println("국어: " + s1.kor);
		System.out.println("영어: " + s1.eng);
		System.out.println("수학: " + s1.mat);
		System.out.println("총점: " + s1.tot);
		System.out.println("평균: " + s1.avg);
		
		System.out.println(s2.toString());
	}

}
