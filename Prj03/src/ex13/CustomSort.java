package ex13;

// 유틸리티 클래스 라고한다.
public class CustomSort {
	// 1번 출력
	public static void display(int[] nums) { // static 클래스 형태
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}

	// 1번 버블소트(숫자)
	public static void bubble_sort(int[] nums) {
		int n = nums.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (nums[j] > nums[j + 1]) {
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
			}

		}

	}

	// 2번 출력
	public static void display(String[] names) {
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}
		System.out.println();
	}

	// 2번 버블소트(문자열)
	public static void bubble_sort(String[] names) {
		int n = names.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (names[j].compareToIgnoreCase(names[j + 1]) > 0) {
					// *.compareTo()는 문자열을 숫자로 변환함.
					// 양수 : 앞이 큼, 음수 : 앞이 작음, 0 : 같음
					// 비교 대상 j 번째 원소가 j+1 보다 크고 그 값이 0보다 클때 정렬됨.
					String temp = names[j];
					names[j] = names[j + 1];
					names[j + 1] = temp;
				}
			}
		}
	}

	// 3번 출력 예제1
//	public static void display(Student[] studs) {
//		for (int i = 0; i < studs.length; i++) {
//			studs[i].print();
//		}
//	}

	// 3번 출력 예제2
	public static void display(Student[] studs) {
		for (int i = 0; i < studs.length; i++) {
			System.out.println(studs[i].toString() + " ");
		}
		System.out.println();
	}

	// 3번 버블소트
	public static void bubble_sort(Student[] studs, Type type) {
		int n = studs.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				switch (type) {  // type 매개변수에 1, 2, 3 이 들어왔을때 각각에 대한 오름차순
				case SNAME:
					if (studs[j].getName().compareToIgnoreCase(studs[j + 1].getName()) > 0) {
						// *.getName() 은 학생 1명에 대한 이름을 가져오기 위해 getter 사용
						// *.compareToIgnoreCase() 는 문자열을 비교하기 위함.
						Student temp = studs[j];
						studs[j] = studs[j + 1];
						studs[j + 1] = temp;
					}
					break;
				case STEL:
					if (studs[j].getTel().compareToIgnoreCase(studs[j + 1].getTel()) > 0) {
						Student temp = studs[j];
						studs[j] = studs[j + 1];
						studs[j + 1] = temp;
					}
					break;
				case BYEAR:
					if (studs[j].getByear() > studs[j + 1].getByear()) {
						Student temp = studs[j];
						studs[j] = studs[j + 1];
						studs[j + 1] = temp;
					}
					break;
				}
			}
		}
	}
}
