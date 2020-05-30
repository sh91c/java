package ex06;
// 주제 : 인터페이스
// interface는 모든 메소드가 abstract(코딩되지않은 추상클래)일 때 interface로 대체하여 묶어표현함.
// 회사에서 추상클래스는 거의 만지지 않는다.
interface Printable {
	void print(String doc);
}

class SamsungPrinterDriver implements Printable{ // 인터페이스를 상속받을 때 '구현한다'로 표현하고 implements를 사용

	@Override
	public void print(String doc) {
		System.out.println("삼성 레이저 프린터 입니다.");
		System.out.println(doc);
		
	}
	
}

class LgPrinterDriver implements Printable{

	@Override
	public void print(String doc) {
		System.out.println("엘지 잉크젯 프린터 입니다.");
		System.out.println(doc);
		
	}
	
}

class PdfFile implements Printable {

	@Override
	public void print(String doc) {
		System.out.println("PDF 파일로 저장합니다.");
		System.out.println(doc);
	}
	
}

public class TestMain {

	public static void main(String[] args) {
		Printable prn1 = new SamsungPrinterDriver();
		prn1.print("Samsung Printer!");
		
		Printable prn2 = new LgPrinterDriver();
		prn2.print("LG Printer!");

		prn2 = new SamsungPrinterDriver();
		prn2.print("인쇄 데이터");
		
		Printable prn3 = new PdfFile();
		prn3.print("PDF 파일 생성완료.");
	}

}
