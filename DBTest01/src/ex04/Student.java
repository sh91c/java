package ex04;

public class Student {
	private int    stnum;
	private String stname;
	private String tel;
	private String indate;
	
	public Student(int stnum, String stname, String tel, String indate) {
		this.stnum = stnum;
		this.stname = stname;
		this.tel = tel;
		this.indate = indate;
	}

	@Override
	public String toString() {
		return "학번: " + stnum + "   이름: " + stname + "   전화번호: " + tel + "   입학날짜: " + indate;
	}
	
	
	
}
