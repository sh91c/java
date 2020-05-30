package ex03;

public class Test01 {

	// Getter Setter 를 통한 외부데이터 입출력
	public static void main(String[] args) {
		int v;
		Sachic s = new Sachic();
//		s.v1 = 7;
//		s.v2 = 2;
		s.setV1(7);
		s.setV2(2);
		
		v = s.add();
		System.out.println(v);
		v = s.sub();
		System.out.println(v);
		v = s.mul();
		System.out.println(v);
		v = s.div();
		System.out.println(v);
	}

}
