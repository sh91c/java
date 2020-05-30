package ex05;

public class Test07 {

	public static void main(String[] args) {
		int a = 7;
		int arr[] = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
//		System.out.println("main()에서 출력한 " + a);
//		a = func1(a); // 새로운 데이터 21을 꼭 변수에 다시 담아야함
//		System.out.println("main()에서 출력한 " + a);
		
		// -----------------------------------------------
		
		System.out.println("배열 처리");
		System.out.printf("%d %d %d\n", arr[0], arr[1], arr[2]);
		double_arr(arr);
		System.out.printf("%d %d %d\n", arr[0], arr[1], arr[2]);
	}

	private static void double_arr(int arr[]) { // int arr[]은 배열의 주소를 받게됨.
		arr[0] = arr[0] * 3;
		arr[1] = arr[1] * 3;
		arr[2] = arr[2] * 3;
		
	}

	private static int func1(int a) {
		System.out.println("func1()에서 출력한 "+ a);
		a = a * 3;
		System.out.println("func1()에서 출력한 "+ a);
		
		return a; // 함수가 사라지기 전 21을 리턴
	}

}
