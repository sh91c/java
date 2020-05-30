package ex01;

public class TestMain {
	// 성적처리 - 클래스를 사용하지 않았을 때 
	public static void main(String[] args) {
		int    num  = 01;
		String name = "아이유";
		int    kor  = 100;
		int    eng  = 100;
		int    mat  = 100;
		
		int tot1     = sum(kor, eng, mat);
		int avg1     = avg(kor, eng, mat);
		
		System.out.printf("번호: %4d 이름: %4s 총점: %4d 평균: %4d", num, name, tot1, avg1);
	}

	private static int avg(int kor, int eng, int mat) {
		int avg1 = (int)((kor + eng + mat) / 3.0 + 0.5);
		return avg1;
	}

	private static int sum(int kor, int eng, int mat) {
		int tot1 = kor + eng + mat;
		return tot1;
	}

}
