/* 
	입력 자료 :
	사번  , 이름 , 입사일     , 월급 , 보너스, 부서번호
	empid, name, hire_date, sal, comm, deptid 

	출력 자료 :
	출력 조건 : 입사일   -> 오름차순 정렬
                연차     -> years : 5년차 마다 추가 보너스: sal * 3 
	            연봉     -> payrank : 연봉순으로 등수 출력
                부서명   -> deptname -> 10: 인사, 20: 자제, 30: 총무, 40: 개발, 50: 서비스
           
                실수령: pay
                
                => 클래스를 사용하지 않고 코딩
*/

package emp_200221;

import java.util.Scanner;

public class TestMain {
	final static int n = 5; // 인원 수.. [상수 선언]
	// 입력을 위한 전역변수
	static String [] empid;
	static String [] name;
	static int [] hiredate;
	static double [] sal;
	static double [] comm;
	static String [] deptid;
	
	// 출력을 위한 전역변수
	static double[] pay;
	static String[] deptname;
	static int[] years;
	static int[] payrank;
	
	// 스위치-케이스 문을 사용하기 위한 변환변수
	static int did = 0;
	// 연차 계산용 변수
	static int thisYear = 20200221;
	// 부서별 정보 출력용: 부서번호, 부서명
	static String[] deptidList = new String[] { "10", "20", "30", "40", "50"};
	static String[] deptNameList = new String[] {"인사부","자제부","총무부","개발부","서비스"};
	// 부서 인원 수 카운트 담아낼 배열 1개 초기화
		// 순서대로 deptid = {10, 20, 30, 40, 50};
	static int[] people = new int[] { 0, 0, 0, 0, 0 };
	// 평균월급을 계산 값을 담기 위한 배열 1개
	static double[] avgPay = new double[n];
	// 최고 월급자 구하기
	static String[] highEmpName = new String[5];
	
	
	// 메인
	public static void main(String[] args) {
		input();
		process();
		output();

	}
	
	// 배열 선언 후 초기화
	private static void init_data() {
		// 입력용 
		empid    = new String[n];
		name     = new String[n];
		hiredate = new int[n];
		sal      = new double[n];
		comm	 = new double[n];
		deptid	 = new String[n];
		
		// 출력용 
		pay		 = new double[n];
		deptname = new String[n];
		years	 = new int[n];
		payrank	 = new int[n];
		
	}

	
	private static void input() {
		// deptid = 10: 인사, 20: 자제, 30: 총무, 40: 개발, 50: 서비스
		
		init_data();
		
		Scanner in = new Scanner(System.in);
		
			System.out.println("데이터를 입력하세요:");
			System.out.println("예시) 사번, 이름, 입사일, 월급, 보너스, 부서번호");
			// "100,King,19900223,300.5,400.0,10"
			for (int i = 0; i < n; i++) {
				System.out.printf("%d 번 입력: ", i+1);
				String inStr   = in.nextLine();
//				System.out.println(i + ": " + inStr);     // 어디서 에러가 난건지 디버깅
//				in.nextLine(); 엔터만 받으면 무시하도록.
				String[] token = inStr.split(",");    
//				System.out.println(i + ": " + token[i]);  // 에러 디버깅
				empid[i] 	   = token[0];
				name[i] 	   = token[1];
				hiredate[i]    = Integer.valueOf(token[2]);
				sal[i]		   = Double.valueOf(token[3]); // *문자열을 실수형으로 변환해서 받음.
				comm[i]		   = Double.valueOf(token[4]);
				deptid[i]	   = token[5];
				
		}		
	}



	private static void process() {
		// 실수령 계산
		for (int i = 0; i < n; i++) {
			pay[i] = sal[i] + comm[i];
		}
		double[] total = new double[5];
		
		// 부서명 출력
		// deptid = 10: 인사, 20: 자제, 30: 총무, 40: 개발, 50: 서비스
		for (int i = 0; i < n; i++) {
			did = Integer.valueOf(deptid[i]);
			switch(did) {
			case 10: deptname[i] = "인사부"; break;
			case 20: deptname[i] = "자재부"; break;
			case 30: deptname[i] = "총무부"; break;
			case 40: deptname[i] = "개발부"; break;
			case 50: deptname[i] = "서비스"; break;
			}
		}
		
		// 연차계산
		for (int i = 0; i < n; i++) {
			years[i] = (thisYear - hiredate[i]) / 10000 + 1;
		}
		
		// 연봉 순위
		for (int i = 0; i < n; i++) {
			payrank[i] = 1;
			for (int j = 0; j < n; j++) {
				if(sal[i] < sal[j]) {  // 월급을 비교
					++payrank[i];
				}
			}
		}

		// 부서 인원 수 카운트
		for (int i = 0; i < n; i++) {
			if(deptid[i].equals("10")) {
				++people[0];
			}else if(deptid[i].equals("20")) {
				++people[1];
			}else if(deptid[i].equals("30")) {
				++people[2];
			}else if(deptid[i].equals("40")) {
				++people[3];
			} else if(deptid[i].equals("50")) {
				++people[4];
			}
		}
		
		// 월급평균
	
}


	
		
	private static void output() {
		// 사원목록
		System.out.println("+===============================================+");
		System.out.println("|==================사원 목록====================|");
		System.out.println("+===============================================+");
		System.out.println("사번   이름      입사일       월급     보너스     실수령    부서명   연차   연봉순위");
		String format = "%4s %6s    %8s     %.2f      %.2f      %.2f   %4s     %2d          %d\n";
		String msg    = "";
		for (int i = 0; i < n; i++) {
			msg += String.format(format, empid[i], name[i], hiredate[i], sal[i], comm[i],
					pay[i], deptname[i], years[i], payrank[i] );
		}
		System.out.println(msg);
		
		
		// 부서별 정보
		// 부서번호, 부서이름, 인원수, 평균, 부서별 최고연봉
		System.out.println();
		System.out.println("+===============================================+");
		System.out.println("|==================부서별 정보==================|");
		System.out.println("+===============================================+");
		System.out.println("부서번호   부서명      인원 수       평균월급     최고월급자   최저월급자");
		String format2 = "      %2s   %3s          %3d         %.2f           %s\n"; //%d %d %d\n";
		String msg2    = "";
		for (int i = 0; i < n; i++) {
			msg2 += String.format(format2, deptidList[i], deptNameList[i], people[i], avgPay[i], highEmpName[i]);// highEmpName[i] lowerEmpName[i]);
		}
		System.out.println(msg2);

		
				
			
				
			
		
		
		
		
		
	}

}
