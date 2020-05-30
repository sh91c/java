package ex05;

class Student {
	
}

public class TestMain {

	public static void main(String[] args) {
		// String[] args : main 함수의 인자 처리 = 명령형 인자 처리
		// package explorer -> ex05 -> TestMain.java 파일 우클릭
		// run as  -> run configurations
		// -> arguements 탭에 인자 입력 : 공백으로 분리
		for (int i = 0; i < args.length; i++) {
			System.out.println(i + ":" + args[i]);
		}
		
		
		Object obj = new Object();
		System.out.println(obj);
		
		Student s1 = new Student();
		System.out.println(s1);
		Student s2 = new Student();
		System.out.println(s2);
	}

}
