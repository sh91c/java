package collection01;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 배열과 ArrayList 같이 사용하기

public class TestMain2 {

	public static void main(String[] args) {
//		ArrayList<String> list1 = (ArrayList<String>) Arrays.asList("홍길동", "이순신", "김유신", "박문수");
		List<String> list1 = Arrays.asList("홍길동", "이순신", "김유신", "박문수");
		
		// enhanced for : 향상된 for (= for each)
		for (String name : list1) {
			System.out.print(name + " ");
		}
		System.out.println();
		
		List<Integer> list2 = Arrays.asList(13, 5, 7, 9, 6);
		for (Integer num : list2) {
			System.out.print(num + " ");
		}
	}

}
