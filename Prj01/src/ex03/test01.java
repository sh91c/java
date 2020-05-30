package ex03;

public class test01 {
	public static void main(String[] args) {
		// bit연산자(왼쪽이 우선순위 1순위)
		// 모든 data를 bit단위(비트 끼리)로 연산한다.
		// ~ : NOT, & : AND, ^ : XOR, | : OR
		// <<, >>, >>> : bit Shift (들어오는 값이 <<: 0, >>: 부호 비트의 값, >>>: 0)
		
		
		
		// bit masking(특정 비트 추출)
		// 0 1 0 1 1 0 1 1 : 원본(91)
		// 0 0 0 1 1 0 0 0 : 추출 대상이 4, 5번째 값이라고 할 때(24)
		
		// 0 0 0 0 0 0 0 0 : 결과 : 0 
		// 0 0 0 0 1 0 0 0 : 결과 : 8
		// 0 0 0 1 0 0 0 0 : 결과 : 16
		// 0 0 0 1 1 0 0 0 : 결과 : 24
		
		int a      = 91;
		int mask   = 24;
		int result = a & mask;
		
		String msg = "";
		
		
		switch(result) {
		case 0  : msg = "mono, ssd X"; break;
		case 8  : msg = "mono, ssd O"; break;
		case 16 : msg = "color, ssd X"; break;
		case 24 : msg = "color, ssd O"; break;
		}
		
		System.out.println(msg);
		
		result = 188;
	
		result = result >> 3;
		
		// 비트를 우측으로 3칸 밀어서 우측의 000 삭제됨
		// 0 0 0 0 0 0 0 0  : 결과 : 0 
		// 0 0 0 0 0 0 0 1  : 결과 : 1
		// 0 0 0 0 0 0 1 0  : 결과 : 2
		// 0 0 0 0 0 0 1 1  : 결과 : 3
		
		switch(result) {
		case 0  : msg = "mono, ssd X"; break;
		case 1  : msg = "mono, ssd O"; break;
		case 2 : msg = "color, ssd X"; break;
		case 3 : msg = "color, ssd O"; break;
		}
	}

}
