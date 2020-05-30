package ex06;

import java.io.UnsupportedEncodingException;
import java.util.Date;

public class Test03 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// 문자배열 -> 문자열로 변환하기
		byte[] bytes = {'H', 'e', 'l', 'l', 'o', ' ', 'J','a','v','a'};
		String str1 = new String(bytes);
		System.out.println(str1);
		
		String str2 = new String(bytes, 6, 4);
		// (배열이름, 시작점, 시작점을 포함한 개수만큼 출력)
		System.out.println(str2);

		// getBytes() : String -> byte[]
		// 네트워크 통신 프로그램(채팅 등) 제작할 때 사용되는 방법 String -> byte -> internet -> byte -> String
		String str3 = "안녕하세요";
		
		byte [] byte3 = str3.getBytes(); // 문자형 배열을 바이트형 배열로 변환했음.
		System.out.println(byte3.length);
		
		for (int i = 0; i < byte3.length; i++) { // 그냥 바이트형 배열 원소들의 값을 확인해보는 것.
			System.out.printf("%x ", byte3[i]); // 16진수로 확인
		}
		
		// ==============================================================
		
		
		// encoding 변환
		try {
			byte[] bytesEUCKR = str3.getBytes("EUC-KR");
			// Unhandled exception type UnsupportedEncodingException -> click 'surround try / catch'
			System.out.println(bytesEUCKR.length);
			
			String strEUCKR = new String (bytesEUCKR, "EUC-KR");
			System.out.println(strEUCKR);
		} catch (UnsupportedEncodingException e) {
			
			e.printStackTrace();
		}
		
		// ==============================================================
		// 대소문자 변환 (많이 사용됨)
		String sc1 = " Text Editor v1.8 ";
		System.out.println(sc1.toUpperCase()); // 모두 대문자로 변환
		System.out.println(sc1.toLowerCase()); // 모두 소문자로 변환
		System.out.println(sc1.trim());        // 앞 뒤 공백을 제거.. 중간 공백은 어떻게 제거할지 찾아보기.
		
		// 문자열 일부 추출
		String sc2 = "901225-1111114";
		System.out.println("태어난 연도: " + sc2.substring(0, 2) + "년생");
		System.out.println("태어난 월  : " + sc2.substring(2, 4) + "월");
		System.out.println("태어난 일  : " + sc2.substring(5, 6) + "일");
		String gender = "";
		if(Integer.valueOf(sc2.substring(7,8)) % 2 == 1) {
			gender = "남성";
		} else {
			gender = "여성";
		}

		System.out.println("태어난 성별: " + gender);
		
		System.out.println();
		int year = Integer.valueOf(sc2.substring(0, 2));
		int month = Integer.valueOf(sc2.substring(2, 4));
		int day = Integer.valueOf(sc2.substring(5, 6));
		
		System.out.printf("19%d년 %4d월 %4d일 %4S", year, month, day, gender);
		System.out.println();
//		String g = sc2.substring(5,6);
//		String gn = "";
//		if( g.equals("1") || g.equals("3") || g.equals("5") || g.equals("7") || g.equals("9")){
//			gn = "남성";
//		} else {
//		    gn = "여성";
//		}
		
//		String bYear = (sex == "3" || sex == "4") ? "20" + yy : "19" + yy;
		
		// 1990년 12월 25일 *요일 남성 출력 (한자로)
		
		String yy = sc2.substring(0,2);
		String mm = sc2.substring(2,4);
		String dd = sc2.substring(4,6);
		int y = Integer.valueOf(yy);
		int m = Integer.valueOf(mm);
		int d = Integer.valueOf(dd);
		Date oneday = new Date(y, m-1, d, 11, 20, 30);
		System.out.println(oneday.toLocaleString());
		int wkday = oneday.getDay();
		String wk = "";
		switch (wkday) {
		case 0: wk = "월요일"; break;
		case 1: wk = "화요일"; break;
		case 2: wk = "수요일"; break;
		case 3: wk = "목요일"; break;
		case 4: wk = "금요일"; break;
		case 5: wk = "토요일"; break;
		case 6: wk = "일요일"; break;
		}
		System.out.printf("19%d年 %4d月 %4d日 %4S %4S", year, month, day, wk, gender);
		System.out.println();
		
		// leading 0	35 -> 0035
		
		// 세자리마다 , 출력하기
		
		// ~로 시작하는
		String name1 = "김유신";
		System.out.println(name1.startsWith("김")); // true (startsWith)
		
		// ~로 끝나는
		String name2 = "이순신";
		System.out.println(name2.endsWith("신")); // true (endsWith)

		// 문자열을 문자 배열로
		String string   = "abcdefghijklmnopqrstuvwxyz";
		char [] charArr = string.toCharArray();
		for (int i = 0; i < charArr.length; i++) {
			System.out.println(i + ": " + charArr[i]);
		}
		
		// 문자열을 token으로 분리하여 문자 배열로 만들기
		String str  = "1,김일,부산,27";
		String [] s = str.split(","); // , 로 구분하여 문자열을 자른다. 
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}

}
