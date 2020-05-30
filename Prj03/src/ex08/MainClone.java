package ex08;

public class MainClone {

	public static void main(String[] args) {
		StudentC [] studs = new StudentC[5];
		studs[0] = new StudentC(1,"Alpha", 100, 92, 50);
		studs[1] = new StudentC(2,"Brabo", 50, 72, 80);
		studs[2] = new StudentC(3,"Callc", 61, 57, 86);
		studs[3] = new StudentC(4,"Drill", 60, 72, 90);
		studs[4] = new StudentC(5,"Eveee", 80, 92, 87);

		StudentsC st = new StudentsC();
		st.makeRank(studs);
		st.output(studs);
		
	}

}
