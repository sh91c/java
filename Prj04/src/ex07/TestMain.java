package ex07;

import java.util.Scanner;

public abstract class TestMain {
	// 입력을 ROWS N줄 입력 -> 5줄의 통계 COLS을 출력
	// 입력: 부서번호, 이름,    월급
	//       inDeptId,   empName,  sal
/*
10, A, 100
10, B, 250
10, C, 200
20, D, 300
40, E, 350
40, F, 270
40, G, 280
 */
	
	// 출력: 부서번호, 부서명,    월급합계, 최저월급, 최고월급, 최저월급자, 최고월급자
/*           outDeptId,   deptName,    sumSal,  minSal ,  maxSal , minSalName, maxSalName
 				   10  인사부       550       100       250           A           B
 				   20  자재부		300		  300       300			  C   	 	  C
 				   30  총무부		  0         0         0           
 				   40  개발부       620		  270		350			  F           E
 				   50  지원부		  0         0         0        
 */
	final static int ROWS = 7; // 입력 자료 수(직원 수 만큼)
	final static int N    = 5; // 출력(부서) 수
	
	// 입력 변수 생성
	static String [] inDeptId;  // 입력된 자료 수 많큼 생성되어야 함.(ROWS만큼)
	static String [] empName;
	static double [] sal;
	// 출력 변수 생성
	static String [] outDeptId; // 출력되는 자료 수는 5개임
	static String [] deptName;
	static double [] sumSal;
	static double [] minSal;
	static double [] maxSal;
	static String [] minSalName;
	static String [] maxSalName;
	
	// 추가 : 부서별 인원 출력, 부서별 평균 월급, 회사 전체 월급
	static int    [] deptEmp;
	static double [] deptAvgSal;
	static double    totSumSal;
	static double    compMaxSal;
	static double    compMinSal;
	static String    compMaxSalName;
	static String    compMinSalName;
	
	public static void main(String[] args) {
		
		input();
		process();
		output();
		
	}

	private static void input() {
		init_data();
		
		System.out.println("데이터를 입력해주세요.");
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < ROWS; i++) {
			System.out.print(i+1 + "번 입력: ");
			String line = in.nextLine();
			String [] str = line.split(",");
			
			inDeptId[i] = str[0].trim();
			empName[i] = str[1].trim();
			sal[i] = Double.valueOf(str[2].trim());			
		}
		
	}

	private static void init_data() {
		// 입력
		inDeptId = new String[ROWS];
		empName  = new String[ROWS];
		sal		 = new double[ROWS];
		
		// 출력
		outDeptId = new String[N];
		deptName  = new String[N];
		sumSal    = new double[N];
		minSal    = new double[N];
		maxSal    = new double[N];
		minSalName    = new String[N];
		maxSalName    = new String[N];
		
		// 추가: 부서별 인원 수, 부서별 평균 월급, 회사 전체 월급
		deptEmp    = new int[N];
		deptAvgSal = new double[N]; 
		totSumSal  = 0.0;
		compMaxSal = sal[0];
		compMinSal = sal[0];
		compMaxSalName = "";
		compMinSalName = "";
		
		// data 초기화
		outDeptId[0] = "10";
		outDeptId[1] = "20";
		outDeptId[2] = "30";
		outDeptId[3] = "40";
		outDeptId[4] = "50";
		
		deptName[0]  = "인사부";
		deptName[1]  = "자재부";
		deptName[2]  = "총무부";
		deptName[3]  = "개발부";
		deptName[4]  = "지원부";
		
		for (int i = 0; i < N; i++) {
			sumSal[i]     = 0.0;
			minSal[i] 	  = 0.0;
			maxSal[i] 	  = 0.0;
			minSalName[i] = "";
			maxSalName[i] = "";
		}
		
	}

	private static void process() {
		int pos = 0; // 각 부서에 저장될 위치
		for (int i = 0; i < ROWS; i++) { // 입력된 데이터 수 만큼
			switch(inDeptId[i]) {
			case "10": pos = 0; break; 
			case "20": pos = 1; break; 
			case "30": pos = 2; break; 
			case "40": pos = 3; break; 
			case "50": pos = 4; break; 
			}
			
			// 최소, 최대 월급 및 월급자 이름 처리
			if(sumSal[pos] == 0) {
				 minSal[pos] = sal[i];
				 minSalName[pos] = empName[i];
				 maxSal[pos] = sal[i];
				 maxSalName[pos] = empName[i];
				 
			} else { 
			if( sal[i] < minSal[pos]) {
				 minSal[pos] = sal[i];
				 minSalName[pos] = empName[i];
				}
			if( sal[i] > maxSal[pos]) {
				 maxSal[pos] = sal[i];
				 maxSalName[pos] = empName[i];
			 	}
			}
			sumSal[pos] = sumSal[pos] + sal[i]; 
			
			
			int cnt = 0;
			if(sal[pos] > 1)
			{	
				++cnt;
				deptEmp[pos] += cnt;  // 부서별 인원수
				deptAvgSal[pos] = sumSal[pos] / deptEmp[pos];  // 부서별 평균월급
			}
			
			 
		}
		// 회사 전체 월급
		for (int i = 0; i < N; i++) {
			 totSumSal += sumSal[i]; 
		}
		
		// 회사 전체 최대 최저 월급여 및 이름
		for (int i = 0; i < N; i++) {
			if(sal[i] == 0) {
			compMinSal = sal[i];
			compMaxSal = sal[i];
			compMinSalName = empName[i];
			compMaxSalName = empName[i];
			} else { 
				if( sal[i] < compMinSal) {
					compMinSal = sal[i];
					compMinSalName = empName[i];
					}
				if( sal[i] > compMaxSal) {
					compMaxSal = sal[i];
					compMaxSalName = empName[i];
				 	}
			}
		}
	}

	private static void output() {
		String head = "================ 부서별 최저월급 최고월급 ================\n";
		String title  = "부서번호 부서명 월급합계 최저월급 최고월급 최저월급자 최고월급자 부서별인원 부서별평균월급\n";
		String fmt   = "      %s %s  %.3f  %.3f %.3f          %s          %s           %d        %.3f\n";
		String msg   = head + title;
		for (int i = 0; i < N; i++) {
			msg += String.format(fmt, outDeptId[i],   deptName[i],    sumSal[i],  minSal[i] ,  maxSal[i] , minSalName[i], maxSalName[i], deptEmp[i], deptAvgSal[i]);			
		}
		System.out.println(msg);
		System.out.println("회사 전체 월급 : " + totSumSal);
			System.out.println("회사 최고 월급자의 월급여: " + compMaxSal + "이름: " + compMaxSalName);
			System.out.println("회사 최저 월급자의 월급여: " + compMinSal + "이름: " + compMinSalName);			
	}

}