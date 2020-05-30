package ex11;

public class TestMain4 {

	public static void main(String[] args) {
//		Student s1 = new Student("크러쉬", "010-4444-4444", "보컬", 100);
//		Student s2 = new Student("크러힘", "010-5555-4444", "수학", 80);
//		Student s3 = new Student("백러쉬", "010-4444-6666", "지리", 90);
//		Student s4 = new Student("크래커", "010-7777-4444", "영어", 70);
//		Student s5 = new Student("노리쉬", "010-4444-8888", "코딩", 70);
//
//		s1.info();
//		s2.info();
//		s3.info();
//		s4.info();
//		s5.info();
//		
//		Student [] studs0 = { s1, s2, s3, s4, s5 };
		
		Student [] studs = new Student[5];
			studs[0] = new Student("크러쉬", "010-4444-4444", "보컬", 100);
			studs[1] = new Student("크러힘", "010-5555-4444", "수학", 80);
			studs[2] = new Student("백러쉬", "010-4444-6666", "지리", 90);
			studs[3] = new Student("크래커", "010-7777-4444", "영어", 70);
			studs[4] = new Student("노리쉬", "010-4444-8888", "코딩", 70);
		
		students_info(studs);
		
//		Student [] studs2 = new Student[] {
//			new Student("크러쉬", "010-4444-4444", "보컬", 100),
//			new Student("크러힘", "010-5555-4444", "수학", 80),
//			new Student("백러쉬", "010-4444-6666", "지리", 90),
//			new Student("크래커", "010-7777-4444", "영어", 70),
//			new Student("노리쉬", "010-4444-8888", "코딩", 70)
//		};
//			
//		Student [] studs3 = {
//				new Student("크러쉬", "010-4444-4444", "보컬", 100),
//				new Student("크러힘", "010-5555-4444", "수학", 80),
//				new Student("백러쉬", "010-4444-6666", "지리", 90),
//				new Student("크래커", "010-7777-4444", "영어", 70),
//				new Student("노리쉬", "010-4444-8888", "코딩", 70)
//		};
	}
	
	private static void students_info(Student[]studs) {
		for (int i = 0; i < studs.length; i++) {
			System.out.println( (i+1) + ":" );
			studs[i].info();
		}
	}

	
	
}