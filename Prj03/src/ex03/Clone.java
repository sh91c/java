package ex03;
// 가변인자를 사용해 소수를 합하는 함수를 만들고 출력.
public class Clone {
	
	public static void main(String[] args) {
		
		double r1 = add(1.0, 2.0, 3.0);
		double r2 = add(1.0, 2.0, 3.0, 4.0, 5.0);
		System.out.println(r1);
		System.out.println(r2);
		
	}

	private static double add(double ... value) {
		double sum = 0.0;
		for (int i = 0; i < value.length; i++) {
			sum = sum + value[i];
		}
		return sum;
	}

	
	
	
	
}