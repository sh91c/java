package ex02;
// main() 체크 하지 않고 만든 파일.

public class Sachic {
	public int add(int v1,int v2) {
		return v1 + v2;
	}
	public int sub(int v1,int v2) {
		return v1 - v2;
	}
	public int mul(int v1,int v2) {
		return v1 * v2;
	}
	public int div(int v1,int v2) {
		int v;
		try {
			v = v1 / v2;
			return v;
		} catch(Exception e) {
			System.out.println("계산오류발생!" + e.getMessage());
			return 0;
		}
	}
}
