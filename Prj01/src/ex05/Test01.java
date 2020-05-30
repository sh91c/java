package ex05;

public class Test01 {
	// 띠를 구하는 프로그램
	public static void main(String[] args) {
		int birthYear = 1991;
		String ddi = "";
		
		ddi = getDdi(birthYear);
		System.out.println(ddi + "띠");
		
		ddi = getDdi2(birthYear); 						// make array type
		System.out.println(ddi + "띠");
	}
	
	public static String getDdi(int bYear) {
		String ddi = "";
		switch( bYear % 12 ) {
		case  0: ddi = "원숭이"; break;
		case  1: ddi = "닭"; break;
		case  2: ddi = "개"; break;
		case  3: ddi = "돼지"; break;
		case  4: ddi = "쥐"; break;
		case  5: ddi = "소"; break;
		case  6: ddi = "호랑이"; break;
		case  7: ddi = "토끼"; break;
		case  8: ddi = "용"; break;
		case  9: ddi = "뱀"; break;
		case 10: ddi = "말"; break;
		case 11: ddi = "양"; break;
		}
		return ddi;
	}
	
	public static String getDdi2(int bYear) {
		String ddi ="";
		String [] d = new String [] {
			"원숭이", "닭",     "개", "돼지",
			    "쥐", "소", "호랑이", "토끼",
			    "용", "뱀",     "말",   "양"
		};
		ddi = d[bYear % 12]; // d[나머지 숫자에 해당하는 원소 번호];
		return ddi;
	}
	
}
