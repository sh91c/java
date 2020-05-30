package ex04;

public class Test01 {
	
	// 함수 : function, 자바에서는 method라고 함.
	// method : 클래스 안에 있는 함수를 말함.
	// main() : 프로그램의 시작점과 끝 점을 결정한다.
	public static void main(String[] args) {
		// input();
		// process();
		// output();
		// 모든 프로그램은 입력 / 처리 / 출력으로 나누어져있다.
		
		input(); // 아래 함수를 만들었고, 호출하였음. 이하 동일.
		process();
		output();
		
		
	}
	
	public static void input() {
		System.out.println("데이터를 입력받는다.");
	}
	
	public static void process(){
		System.out.println("데이터를 처리한다.");
	}
	
	public static void output(){
		System.out.println("데이터를 출력한다.");
	}


}
