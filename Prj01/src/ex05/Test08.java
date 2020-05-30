package ex05;

public class Test08 {

	public static void main(String[] args) {
		int num1 = 10, num2 = 20, num3 = 30;
//		int v1 = 0, v2 = 0, v3 = 0, v4 = 0;
		
		int[] v // func1()에서 리턴된 heap에 있는 v의 주소값을 받음 
		= func1(num1, num2, num3);
		
		System.out.println("모두 더하기: " + v[0]);
		System.out.println("모두   빼기: " + v[1]);
		System.out.println("모두 곱하기: " + v[2]);
		System.out.println("모두 나누기: " + v[3]);
	}

	private static int[] func1(int num1, int num2, int num3) {
		int[] v = new int [4]; // heap 영역에 배열이 생성된다.
		v[0] = num1 + num2 + num3;
		v[1] = num1 - num2 - num3;
		v[2] = num1 * num2 * num3;
		v[3] = num1 / num2 / num3;
		return v; // heap에 있는 주소값을 리턴한다.
	}

}
