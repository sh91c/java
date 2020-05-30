package ex02;

import java.util.Scanner;

public class test03_01 {

	public static void main(String[] args) {
		// 변수 준비
		String name = "";
		int birthYear, thisYear = 2020, age;
		int kor, eng, mat;
		double tot, avg;
//		int tot, avg;
		char grade = 0;
		
		// input
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름: ");
		name = sc.nextLine();
		System.out.print("출생년도: ");
		birthYear = sc.nextInt();
		System.out.println("지역코드를 입력해주세요.");
		System.out.print(" 10: 서울, 20: 부산, 30: 인천\n 40: 대전, 50: 대구 60: 광주\n 70: 제주\n입력: ");
		int sido = sc.nextInt();
		System.out.print("국어: ");
		kor = sc.nextInt();
		System.out.print("영어: ");
		eng = sc.nextInt();
		System.out.print("수학: ");
		mat = sc.nextInt();
		
		
		// process
			//sido
//		String address = "";
//		if(sido == 10 ) address = "서울";
//		else if(sido == 20 ) address = "부산";
//		else if(sido == 30 ) address = "인천";
//		else if(sido == 40 ) address = "대전";
//		else if(sido == 50 ) address = "대구";
//		else if(sido == 60 ) address = "광주";
//		else if(sido == 70 ) address = "제주"; -> switch 문법 사용하기.
		
		String address = "";
		switch(sido) {
			case 10: address  = "서울"; break;
			case 20: address = "부산"; break;
			case 30: address = "인천"; break;
			case 40: address = "대전"; break;
			case 50: address = "대구"; break;
			case 60: address = "광주"; break;
			case 70: address = "제주"; break;
			case 80:
			case 90:
			case 100:
				address = "잘못 입력된"; break;
			default : 
				address = "잘못 입력된"; break;
		};
		
			// age
		age = thisYear - birthYear + 1;
		
			// adult
		boolean adult = (age >= 19) ? true : false;
		
			// total
		tot = kor + eng + mat;
		
			// average
		avg = tot / 3;
		
			// grade
//		if(90 <= avg && avg <= 100) {
//			grade = 'A';
//		} else if (80 <= avg && avg < 90) {
//			grade = 'B';
//		} else if (70 <= avg && avg < 80) {
//			grade = 'C';
//		} else if (60 <= avg && avg < 70) {
//			grade = 'D';
//		} else if (0 <= avg && avg < 60){
//			grade = 'F';
//		} else {
//			System.out.println("점수를 잘못 입력했습니다.");
//		}
		int n = 0;
		if(avg < 0.0 || avg>100) {
			n = 0;
		} else {
			if(90 <= avg && avg <= 100) {
				n = 1;
			} else if (80 <= avg && avg < 90) {
				n = 2;
			} else if (70 <= avg && avg < 80) {
				n = 3;
			} else if (60 <= avg && avg < 70) {
				n = 4;
			} else if (0 <= avg && avg < 60) {
				n = 5;
			}
		};
		
		
		switch(n) {
		case 0: System.out.println("잘못 입력했습니다.");
		case 1: grade = 'A'; break;
		case 2: grade = 'B'; break;
		case 3: grade = 'C'; break;
		case 4: grade = 'D'; break;
		case 5: grade = 'F'; break;
		}
		
		// switch(avg/10) 정수 계산 가능
//		case 10 ~ 0 까지 A ~ F 등급을 할당
		
		//output
		System.out.println("이름: " + name);
		System.out.println("지역: " + address + "광역시");
		System.out.println("나이: " + age + "세");
		System.out.println("총점: " + tot + "점");
		System.out.println("평균: " + String.format("%.2f", avg) + "점");
		System.out.println("등급: " + grade);
	}

}
