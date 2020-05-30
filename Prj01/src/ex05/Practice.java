package ex05;

public class Practice {
	static int []select;
	public static void main(String[] args) {
		select = new int [] { 8, 9, 7, 5, 3};
		
		disp_arr(); // 정렬전
		System.out.println();
		sel_arr();
		disp_arr(); // 정렬

	}
	private static void sel_arr() {
		for (int i = 0; i < select.length - 1; i++) {
			int min = select[i];
			System.out.println("최소값: " + min);
			for (int j = i + 1; j < select.length; j++) {
				if(select[j] < min) {
					int temp = min;
					min = select[j];
				}
				
			}
		}
	}
	private static void disp_arr() {
		for (int i = 0; i < select.length; i++) {
			System.out.printf("%4d ", select[i]);
		}
		
	}

}
