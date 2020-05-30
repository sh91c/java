package ex18;
// 인터페이스 하나만 만들고
interface Printer {
	public void print(String doc);
}

// 각 기능을 가지는 함수를 개별적으로 만들어서 동작시킨다.
class SamsungPrinter implements Printer {

	@Override
	public void print(String doc) {
		System.out.println("삼성 컬러 프린터 입니다.\n");
	}
}

class HpPrinter implements Printer{

	@Override
	public void print(String doc) {
		System.out.println("Hp 레이저 프린터 입니다.\n");
	}
}

class LgPrinter implements Printer{

	@Override
	public void print(String doc) {
		System.out.println("LG 잉크젯 프린터 입니다.\n");
	}
}
class SaomiPrinter implements Printer{
	
	@Override
	public void print(String doc) {
		System.out.println("Saomi 흑백 프린터 입니다.\n");
	}
}

public class TestMain {
	
	static String doc = "인쇄될 내용입니다.";

	public static void main(String[] args) {
		doc = "인쇄될 내용입니다.";
		SamsungPrinter sp = new SamsungPrinter();
		sp.print(doc);
		LgPrinter      lp = new LgPrinter();
		lp.print(doc);
		SaomiPrinter sop = new SaomiPrinter();
		
		// 각 함수를 한번에 호출하고싶으니가
		write(sp);  //  객체의 인스턴스가 함수의 인자로 던져진다 라고 설명함.
		write(lp);
		write(sop);
	}

	private static void write(Printer prn) {  // 이걸 만들어서 여러 클래스의 공통인 인터페이스를 매개변수로 받는다.
		prn.print(doc);
	
	}

}
