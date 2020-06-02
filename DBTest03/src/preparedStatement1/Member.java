package preparedStatement1;
//MID NAME EMAIL PHONE POINT RDATE
public class Member {
	// f
	private int    mid;
	private String name;
	private String email;
	private String phone;
	private String mlevel;
	private int    point;
	private String rdate;
	
	
	// g, s
	public int getMid() {
		return mid;
	}

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

	public String getMlevel() {
		return mlevel;
	}

	public void setMlevel(String mlevel) {
		this.mlevel = mlevel;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String getRdate() {
		return rdate;
	}

	public void setRdate(String rdate) {
		this.rdate = rdate;
	};
	
	
	// c
	public Member() {};
	
	public Member(int mid, String name, String email, String mlevel) {
		this.mid    = mid;
		this.name   = name;
		this.email  = email;
		this.mlevel = mlevel;
	}
		//insert Member
	public Member(String name, String email, String phone) {
		this.name  = name;
		this.email = email;
		this.phone = phone;
	}
		//update Member
	public Member(int mid, String name, String email, String phone, int point) {
		this.mid   = mid;
		this.name  = name;
		this.email = email;
		this.phone = phone;
		this.point = point;
	}

	public Member(int mid, String name, String email, String phone, String mlevel, int point, String rdate) {
		this.mid    = mid;
		this.name   = name;
		this.email  = email;
		this.phone  = phone;
		this.mlevel = mlevel;
		this.point  = point;
		this.rdate  = rdate;
	}



	// m
	public String listInfo() {
		String fmt = "%6d %-10s %-20s %-10s";
		String msg = String.format(fmt,	mid, name, email, mlevel);
		return msg;
	};
	
	
	
	@Override
	public String toString() {
		return "Member [mid=" + mid + ", name=" + name + ", email=" + email + ", phone=" + phone + ", mlevel=" + mlevel
				+ ", point=" + point + ", rdate=" + rdate + "]";
	}
}
