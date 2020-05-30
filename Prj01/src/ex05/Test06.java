package ex05;

public class Test06 {

	public static void main(String[] args) {
		int a = 7;
		int b = 2;
		System.out.printf("a = %d b = %d\n", a, b);
		swap(a, b);
		System.out.printf("a = %d b = %d\n" , a, b);

	}

	private static void swap(int a, int b) {
		int temp = 0;
		temp = a;
		a = b;
		b = temp;
	}

}
