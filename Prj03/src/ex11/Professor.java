// 복습때 생성자 중점으로 보기
package ex11;

public class Professor extends Person{
	// field
	private String subject;
	
	
	
	// constructor
//	public professor() {}
	public Professor(String name, String tel) {
//		Person.name = name; // private이라 not visible임
//		tel = tel;
//		--> 그래서 부모생성자를 호출한다.
		super(name, tel); // 부모클래스에 생성자가 있어야 super 사용 가능
						  // super가 Person 생성자를 대신함. 클래스 이름이 아니라는 점!
	}
	
	public Professor(String name, String tel, String subject) {
		super(name, tel);
		this.subject = subject;
	}
	
	
	// method	
	public void teaching() {
		System.out.println(
				getName() + "교수님이 " + subject + "를 가르칩니다.");
	}
	

	
	// info()에 대해 이미 부모클래스 상속이 되어있음 -> 재정의(override)해야 함.
	// 새로 만들면 상속을 무시해버림
	@Override
	public void info() {
		super.info();
		System.out.println("과목: " + this.subject);
	} 
	
	
		
}
