package member;

import java.util.Vector;

public class MemberVO {
	String userId;
	String userPwd;
	String username;
	int birthYear;
	
	
	public MemberVO(String userId, String userPwd, String username, int birthYear) {
		super();
		this.userId = userId;
		this.userPwd = userPwd;
		this.username = username;
		this.birthYear = birthYear;
	}
	
	// 나이 구하기
	public int getAge() {
		int age = (2020 - this.birthYear) + 1;
		return age;
	}
	// 성인 여부 구하기
	public String getAdult() {
//		if ( this.getAge() >= 19) {
//			return "성인";			
//		} else {
//			return "미성년자";
//		}
		String result = ( (this.getAge()) >= 19 ) ? "성인" : "미성년자";
		return result;
	}

	public Vector getVector() {
		Vector v = new Vector();
		v.add(this.userId);
		v.add(this.userPwd);
		v.add(this.username);
		v.add(this.getAge());
		v.add(this.getAdult());
		return v;
	}
	
	
	
}
