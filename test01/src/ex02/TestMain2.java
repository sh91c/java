package ex02;

public class TestMain2 {

	public static void main(String[] args) {
		
		// 객체 배열을 사용할 준
		Student[] stds = new Student[5];
		
		stds[0] = new Student(1, "태화", 87);
		stds[1] = new Student(2, "쏭지", 78);
		stds[2] = new Student(3, "은영", 100);
		
		Students st = new Students();
		st.output(stds);
	}

}
