package ex04;

// 생성자를 통한 인자 전달 작성법
public class Sachic {
	// fields
	private int v1;
	private int v2;

	// constructor 생성자
	public Sachic(int v1, int v2) {
		// 입력값 체크(if)
		this.v1 = v1;
		this.v2 = v2;
	}

	// 기본 생성자
	public Sachic() {

	}

	// method
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
