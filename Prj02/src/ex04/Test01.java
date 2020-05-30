package ex04;

public class Test01 {

	public static void main(String[] args) {
		Sachic s = new Sachic(7, 2);
		int v;
		
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
