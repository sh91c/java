package ex05;

public class Test04_sort2 {
	static int [] data;
	public static void main(String[] args) {
		data = new int[] { 8, 7, 9, 5, 3 };

		disp_arr();
		
		System.out.println();
		
		selection_sort_asc();
		
		System.out.println();
		
		disp_arr();
		
	}
	private static void selection_sort_asc() {
		int n = data.length;
		for (int i = 0; i < n-1; i++) {
			for (int j = i+1; j < n; j++) {
				if( data[i] > data[j]) {
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
		
	}
	private static void disp_arr() {
		for (int i = 0; i < data.length; i++) {
//			System.out.printf("%04d ", data[i]);
			System.out.printf("%4d ", data[i]);
		}
		
	}

	
	
	
}
