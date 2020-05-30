package io2_homework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Company{
	// 필드
	int num;
	String name;
	int sal;
	int bonus;
	int jYear;
	int dNum;  // 사번, 이름, 월급, 보너스, 입사년도, 부서번호
	
	// constructor
	public Company(int num, String name, int sal, int bonus, int jYear, int dNum) {
		super();
		this.num = num;
		this.name = name;
		this.sal = sal;
		this.bonus = bonus;
		this.jYear = jYear;
		this.dNum = dNum;
	}
	
	// 근속년수
	public int getCyear(){
		return (2020 - this.jYear) + 1;
	}
	// 총수령액 = 월급 + 보너스 + 근속년수 * 0.5);
	public double getAllMoney() {
		return this.sal + this.bonus + getCyear() * 0.5;
	}
	// 부서명 문자열 출력
	public String getDname() {
		String Dname = "";
		switch (this.dNum) {
		case 10:
			Dname = "인사부";
			break;
		case 20:
			Dname = "자재부";
			break;
		case 30:
			Dname = "연구부";
			break;
		case 40:
			Dname = "총무부";
			break;

		default:
			System.out.println("잘못된 입력입니다.");
			break;
		}
		return Dname;
	}
	
	// override 출력 관련
	@Override
	public String toString() {
		String fmt = "%4d   %4s     %5.2f    %6d년차    %s\n"; // 사번 이름 총수령액 근속년수 부서명
		String msg = String.format(fmt, this.num, this.name, getAllMoney(), getCyear(), getDname());
		return msg;
	}
	
}

public class FileWriterCompany {

	public static void main(String[] args) throws IOException {
		File file = new File("/Users/choi/Documents/PKNU/java/Test03/src/io2_homework/result.txt");
		
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		
		// 입력.. 부서번호 10: 인사, 20: 자재, 30: 연구, 40: 총무
		Scanner in = new Scanner(System.in);
		System.out.print("사번, 이름, 월급, 보너스, 입사년도, 부서번호를 입력해주세요 :\n부서번호: 10(인사), 20(자재), 30(연구), 40(총무)\n");
		System.out.print("입력 종료를 원하시면 exit를 입력해주세요.\n");
		bw.write("사번   이름    총수령액      근속년수    부서명\n");	// 파일 기본 출력내용
		
		// 카운트, 합계시작 : 부서별 인원수, 회사 인원, 부서별 월급 총액, 회사 전체 월급 총액
		int    [] dPeople   = {0, 0, 0, 0}; // 인사 자제 연구 총무 순
		double [] dSal      = {0.0, 0.0, 0.0, 0.0};
		int       totPeople = 0;
		double    totSal    = 0;
		
		// 무한 루프
		while(true) {
			String inputLine = in.nextLine();
			
			if(inputLine.equalsIgnoreCase("exit")) break; // 무한루프 탈출
			
			String []    str	=  inputLine.split(",");
			int   	     num	=  Integer.valueOf(str[0].trim());
			String       name	=  str[1].trim();
			int          sal	=  Integer.valueOf(str[2].trim());
			int          bonus	=  Integer.valueOf(str[3].trim());
			int          jYear	=  Integer.valueOf(str[4].trim());
			int          dnum	=  Integer.valueOf(str[5].trim());
			
			Company      c1     =  new Company(num, name, sal, bonus, jYear, dnum);

			totPeople++;
			totSal += sal + bonus + (2020 - jYear  +1) * 0.5;
			
			if(dnum == 10) {
				dPeople[0]++;
				dSal[0] += sal;
			}
			else if(dnum == 20){
				dPeople[1]++;
				dSal[1] += sal;
			}
			else if(dnum == 30){
				dPeople[2]++;
				dSal[2] += sal;
			}
			else if(dnum == 40){
				dPeople[3]++;
				dSal[3] += sal;
			}
			
			
			// 출력
			String msg = c1.toString();
			bw.write(msg);
		}
		// 무한루프 끝
		
		// 카운트, 합계 출력 : 부서별 인원수, 회사 인원, 부서별 월급 총액, 회사 전체 월급 총액
		String fmt = "================================================\n"
				+ "임직원 총 인원: %d명\n임직원 월급 총액: %.2f\n"
				+ "================================================\n"
				+ "인사부 총 인원 및 월급 총액: %d명, %.2f\n"
				+ "자재부 총 인원 및 월급 총액: %d명, %.2f\n"
				+ "연구부 총 인원 및 월급 총액: %d명, %.2f\n"
				+ "총무부 총 인원 및 월급 총액: %d명, %.2f\n"
				+ "================================================\n";
		String msg = String.format(fmt, totPeople, totSal, 
				dPeople[0], dSal[0], dPeople[1], dSal[1], dPeople[2], dSal[2], dPeople[3], dSal[3]);
		bw.write(msg);
		
		
		bw.close();
		fw.close();
		
		System.out.println(file.getName() + "이 작성되었습니다.");
	}

}
