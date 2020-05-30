package ex04;

import java.util.Scanner;
// check digit를 활용한 주민등록번호 일치 / 불일치 만들기
public class Test06_citizenNum {
	public static void main(String[] args) {
		// 1 2 3 4 5 6 - 7 8 9 0 1 2 3 : int는 한번에 받을 수 있는 자리수가 11자리(부호포함)이다.
		int [] nid = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3 }; // 주민등록번호 13자리
		int [] m   = { 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5 };    // 일치 계산 번호 12자리
		
		int sum = 0;
		
		for(int i=0; i<m.length;i++) {
			sum = sum + nid[i] * m[i];
		}
		int chk = 11 - sum % 11;
		
//		if(chk>=10) {
//			chk = chk - 10;
//		}
		
		chk = chk % 10;
		
		System.out.println(sum + ", " + chk);
		
		if(chk == nid[12]) {
			System.out.println("주민등록번호 일치!");
		} else {
			System.out.println("주민등록번호 불일치!");
		}
	}
}


// 문자열을 한번에 받는 방법이 있음 -> 문자 조작 함수