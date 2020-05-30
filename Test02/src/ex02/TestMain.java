package ex02;
// private - getter, setter
class Student{
	
	// 필드 
	private int    num;
	private String name;
	private int    score;
	
	
	// 생성자 : 객체를 new할 때 초기값을 할당해주는 역할
	public Student(int num, String name, int score) {
		this.num   = num;
		this.name  = name;
		
		if(0 <= score && score <= 100)
			this.score = score;
		else
			this.score = 0;
	}
	
	// 값을 꺼내는 Getter
	public int getNum() {
		return this.num;
	}

	public String getName() {
		return this.name;
	}

	public int getScore() {
		return this.score;
	}
	
	// 값을 저장하거나 변경할 때 사용하는 Setter
	public void setScore(int score) {
		if(0 <= score && score <= 100)
			this.score = score;
		else
			this.score = 0;
	}
	
	// 메소드
	
}

public class TestMain {

	public static void main(String[] args) {
		Student s2 = new Student(2, "은영", 100); // 생성자를 통해서 값을 입력하는 것만 가능함
		System.out.println(s2.getNum() + ", " + s2.getName() + ", " + s2.getScore());
//		System.out.println(s2.num + ", " + s2.name + ", " + s2.score); Getter 사용안한 예
		s2.setScore(s2.getScore() - 5);
		System.out.println(s2.getNum() + ", " + s2.getName() + ", " + s2.getScore());
		
//		Student s1 = new Student();
//		s1.num     = 1;
//		s1.name    = "태화";
//		s1.score   = 100;
//		System.out.println(s1.num + ", " + s1.name + ", " + s1.score);
		
	}

}
