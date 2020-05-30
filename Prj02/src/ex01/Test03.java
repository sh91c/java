package ex01;

class Sachic {
	static int add(int v1, int v2){
		int v;
		v = v1 + v2;
		return v;
	}
	
	static int sub(int v1, int v2) {
		int v;
		v = v1 - v2;
		return v;
	}
}


public class Test03 {
	
	public static void main(String[] args) {
		int a= 7, b= 2;
		int c;
		
		c = Sachic.add(a,b);  // Sachic 안에 있는 add method
		System.out.println(c);
		c = Sachic.sub(a, b);		
		System.out.println(c);
	}

}
