package ex03;

public class TestMainArgs {
	
	// 가변인자 : 파라미터의 개수가 유동적
	public static double add(double ... v) { // ... 이 가변적으로 변수들을 인자로 받는다.
		double sum = 0.0;
		for (int i = 0; i < v.length; i++) {
			sum += v[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		double r1 = add(1.0, 2.0, 3.0);
		System.out.println(r1);
		
		double r2 = add(1.0, 2.0, 3.0, 4.0, 5.0);
		System.out.println(r2);

	}

}
