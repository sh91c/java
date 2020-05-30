package ex05;

import java.util.Arrays;

public class Test09 {

	public static void main(String[] args) {
		char []arr1 = { 'J', 'a', 'v', 'a', '8' };
		System.out.printf("%c%c%c%c%c", arr1[0], arr1[1], arr1[2], arr1[3], arr1[4] );
		System.out.println();
		
//		char []arr1_1 = new char[arr1.length];
//		// 배열을 만들 때 변수를 이용해서 길이를 유동적으로 정할 수 있다.
//		for (int i = 0; i < arr1.length; i++) {
//			arr1_1[i] = arr1[i];
//			System.out.println(Arrays.toString(arr1_1));
//		}
		
		char []arr2 = Arrays.copyOf(arr1, arr1.length);
//		문자형 arr2배열= 배열을.복사한다(arr1의, 원소 크기 만큼)
		System.out.println(Arrays.toString(arr2));
//		              출력(배열을.문자열로(arr2)의)

		char []arr3 = Arrays.copyOfRange(arr1, 1, 3);
		// 1 : 시작점(0~), 3: 끝점(실제로는 -1 해버림) 그래서 a, v, a가 아닌 a, v로 출력됐음.
		System.out.println(Arrays.toString(arr3));
		
		char []arr4 = new char[arr1.length];
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		System.out.println(Arrays.toString(arr4));
	}

}
