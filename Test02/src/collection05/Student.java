package collection05;

public class Student {
	// field
	int num;
	String name;
	
	// construct
	public Student() {}
	public Student(int num, String name) {
		this.num = num;
		this.name = name;
	}
	
	// 제너레이트로 자동 작성 방법
	
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		result = prime * result + num;
//		return result;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		if (num != other.num)
//			return false;
//		return true;
//	}
	
	// 짧은 방법
	
	@Override
	public int hashCode() {
		return num + name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if( obj instanceof Student ) {
			Student student = (Student) obj;
			return ( this.num == student.num ) && (this.name.equals(student.name));
		}
		return false;
	}
	
	
	
	
}
