package ex06_200224;

import java.util.Scanner;

public class TestMain {
// 입력 한 줄(사람 한명에 대한 정보) -> 출력 한 줄 
// 입력 데이터 : 사번 이름 입사일 월급 부서번호
// 부서번호 10:인사부, 20: 자재부, 30: 총무부, 40: 개발부 50: 지원부
// 수령액은 월급과 보너스를 합한 금액이다.
// 보너스는 연차에 따라 월급의 0.5로 계산한다.

// 출력 데이터 : 사번 이름 입사일 월급 보너스 실수령액 부서명
	
// 입력 변수 : empId, empName, hiredate, sal, deptId
// 출력 변수 : empId, empName, hiredete, sal, 		 bonus, pay, deptName
	
// 입력된 데이터 샘플 테스트
/*
100,A,20010101,300.0,10
200,B,20070101,240.0,20
300,C,20070101,240.0,30
400,D,20090101,180.0,40
500,E,20120101,150.0,50
600,F,20170101,120.0,20
*/
	static final int ROWS = 6;
	// 입력 변수 작성 empId, empName, hiredate, sal, deptId
	static String [] empId;
	static String [] empName;
	static String [] hiredate;
	static double [] sal;
	static String [] deptId;
	
	// 출력 변수 작성 empId, empName, hiredete, sal, bonus, pay, deptName
	static double [] bonus;
	static double [] pay;
	static String [] deptName;
	static int    [] rank;
	
	static double totSal	= 0;
	static double totBonus  = 0;
	static double totPay    = 0;

	public static void main(String[] args) {
		input();
		
		process();
		
		output();
	}


	private static void init_data() {
		// 변수들에 대한 초기화 입: empId, empName, hiredate, sal, deptId / 출: bonus, pay, deptName
		empId    = new String[ROWS];
		empName  = new String[ROWS];
		hiredate = new String[ROWS];
		sal      = new double[ROWS];
		deptId   = new String[ROWS];
		
		bonus    = new double[ROWS];
		pay		 = new double[ROWS];
		deptName = new String[ROWS];
		
		rank     = new int[ROWS];
		
	}
	
	private static void input() {
		System.out.println("====== input() ======");
		init_data();
		
		// 키보드 입력
		Scanner in = new Scanner(System.in);
		
		System.out.println("사번, 이름, 입사일, 월급, 부서번호를 입력하세요.");
		for (int i = 0; i < ROWS; i++) {
			System.out.print(i+1 + "번 입력: ");
			String line   = in.nextLine();
			String [] str = line.split(",");
			
			empId[i]	= str[0].trim();
			empName[i]  = str[1].trim();
			hiredate[i] = str[2].trim();
			sal[i]      = Double.valueOf(str[3].trim());
			deptId[i]   = str[4].trim();
		}
		
	}

	private static void process() {
		System.out.println("====== process() ======");
		// 수령액 : 월급 + 보너스
		// 보너스 : 연차에 따라 월급의 0.5로 계산
		// 부서번호 : 10 인사, 20 자재, 30 총무, 40 개발, 50 서비스
		for (int i = 0; i < ROWS; i++) {
			int inYear  = Integer.valueOf(hiredate[i].substring(0,4));
			int years   = 2020 - inYear;
			bonus[i]    = years * (sal[i] * 0.5);
			pay[i]      = sal[i] + bonus[i];
			switch(deptId[i]) {
				case "10" : deptName[i] = "인사부"; break;
				case "20" : deptName[i] = "자재부"; break;
				case "30" : deptName[i] = "총무부"; break;
				case "40" : deptName[i] = "개발부"; break;
				case "50" : deptName[i] = "지원부"; break;
			}
			totSal += sal[i];
			totBonus += bonus[i];
			totPay += pay[i];
			}
			

//			hiredate_sort_asc(); // 입사날 기준 오름차순 정렬
			pay_sort_desc(); // 실 수령액 기준 내림차순 정렬
			totPayRank(); // 실 수령액 석차 내기
		
		}
		

	private static void totPayRank() {
		rank[0] = 1;
		for (int i = 1; i < ROWS; i++) {
			if(pay[i] == pay[i-1]) {
				rank[i] = rank[i-1];
			}else {
				rank[i] = i+1;
			}
		}
		
	}


	private static void pay_sort_desc() {
		int n = ROWS;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if(pay[j] < pay[j+1]) {
					exchange(j, j+1);
				}
			}
		}
		
	}


	private static void exchange(int p1, int p2) {
		// 배열 p1(j) <-> p2(j+1) 교환 작업
//		입: empId, empName, hiredate, sal, deptId / 출: bonus, pay, deptName
		String tempStr = "";
		double tempNum = 0.0;
		
		tempStr = empId[p1];
		empId[p1] = empId[p2];
		empId[p2] = tempStr;

		tempStr = empName[p1];
		empName[p1] = empName[p2];
		empName[p2] = tempStr;
		
		tempStr = hiredate[p1];
		hiredate[p1] = hiredate[p2];
		hiredate[p2] = tempStr;
		
		tempNum = sal[p1];
		sal[p1] = sal[p2];
		sal[p2] = tempNum;
		
		tempStr = deptId[p1];
		deptId[p1] = deptId[p2];
		deptId[p2] = tempStr;
		
		tempNum = bonus[p1];
		bonus[p1] = bonus[p2];
		bonus[p2] = tempNum;
		
		tempNum = pay[p1];
		pay[p1] = pay[p2];
		pay[p2] = tempNum;
		
		tempStr = deptName[p1];
		deptName[p1] = deptName[p2];
		deptName[p2] = tempStr;
		
	
	}


	private static void output() {
		// 출력 empId, empName, hiredate, sal, deptId bonus, pay, deptName
		System.out.println("====== output() ======");
		head();
		title();
		
		
		String msg = "";
		for (int i = 0; i < ROWS; i++) {
			msg += String.format("%s     %s %s   %05.3f   %05.3f  %05.3f   %s          %d\n", empId[i], empName[i], hiredate[i], sal[i], bonus[i], pay[i], deptName[i], rank[i]);
		}
		msg += "월급 총계: " + totSal + "\n";
		msg += "보너스 총계: " + totBonus + "\n";
		msg += "실수령액 총계: " + totPay + "\n";
		System.out.println(msg);
	}


	private static void head() {
		System.out.println("+===================================================+");
		System.out.println("+======================월급목록=====================+");
		System.out.println("+===================================================+");
		
	}


	private static void title() {
		System.out.println("사번 이름   입사일      월급     보너스    수령액   부서명  수령액_석차");
	} 

}
