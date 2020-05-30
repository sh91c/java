package ex02;

public class Test01 {

	public static void main(String[] args) {
		int v1= 7, v2= 2;
		int v;
		
		Sachic s = new Sachic();
		v        = s.add(v1, v2);
		System.out.println(v);
		
		v        = s.sub(v1, v2);
		System.out.println(v);
		
		v        = s.mul(v1, v2);
		System.out.println(v);
		
		v        = s.div(v1, v2);
		System.out.println(v);
		System.out.println("결과 끝");

	}

}