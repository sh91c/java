package ex03;
// 전역변수는 private으로 사용하는 것이 관례이다.(객체 지향)
class Sachic {
	
	// 1. Fields
	private int v1;
	private int v2;
	
	
	// 2. getter, setter
	public void setV1(int v1) {   // setter 함수 : 전역변수를 입력받기 위한 함수.
		this.v1 = v1;
		if(-10000000 <= this.v1 && this.v1 <= Integer.MAX_VALUE)
			this.v1 = v1;
		else
			this.v1 = 0;
	}
	
	public void setV2(int v2) {
		this.v2 = v2;
	}
	
	// 3. constructor : 생성자
	public Sachic() {} // 기본 생성자
	
	
	// 4. Method
	public int add() {
		return v1 + v2;
	}
	public int sub() {
		return v1 - v2;
	}
	public int mul() {
		return v1 * v2;
	}
	public int div() {
		return v1 / v2;
	}
}
