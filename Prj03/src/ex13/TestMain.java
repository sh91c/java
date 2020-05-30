package ex13;

public class TestMain {

	public static void main(String[] args) {
//		String name1 = "이순신";
//		String name2 = "李순신";
//		
//		int result1 = name1.compareTo(name2);
//		int result2 = name1.compareToIgnoreCase(name2);
//		System.out.println(result1);
//		System.out.println(result2);
		
		// ----------------------------------------------//
		
		int [] nums = { 8, 9, 3, 4,7};
		CustomSort.display(nums); // new를 사용하지않고 클래스 사용
								  // 한번 만들어놓고 재사용하기 위해
								  // static을 작성한다.
		CustomSort.bubble_sort(nums);
		CustomSort.display(nums);
		
		// ---------------------------------------------------------//
		String[] names = { "채수빈","크러쉬","헤이즈","Dean", "이루리" };
		CustomSort.display(names);
		CustomSort.bubble_sort(names);
		CustomSort.display(names);
		
		
		// ----------------------------------------------------------------//
		Student[] studs = new Student[] { 
			new Student("이순신", "010-1111-1234", 1500),
			new Student("김유신", "010-3422-1394", 1658),
			new Student("박실신", "010-1156-9234", 1940),
			new Student("홍진경", "010-6341-4589", 1968),
			new Student("에일리", "010-7934-9561", 1989)
		};
		CustomSort.display(studs); // 한 사람만 출력하는 것을 Student 클래스에 작성하고,
								   // 다수를 출력하기 위해 CustomSort클래스에 작성되었다.
		CustomSort.bubble_sort(studs, Type.SNAME); // 1: 이름, 2: 전화번호, 3: 연도
										  // 숫자 대신에 enum(나열/열거)을 사용해서 문자열로 표현할 수 있다.
										  // 문자열은 상수이고 각각 대응할 때 내부에서는 숫자로 인식한다.
										  // 형태는 [타입명.상수명]
										  // Type.SNAME == 0, Type.TEL == 1, Type.BYEAR == 2
//		CustomSort.display(studs);

	
	}
}