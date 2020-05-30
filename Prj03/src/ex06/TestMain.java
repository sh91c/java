package ex06;

class Student{
	String name;
	String tel;
	
	public void info() {
		System.out.println(name + ": " + tel);
	}

	// equals는 기능 재정의를 하지 않으면 hashCode를 비교 (기본값)
	// String의 equals는 값을 비교하도록 재정의가 되어있었던 것!
	// 기존의 equals 기능을 수정 ( 재정의 )
	// 자바에서 재정의를 Override 라고 한다.
	// @ : annotation, 컴파일러에게 정보를 전달.
		// 혹시 오타가 발생하여 다른 메소드로 인식하지 않도록 교정도 해줌
	@Override
	public boolean equals(Object obj) {
		boolean isSameName = false;
		boolean isSameTel = false;
		
		Student other = (Student) obj; // 오브젝트 형을 Student 형으로
		isSameName = this.name.equals(other.name);
		isSameTel  = this.tel.equals(other.tel);
		return isSameName && isSameTel;
	}
	
	
	
	// 생성자의 overload : 같은 이름의 함수와 생성자가 인자만 다르면 여러번 사용할 수 있다는 말.
}

public class TestMain {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "채수빈";
		s1.tel  = "010-1234-1111";
		s1.info();
		
		Student s2 = new Student();
		s2.name = "헤이즈";
		s2.tel  = "010-1234-2222";
		s2.info();

		Student s3 = new Student(); // 찾고자 하는 사람의 정보
		s3.name = "채수빈";
		s3.tel  = "010-1234-1111";
		s3.info();
		
		
		// HashCode 비교 : 메모리 위치가 비교된 것.
		if(s1 == s3)
			System.out.println("1. 동일 인물 확인");
		else
			System.out.println("1. 타인으로 확인");
		if(s1.hashCode() == s3.hashCode())
			System.out.println("2. 동일 인물 확인");
		else
			System.out.println("2. 타인으로 확인");

		// 재정의(override) 되기 전에는 타인으로 결과 출력(주소를 비교했음.)
		// 재정의           이후 동일 인물로 확인(데이터 비교)
		if(s1.equals(s3))
			System.out.println("3. 동일 인물 확인");
		else
			System.out.println("3. 타인으로 확인");
		
		
		
		
		// 데이터를 비교
//		boolean isSameName = s1.name == s3.name; // 주소 비교
		boolean isSameName = s1.name.equals(s3.name); // 데이터 비교
		System.out.println(isSameName);
//		boolean isSametel = s1.tel == s3.tel;
		boolean isSameTel = s1.tel.equals(s3.tel);
		System.out.println(isSameTel);
		
		if(isSameName && isSameTel)
			System.out.println("동일 인물 확인");
		else
			System.out.println("타인으로 확인");
	}

}
