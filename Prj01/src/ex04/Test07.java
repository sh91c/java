//package ex04;
//
//public class Test07 {
//
//	// 배열을 이용한 * 출력 
//	public static void main(String[] args) {
//		char [][] star = new char [5][5];
//		
//		// 공백으로 초기화. init_array();로 만들것
//		for (int i = 0; i < star.length; i++) {
//			for (int j = 0; j < star[0].length; j++) {
//				star[i][j] = ' ';
//			}
//		}
//		
//		// fiil_array();
//		for (int i = 0; i < star.length; i++) {
//			for (int j = 0; j < star[0].length; j++) {
//				star[i][j] = '*';
//			}
//		}
//		
//		// display_array();
//		for (int i = 0; i < star.length; i++) {
//			for (int j = 0; j < star[0].length; j++) {
//				System.out.printf("%c", star[i][j]);
//			}
//			System.out.println();
//			
//		}
//		
//	}
//
//}

// 함수별로 따로 만들어서 작성해보기.
package ex04;

public class Test07 {
	
	static char [][] star; 														// 1.
	
	public static void main(String[] args) {
		star = new char [5][5]; 											    // 2.
		
		init_array();															// 3.
		
		fill_array();															// 4.
		
		display_array();														// 5.
		
		System.out.println("\n=================================\n");															
		display_array2();
	}
	
	public static void init_array() {											// 3. 
		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j < star[0].length; j++) {
				star[i][j] = ' ';
			}
		}
	}
	
	public static void fill_array() {											// 4.
		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j < star[0].length; j++) {
				star[i][j] = '*';
			}
		}
	}
	
	public static void display_array() {										// 5.
		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j < star[0].length; j++) {
				System.out.printf("%c", star[i][j]);
			}
			System.out.println();
		}
	}
	public static void display_array2() {
		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.printf("%c", star[i][j]);
			}
			System.out.println();
		}
	}
}
