package ex03;

public class test04 {

	public static void main(String[] args) {
		// for 연산
		System.out.println("1) for문 1 + 2 + 3 + ... + 10 계산");
		int sum = 0;
		int sum1 = 0;
		int i = 1;
		int j = 1;
		for(i=1;i<=10;i++) {
			sum = sum + i;
		};
		System.out.println(sum);
		System.out.println();
		
		int cnt = 1;
		
		System.out.println("1-1) While문 1 + 2 + 3 + ... + 10 계산");
		while(cnt<=10) {
			sum1 = sum1 + cnt;
			cnt++;
		}
		System.out.println(sum1);
		System.out.println();
		
		int sum2 = 0;
		System.out.println("2) 1 + 2 + 4 + 8 + ... + (10번까지)");
//		1 2 4 8 16 32 64 128 256 512
		for(i=1;i<=10;i++) {
			sum2 = sum2 + j; 
			j = j * 2;
			}
		System.out.println(sum2);
		System.out.println();
		
		int temp1 = 0;
		int temp2 = 1;
		int temp3 = 0;
		int sum3 = 0;
		
		System.out.println("2) 1 + 2 + 3 + 5 + 8 + 13 + 21 + .. (10번까지)");
//		1 2 3 5 8 13 21 34 55 89
		for(i=1;i<=10;i++) {
			temp3 = temp1 + temp2;
			sum3 = sum3 + temp3;
			System.out.println(temp3);
			temp1 = temp2;
			temp2 = temp3;
		}
		System.out.println("-----------");
		System.out.println(sum3);
		System.out.println();
	}
}