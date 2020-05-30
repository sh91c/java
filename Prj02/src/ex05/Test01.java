package ex05;

public class Test01 {

	public static void main(String[] args) {
		Sachic s = new Sachic();
		
		int v = s.add(7,2);
		System.out.println(v);
		
		
//		s.v1 = 123;				객체지향에서 외부 변수에 데이터를 직접
//		s.v2 = 200;				할당하는 것은 잘못된 코딩이다.
		s.setV1(321);
		s.setV2(-300);
		v = s.add();
		System.out.println(v);
		
		int v1 = s.getV1();
		System.out.println(v1);
		
		Sachic s2 = new Sachic(120, 4);
		System.out.println(s2.sub());
	}

}
