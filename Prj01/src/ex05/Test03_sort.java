package ex05;

public class Test03_sort {
	
	static int [] data;

	public static void main(String[] args) {
		// Bubble sort : ascending
		data = new int[] { 8, 7, 9, 5, 3 };
		
		System.out.println("정렬 전: ");
		disp_arr();
		
		bubble_sort_asc();
		 
		System.out.println("정렬 후: ");
		disp_arr();
	}

	private static void bubble_sort_asc() {
		for (int i = 0; i < data.length - 1; i++) {
			for (int j = 0; j < data.length-i-1; j++) {
				if( data[j] > data[j+1] ) {
					int temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
				}
			}
		}
		
	}

	private static void disp_arr() {
		for (int i = 0; i < data.length; i++) {
			System.out.printf("%4d", data[i]);
		}
		System.out.println();
	}

}
