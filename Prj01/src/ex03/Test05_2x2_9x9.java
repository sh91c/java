package ex03;

import java.util.Scanner;

public class Test05_2x2_9x9 {
// 1. 1~9(단)의 수를 입력받아 구구단 출력하기 (하나씩)
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int input_dan = 0;
		int result = 0;
		
		System.out.println("구구단을 실행합니다.");
		System.out.println("알고 싶은 단수를 입력해주세요.");
		System.out.print("입력: ");
		input_dan = in.nextInt();
		
		for(int i=1; i<=9; i++) {
			result = input_dan * i;
			System.out.printf("%d * %d = %d\n", input_dan, i, result);
		}
	}
}
