package ex04;

public class test6_array {
	
	// 배열 : Array
	// 같은 이름과 type을 가진 연속적인 변수들의 모음
	// 배열의 첨자는 0 부터 시작(index)
	// 배열의 크기는 변경할 수 없다.(Arrays 클래스를 배우면 가능)
	// 1차원 배열
	public static void main(String[] args) {
		int[] num = new int [5]; // 배열의 개수를 정했음.
		int sum = 0;
		num[0] = 8;
		num[1] = 7;
		num[2] = 9;
		num[3] = 3;
		num[4] = 5;
		
		
		System.out.println("배열 순서 출력: ");
		for(int i = 0; i < num.length; i++) { // num.length : 배열의 크기
			System.out.print(num[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		
		for(int i = 0; i < 5; i++) {
			sum = sum + num[i];
		}
		
		System.out.println("합계: " + sum);
		System.out.println();
		
		
		System.out.println("배열 역순서 출력: ");
		for(int i=num.length-1; i >= 0; i-- ) {
			System.out.print(num[i] + " ");
		}
		
		System.out.println("\n=================================");
		int[] num2 = new int[] {5, 3, 8, 19, 3, 12}; // 초기치 설정 입력한 원소만큼 배열 생성
		
		for (int i = 0; i < num2.length; i++) {
			num2[i] = num2[i] * 2;
		}
		for (int i = 0; i < num2.length; i++) {
			System.out.printf("num2[%d] = %d\n", i, num2[i]);
		}
		for (int i = num2.length-1; i >= 0; i--) {
			System.out.printf("역순 num2[%d] = %d\n", i, num2[i]);
		}
	}
}
