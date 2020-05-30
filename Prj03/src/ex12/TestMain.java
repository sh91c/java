package ex12;

class InstCnt {
	//int instNum = 0; 기존
	static int instNum = 0; // static 사용
	InstCnt(){
		instNum = instNum + 1;
		System.out.println(instNum);
	}
}

public class TestMain {

	public static void main(String[] args) {
		InstCnt ic1 = new InstCnt(); // static을 사용했을 때 출력 : 0 + 1 -> 1
		InstCnt ic2 = new InstCnt(); //								1 + 1 -> 2
		InstCnt ic3 = new InstCnt(); //								2 + 1 -> 3
		// 이미 다른 영역에 있는 static 변수를 재활용한다.

	}

}
