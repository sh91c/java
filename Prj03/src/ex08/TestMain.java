package ex08;

public class TestMain {

	public static void main(String[] args) {
		
		Student [] studs = new Student[5];
		studs[0] = new Student(1,"채수빈",100, 92, 80);
		studs[1] = new Student(2,"디피알",90, 83, 70);
		studs[2] = new Student(3,"헤이즈",80, 74, 80);
		studs[3] = new Student(4,"크러쉬",100, 85, 60);
		studs[4] = new Student(5,"신세경",80, 96, 90);
		
		Students st = new Students();
		st.makeRank(studs);
		st.output(studs);
		
	}

}
