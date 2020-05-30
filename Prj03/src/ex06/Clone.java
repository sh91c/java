package ex06;

class StudentCl{
	String name;
	String tel;
	
	public void info() {
		System.out.println(name + ": " + tel);
	}

	
	// 값을 비교하기 위해 equals() override. equals()은 객체를 비교할  주소를 비교하게 된다..
	@Override
	public boolean equals(Object obj) {
		boolean isSameName = false;
		boolean isSameTel  = false;
		StudentCl other = (StudentCl) obj;  // 1. equals()는 무조건 Object 타입이기에 StudentCl 타입으로 변환해야함.
										    // 아래 if(s1.equals(s3))에서 s1을 s3와 비교하기에
											// 현재 객체는 s1의 객체가 되는 것이고 이것이 this.name으로 작성됌.
											// 비교 대상으로 들어가는 인자는 s3이고 equals(Object obj)에서 매개변수로
											// 들어가므로 other가 된다.
		isSameName = this.name.equals(other.name); // 2. 그래서 this.name.equals(other.name)으로 boolean 비교가 가능해짐.
		isSameTel  = this.tel.equals(other.tel);
		return isSameName && isSameTel; // 3. 이름과 전화번호 모두 true가 되야하므로 && 비교연산자 사용해서 리턴
	}
	
	
}

public class Clone {

	public static void main(String[] args) {
		StudentCl s1 = new StudentCl();
		s1.name = "John";
		s1.tel  = "010-1111-1111";
		s1.info();
		
		StudentCl s2 = new StudentCl();
		s2.name = "happy";
		s2.tel  = "010-2222-2222";
		s2.info();
		
		// s1과 동일하게 만들어서 주소를 비교하는지 값을 비교하는지 테스트하기 위함.
		StudentCl s3 = new StudentCl();
		s3.name = "John";
		s3.tel  = "010-1111-1111";
		s3.info();
		
		if(s1.equals(s3)) {
			System.out.println("동일인");
		}else {
			System.out.println("타인");
		}

	}


}
