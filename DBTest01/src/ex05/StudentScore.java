package ex05;

// stnum, stname, totscore, avgscore, grade, rnk
public class StudentScore {
	private int    stnum;
	private String stname;
	private String totscore;
	private String avgscore;
	private String   grade;
	private int    rank;
	
	public StudentScore() {};
	public StudentScore(int stnum, String stname, String totscore, String avgscore, String grade, int rank) {
		this.stnum = stnum;
		this.stname = stname;
		this.totscore = totscore;
		this.avgscore = avgscore;
		this.grade = grade;
		this.rank = rank;
	}
	
	// method
	// 만약 한 학생의 등급을 점수로 표현해달라는 요청이 들어올 
	public String info() {
		double gradeScore = 0.0;
		switch (this.grade) {
		case "A" : gradeScore = 4.0; break;
		case "B" : gradeScore = 3.0; break;
		case "C" : gradeScore = 2.0; break;
		case "D" : gradeScore = 1.0; break;
		case "E" : gradeScore = 0.0; break;
		case "F" : gradeScore = 0.0; break;
		}
		
		String fmt = "%4d %-10s %s   %s    %s    %d    %.1f";
		String msg = String.format(fmt, this.stnum, this.stname, this.totscore, this.avgscore, this.grade, this.rank,
					 gradeScore);
		return msg;
	}
	
	@Override
	public String toString() {
		return "StudentScore [stnum=" + stnum + ", stname=" + stname + ", totscore=" + totscore + ", avgscore="
				+ avgscore + ", grade=" + grade + ", rank=" + rank + "]";
	}
}
