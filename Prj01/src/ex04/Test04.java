package ex04;

import java.util.Scanner;

public class Test04 {

	// 부서번호를 입력받아 부서명을 출력
	// 10 : 인사부_서울, 20: 자제부_부산, 30: 총무부_대전, 40: 기술부_대구
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int deptNo;
		
		System.out.println("부서번호를 입력하세요: ");
		System.out.println("10 : 인사부, 20: 자제부, 30: 총무부, 40: 기술부");
		System.out.print("입력: ");
		deptNo = in.nextInt();
		
		String deptName;
		deptName = getDeptInfo(deptNo);
		
		System.out.println(deptName);

	}

	private static String getDeptInfo(int deptNo) {
		String dName = "";
		String dAddr = "";
		switch(deptNo) {
		case 10: 
			dName = "인사부";
			dAddr = "서울";
			break; 
		case 20:
			dName = "자재부";
			dAddr = "부산";
			break;
		case 30:
			dName = "총무부";
			dAddr = "대전";
			break;
		case 40:
			dName = "기술부";
			dAddr = "대구";
			break;
			
		default : System.out.println("잘못된 입력입니다.");
		}
		
		return dName + ", " + dAddr; // 꼼수 : 문자열+문자열+..+문자열 방법으로 리턴 총 1개.
	}
	
	

}
