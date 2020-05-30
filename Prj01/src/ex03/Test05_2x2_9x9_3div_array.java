package ex03;

public class Test05_2x2_9x9_3div_array {
// 배열로 구구단 전체 출력하기(2단 ~ 9단) 가로 출력 2by4 형태
	public static void main(String[] args) {
		System.out.println("***구구단 2by4 horizen***");
//		int [] title = { 2, 3, 4, 5, 6, 7, 8, 9 };  // 단 수
//		int [] first = { 2, 3, 4, 5, 6, 7, 8, 9 };  // 앞자리 계산 배열 원소 8개
//		int [] sec   = { 1, 2, 3, 4, 5, 6, 7, 8, 9 }; // 뒷자리 계산 배열 원소 10개
		
		for(int i=1; i<=9; i++) {
			for (int j = 2; j <= 5; j++) {
				System.out.printf("%2d *%2d = %2d\t", j, i, i*j);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=1; i<=9; i++) {
			for (int j = 6; j <= 9; j++) {
				System.out.printf("%2d *%2d = %2d\t", j, i, i*j);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("***구구단 2by4 vertical***");
		for(int i=1; i<=9; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.printf("%2d *%2d = %2d\t", j*2, i, i*j);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=1; i<=9; i++) {
			for (int j = 1; j <= 7; j+=2) {
				System.out.printf("%2d *%2d = %2d\t", j+2, i, i*j);
			}
			System.out.println();
		}
		
	}
}

