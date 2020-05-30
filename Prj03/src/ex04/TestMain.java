package ex04;

public class TestMain {

	public static void main(String[] args) {
		Student s1 = new Student(1, "채수빈", 70,80,79);
		Student s2 = new Student(2, "헤이즈", 67,86,96);
		Student s3 = new Student(3, "크러쉬", 85,85,70);
		Student s4 = new Student(4, "딘", 92,78,89);
		
		s1.dispScores();
		s2.dispScores();
		s3.dispScores();
		s4.dispScores();
	}

}
