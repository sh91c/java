package collection03;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		System.out.println(set.size());
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");		// 중복이라 입력되지 않았음.
		set.add("Mybatis");

		System.out.println(set.size());
		
		//출력
		setDisplay(set); // 함수로 만들기
		
//		Iterator<String> iter = set.iterator();
//		while (iter.hasNext()) {
//			String element = iter.next();
//			System.out.println(element + " ");
//		}
		
		set.remove("JDBC");
		
//		iter = set.iterator();   // 2. 그래서 iter를 원위치 초기화 해야함.
//		while (iter.hasNext()) { // 1. 위의 iter 맨 뒤에 위치해있어서 찍히지 않음
//			String element = iter.next();
//			System.out.println(element + " ");
//		}
		setDisplay(set);
		
		set.clear();
		if((set.isEmpty()))
				System.out.println("자료 없음");
		
//		set.removeAll(Arrays.asList("Java", "JDBC")); -> 여러 객체를 지울 때 사용 또는 원하는 컬렉션을 통으로 지울 때 사용 
	}

	private static void setDisplay(HashSet<String> set) {
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			String element = iter.next();
			System.out.println(element + " ");
		}
		System.out.println();
	}

}
