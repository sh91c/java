package ex02;

public class Student {
	// fields : 속성 = (레코드 : 여러 다른 타입의 변수들의 집합)
	int num;
	String name;
	int jumsu;
	
	// Getter, Setter
	
	// 생성자 : constructor
	// 객체를 new 할 때 객체의 field 변수의 초기값을 지정
	public Student() {}
	
	
	public Student(int num, String name, int jumsu) {
		this.num = num;
		this.name = name;
		this.jumsu = jumsu;
	}

	
	// method : 기능 
	
}
