package ex03;

public class Professor extends Person {
	String subject;
	
	public void teaching() {
		System.out.println( name + "교수님이 " + subject + "을(를) 강의합니다.");
	}
	
}
