package ex04;

public class Test06_secDiv_array {
	public static void main(String[] args){
		
		System.out.println("// ***********************************\n" + 
			"// 입력받는대로 원소 생성\n");
		int [][] arr = new int [][] { // int[5][4]
			{ 1,  2,  3,  4},
			{ 5,  6,  7,  8},
			{ 9, 10, 11, 12},
			{13, 14, 15, 16},
			{17, 18, 19, 20}
		};
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.printf("%2d ", arr[i][j]); // %2d 자리씩 찍어줌
			}
			System.out.println();
		}
		
		System.out.println("// ***********************************\n" + 
				"// 원소 개수를 정해주기\n"); 
		
		int k = 1;
		
		int [][] arr2 = new int [5][6];
		// System.out.println(arr2.length); //행 길이
		// System.out.println(arr2[0].length); // 열 길이
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[0].length; j++) {
				arr2[i][j] = k;
				k++;
			}
		}
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[0].length; j++) {
				System.out.printf("%2d ", arr2[i][j]);
			}
			System.out.println();
		}
		
		
	}
}
