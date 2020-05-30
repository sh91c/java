package ex11;

public class Student extends Person{
	// field
	private int jumsu;
	private String subject;
	
	// constructor
	public Student() {};
	public Student(String name, String tel, String subject, int jumsu) {
		super(name,tel);
		this.subject = subject;
		this.jumsu = jumsu;
	}
		
	// method
	public void study() {
		System.out.println(super.getName() + "이(가) " + this.subject + "을(를) 공부 중입니다.");
	}
	public void testing() {
		System.out.println(super.getName() + "이(가)" + this.jumsu +"점을 받았습니다.");
	}
	
	@Override
	public void info() {
		super.info();
		System.out.println("점수: " + this.jumsu + "점");
	}
}
