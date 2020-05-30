package ex05;

public class Test05_sort3 {

	public static void main(String[] args) {
		int data[] = new int[] { 8, 7, 9, 5, 3 };

		disp_arr(data);
		
		System.out.println();
		
		selection_sort_asc(data);
		
		System.out.println();
		
		disp_arr(data);
		
	}
	private static void selection_sort_asc(int data[]) {
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
	private static void disp_arr(int data[]) {
		for (int i = 0; i < data.length; i++) {
//			System.out.printf("%04d ", data[i]);
			System.out.printf("%4d ", data[i]);
		}
		
	}

	
	
	
}
