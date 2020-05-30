package ex01;

class Sachic2 {  //  class Sachic2 (extends Object)_생략; -> 내가 만든 메소드 외 자바의 객체에서 상속받은 것을 확인할 수 있다.
// 클래스 이름은 파일명과 같아야한다. -> public이 붙은 클래스를 말하는 것임.
// [public 클래스 이름] 은 1개만.
	public int add(int v1, int v2) {  //  관례적으로 메소드는 public를 전부 작성한다.
		return v1 + v2;
	}
	
	public int sub(int v1, int v2) {
		return v1 - v2;
	}
	public int mul(int v1, int v2) {
		return v1 * v2;
	}
	public int div(int v1, int v2) {
		return v1 / v2;
	}
	
}

public class Test04 {

	
	public static void main(String[] args) {

		int a= 7, b= 2;
		int c;
		
		Sachic2 s1 = new Sachic2();  //  분리한 클래스를 사용할 때. new 생성자 함수 사용. Sachic2로 만든 s1.
		c = s1.add(a, b);
		System.out.println(c);
		c = s1.sub(a, b);
		System.out.println(c);
		c = s1.mul(a, b);
		System.out.println(c);
		c = s1.div(a, b);
		System.out.println(c);
		
		
		
	}

}
