package ex06;

import java.util.Scanner;

// 이름, 점수를 입력받아 총점과 평균 출력하기
// 예시 : 1, 정연, 100, 100, 100 (점수는 국 영 수)
public class Practice {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// 입력
		System.out.println("4명의 총점과 평균을 계산합니다.");
		System.out.println("순번(숫자), 이름과 국어, 영어, 수학 점수를 입력하세요.");
		System.out.println("예시: 순번(숫자),이름,(국어점수)100,(영어점수)90,(수학점수)80");
		String [] student = new String [4];
		for (int i = 0; i < student.length; i++) {
			System.out.print("입력: ");
			student[i] = in.nextLine();
		}
		
		// 처리
		int sNum = 0;
		String sName = "";
		int kor, eng, mat = 0;
		int tot = 0;
		int avg = 0;
		for (int i = 0; i <= student.length; i++) {
			String s1= student[i];
			String [] s2 = s1.split(",");
			sNum  = Integer.valueOf(s2[j]);
			sName = s2[j];
			kor   = Integer.valueOf(s2[j]);
			eng   = Integer.valueOf(s2[j]);
			mat   = Integer.valueOf(s2[j]);
			tot   = kor + eng + mat;
			avg   = tot / 3;
				System.out.printf("번호: %3d 이름: %S 총점: %3d 평균: %3d", sNum, sName, tot, avg);
		}
		// 2차 배열 사용해서 split으로 잘린 데이터를 어디다 저장해야하너?
		
		// 출력
//		for (int i = 0; i < student.length; i++) {
//			
//		}
		
	}

}
