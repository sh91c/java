package ex02;

public class Students {

	Student [] students;
	
	public void output(Student [] students) {
		
		String msg = "";
		
		for (int i = 0; i < students.length; i++) {
			if(students[i] == null) break;
			msg += students[i].num + " "
					+ students[i].name + " " 
					+ students[i].jumsu;
		}
		System.out.println(msg);
	}
}
