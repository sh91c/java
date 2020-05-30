package ex13;

public class Student {  // 한 사람의 정보만 담을 수 있기때문에
						// 이 클래스에 sort 메소드를 만들지 않는다.
	// field
	private String name;
	private String tel;
	private int    byear;
	
	// getter : readonly속성  setter : read-write
	public String getName() {
		return name;
	}
	
	
	public String getTel() {
		return tel;
	}
	
	
	public int getByear() {
		return byear;
	}
	
	
	
	
	// constructor
	Student(String name, String tel, int byear){
		this.name = name;
		this.tel  = tel;
		this.byear= byear;
	}
	

	// method
	public void print() {
		System.out.printf("이름: %s 전화번호: %s 출생년도: %4d\n",this.name, this.tel, this.byear);
	}

	@Override
	public String toString() {
		return "[" + name + tel +  byear + "]";
	}
	
	
}
