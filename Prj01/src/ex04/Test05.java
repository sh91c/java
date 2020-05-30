package ex04;

import java.util.Scanner;

public class Test05 {
	// 2009 2010 2011 2012 2013 2014 2015 2016 2017 2018 2019 2020
	// 소   호랑 토끼 용   뱀   말   양   원숭 닭   개  돼지  쥐
	// 5    6    7    8    9    10   11   0    1    2   3     4
	// 12를 나눈 나머지 : 0 ~ 11
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int birthYear = 0;
		String age = "";
		String aName="";
		
		// 입력
		System.out.println("태어난 년도 4자리를 입력해주세요. 예) 1991");
		System.out.print("입력: ");
		birthYear = in.nextInt();
		aName = getValue(birthYear);
		age = getAge(birthYear);
		
		//출력
		System.out.println("당신은 " + age);
		System.out.println(aName +"띠이며, ");

	}

	private static String getAge(int birthYear) {
		int thisYear = 2020;
		String adult="";
		int val;
		val = (thisYear - birthYear) + 1;
		if(val >= 19) {
			adult = "성인";
		} else {
			adult = "미성년자";
		};
		return val + "세이고, " + adult +"입니다.";
	}

	private static String getValue(int birthYear) {
		String aName="";
		switch(birthYear % 12) {
		case 0 : aName = "원숭이"; break;
		case 1 : aName = "닭"; break;
		case 2 : aName = "개"; break;
		case 3 : aName = "돼지"; break;
		case 4 : aName = "쥐"; break;
		case 5 : aName = "소"; break;
		case 6 : aName = "호랑이"; break;
		case 7 : aName = "토끼"; break;
		case 8 : aName = "용"; break;
		case 9 : aName = "뱀"; break;
		case 10 : aName = "말"; break;
		case 11 : aName = "양"; break;
		}
		return aName;
	}
}
