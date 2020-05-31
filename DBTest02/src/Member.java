
public class Member {
	//field
	private int    mid;
	private String name;
	private String email;
	private String phone;
	private int    point;
	private String mlevel;
	private String rdate;
	
	// Getter Setter
	public void setMid(int mid) {
		this.mid = mid;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public int getPoint() {
		return point;
	}
	
	public void setPoint(int point) {
		this.point = point;
	}
	
	public String getMlevel() {
		return mlevel;
	}
	
	public void setMlevel(String mlevel) {
		this.mlevel = mlevel;
	}
	
	public String getRdate() {
		return rdate;
	}
	
	public void setRdate(String rdate) {
		this.rdate = rdate;
	}
	
	
	//constructor
	public Member() {};
	
		public int getMid() {
		return mid;
	}


	// 전체 회원 조회 (간략한 정보들)
	public Member(int mid, String name, String email, String mlevel, String rdate) {
		this.mid = mid;
		this.name = name;
		this.email = email;
		this.mlevel = mlevel;
		this.rdate = rdate;
	}
		// 개인 회원 조회 (상세한 정보들)
	public Member(int mid, String name, String email, String phone, int point, String mlevel, String rdate) {
		this.mid = mid;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.point = point;
		this.mlevel = mlevel;
		this.rdate = rdate;
	}
		// addMember: 회원 추가
	public Member(String name, String email, String phone) {
			this.name = name;
			this.email = email;
			this.phone = phone;
		}

	//method
		// 전체 회원 조회 출력메소드 : mid, name, email, mlevel, rdate
	public String listInfo() {
		String fmt = "%d %s %s %s %s";
		String msg = String.format(fmt, mid, name, email, mlevel, rdate);
		return msg;
	}
		// 개인 회원 조회
	public String info() {
		String fmt = "%d %s %s %s %d %s %s";
		String msg = String.format(fmt, mid, name, email, phone, point, mlevel, rdate);
		return msg;
	}
	
	//toString.. debugging용
	@Override
	public String toString() {
		return "Member [mid=" + mid + ", name=" + name + ", email=" + email + ", phone=" + phone + ", point=" + point
				+ ", mlevel=" + mlevel + ", rdate=" + rdate + "]";
	}

}
