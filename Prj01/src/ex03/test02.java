package ex03;

public class test02 {

	public static void main(String[] args) {
		// 반복
//		for(int i=1; i<=5; i++) {
//			System.out.println("채수빈");
//		}
		
		System.out.println("* 출력 1");
		for(int a=1; a<=5; a++) {
			System.out.println("*****");
		}
		
		System.out.println();
		
		System.out.println("* 출력 2");
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("* 출력 3");
		int row = 5;
	
		for(int i=0; i<row; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
				}
			System.out.println();
			}

		System.out.println();
		
		System.out.println("* 출력 4");
		for(int i=1; i<=5; i++) {
			for(int j=0; j<6-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("* 출력 5");
		
		for(int i=1; i<=5; i++) {
			for(int s=0;s<=i-2;s++) {
				System.out.print(" ");
			}
			for(int j=i;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("* 출력 6");
		for(int i=1; i<=5; i++) {
			for(int s=i; s<=5-1; s++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("* 출력 7 마름모");
		for(int i=1;i<=3;i++) {
			for(int s=1; s<4-i; s++) {
				System.out.print(" ");
			}
			for(int j=1; j<i*2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=2;i++) {
			for(int s=1;s<=i; s++) {
				System.out.print(" ");
			}
			for(int j=5;j>i*2;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("* 출력 8 마름모 바깥");
		for(int i=0;i<=3;i++) {
			for(int x=3;x>=i;x--) {
				System.out.print("*");
			}
			for(int s=0;s<i*2;s++) {
				System.out.print(" ");
			}
			for(int x=3;x>=i;x--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<=3;i++) {
			for(int x=1;x<i+2;x++) {
				System.out.print("*");
			}
			for(int s=6;s>i*2;s--) {
				System.out.print(" ");
			}
			for(int x=1;x<i+2;x++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}