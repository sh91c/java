package ex02;

import java.util.Scanner;

public class test03 {

	public static void main(String[] args) {
		// 다중선택.
		// VIP: point가 10000점 이상.
		// 정회원: point가 5000점 이상.
		// 준회원: point가 1000점 이상.
		
		String name = "";
		double point = 0;
		double korean, eng, math = 0;
		String grade = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력해주세요: ");
		name = sc.next();
		System.out.print("국어 점수를 입력해주세요: ");
		korean = sc.nextDouble();
		System.out.print("영어 점수를 입력해주세요: ");
		eng = sc.nextDouble();
		System.out.print("수학 점수를 입력해주세요: ");
		math = sc.nextDouble();
		
		point = (korean + eng + math) / 3;
		
//		if(point >= 10000) {
//			grade = "VIP 회원";
//		} else if(point >= 5000) {
//			grade = "정회원";
//		} else {
//			grade = "준회원";
//		}
		
//		if (point > 100) {
//			System.out.println("100점 이하의 점수만 입력하세요.");
//			point = sc.nextInt();
//		} 
		if (point >= 90) {
			grade = "A";
		} else if (point >= 80) {
			grade = "B";
		} else if (point >= 70) {
			grade = "C";
		} else if (point >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		
		System.out.println(name + "님은 " + String.format("%.2f", point) +"점으로, " + grade + "입니다.");

	}

}