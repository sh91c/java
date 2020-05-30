package ex04;

import java.util.Scanner;

public class Test02 {

	static String name;
	static int kor, eng, mat;
	static int tot, avg;
	
	public static void main(String[] args) {
		
//		String name;
//		int kor, eng, mat;
//		int tot;
		
		 input();
//		name = "채수빈";
//		kor = 100;
//		eng = 90;
//		mat = 80;
		
		 process();
//		tot = kor + eng + mat;
		
		 output();
//		System.out.println("이름: " + name);
//		System.out.println("총점: " + tot);
	}
	
		// 함수 만들기 : main()에 있던 지역변수들을 전역변수로 옮겨야함.(최상위 클래스로)
	public static void input() {
//		name = "채수빈";
//		kor = 100;
//		eng = 90;
//		mat = 80;
		
		//키보드로 입력받기
		Scanner in = new Scanner(System.in);
		System.out.println("다음을 입력해주세요.");
		System.out.print("이름: ");
		name = in.next();
		System.out.print("국어점수: ");
		kor = in.nextInt();
		System.out.print("영어점수: ");
		eng = in.nextInt();
		System.out.print("수학점수: ");
		mat = in.nextInt();
		
	}
	
	public static void process() {
		tot = kor + eng + mat;
//		avg = tot / 3;
		// 평균 반올림 처리(계산)
//		avg = (int) ((double) tot / 3.0 + 0.5);
		// 평균 반올림 처리(메소드)
		avg = round( tot / 3.0 );
	}
	
	public static int round( double num ) {
		int val = 0;
		val = (int)(num + 0.5);
		return val; // 리턴 값의 타입을 round() 앞에 작성
	}
	
	public static void output() {
		System.out.println("=-=-=-결과-=-=-=");
		System.out.println("이름: " + name);
		System.out.println("총점: " + tot);
		System.out.println("평균: " + avg);
	}
}
