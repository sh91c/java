package ex02;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// 키보드로 데이터를 입력받는 방법 작성
		
		// 입력받을 준비.. 모든 장치는 file과 같이 취급한다.
		Scanner sc = new Scanner(System.in);
		
		String name;
		int	age;
		int score;
		// score가 60점 이상이면 Pass, 미만면 fail을 출력.
		
		System.out.print("이름: ");
		name = sc.next();
		System.out.print("나이: ");
		age = sc.nextInt();
		System.out.print("점수: ");
		score = sc.nextInt();
		
		String result =""; //빈 문자열
		if(score >= 60) {
			result = "PASS";
		} else {
			result = "FAIL";
		}
		
		System.out.println("당신의 이름은 " + name + "이고 나이는 " + age +"입니다.");
		System.out.println(name + "님의 결과는 " + result + "입니다.");

	}

}
