package ex04;

public class test03_createMethod {

	public static void main(String[] args) {
		int a =7, b = 2;
		int c;
//		c = a + b;           1) 이 계산을 외부 함수로 작성해보자.
		
		c = add(a,b); //     2) add()함수에서 -> add(a,b)(인자)를 작성해 a의 값 7, b의 값 2를
					  // !Actual argument!
				      //     5) 리턴을 된 v값을 c에 대입한다. * 리턴될 때 눈에 보이지 않는 변수. 레지스터로 변
		
		System.out.printf("a=%d b=%d c=%d\n", a, b, c);
		
	}
	
	public static int add(int v1, int v2){ // int v1과 v2는 Dummy argument(가인자, 가인수) 
		int v = v1 + v2; //  3)  add함수의 v1, v2 (가인자)에 대입해서 함수 실행
		return v; //         4) int add()에 v값을 리턴.
	}
}
