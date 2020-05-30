package collection01;

import java.util.ArrayList;

class Car{
	
}

public class TestMain {

	public static void main(String[] args) {
		
		// NON GENERIC 
		// Object type으로 작업한다는 뜻
		System.out.println("==============NON GENERIC============");
		
		ArrayList al = new ArrayList();
		al.add(10);		  // 0
		al.add(20);		  // 1
		al.add(30);		  // 2
		al.add(40.7);	  // 3
		al.add("고길동"); // 4
		al.add("홍길동"); // 5
		
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		al.add(new Car());// 6
		Car myCar = (Car) al.get(6);

		
		
		// GENERIC : 자바 5버전부터 가능
		System.out.println("==============GENERIC============");
		ArrayList<String> names = new ArrayList<String>();
		names.add("정연");     // 0
		names.add("쯔위");     // 1
		names.add("사나");     // 2
		names.add("모모");     // 3
		names.add("다현");     // 4
		names.add("정연");     // 5
		
		
		// 출력
		listDisplay(names);
		
		// 요소 삭제 후 출력
		names.remove(3); // 3번 인덱스 제거
		System.out.println("===============3번 인덱스 삭제 후 출력================");
		listDisplay(names);
		names.remove("정연"); // 객체 삭제 (현재 2명임.. 결과는?) -> 첫 번째로 입력된 정연이 삭제됌
		System.out.println("===============정연 삭제 후 출력================");
		listDisplay(names);
		
		
		// 요소 추가 후 출력
		names.add("진영");
		System.out.println("===============진영 추가 후 출력================");
		listDisplay(names);
		/*
		names.add(27.3);
		System.out.println("===============27 추가 후 출력================");
		listDisplay(names);
							error : ArrayList는 현재 String 타입만 입력받기로 되어있어서 에러.
		*/
	}
	
	// 출력 함수 구현하기
			private static void listDisplay(ArrayList<String> names) {
				for (int i = 0; i < names.size(); i++) {
					System.out.println("ArrayList [" + i + "] : " + names.get(i));
				}
			}

}
