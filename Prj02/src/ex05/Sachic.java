package ex05;

public class Sachic {
	// fields
	private int v1;
	private int v2;

	// getter / setter
	public void setV1(int v1) {
		this.v1 = v1;
	}
	public void setV2(int v2) {
		this.v2 = v2;
	}
	
	public int getV1() {
		return this.v1;
	}
	public int getV2() {
		return this.v2;
	}

	// constructor
	public Sachic() {
		System.out.println("기본생성자");
		this.v1 = 0;
		this.v2 = 0;
	}
	
	// Overload된 constructor
	public Sachic(int v1, int v2) {
		System.out.println("Overload된 생성자 : 인자가 있는 생성자");
		this.v1 = v1;
		this.v2 = v2;
	}

	// method series 1 : 인자가 있는 메소드
	public int add(int v1, int v2) {
		return v1 + v2;
	}

	public int sub(int v1, int v2) {
		return v1 - v2;
	}

	public int mul(int v1, int v2) {
		return v1 * v2;
	}

	public int div(int v1, int v2) {
		return v1 / v2;
	}

	// method series 2 : 인자가 없는 메소드
	public int add() {
		return this.v1 + this.v2;
	}
	public int sub() {
		return this.v1 - this.v2;
	}
	public int mul() {
		return this.v1 * this.v2;
	}
	public int div() {
		return this.v1 / this.v2;
	}
}
