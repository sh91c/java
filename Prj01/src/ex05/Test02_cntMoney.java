package ex05;

public class Test02_cntMoney {
	// 돈 자판기
	public static void main(String[] args) {
		int money = 78414350;
		int [] currency = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		int [] cnt = new int [10];
		
		int m = money;		
		
		for(int i=0;i<cnt.length;i++) {
			cnt[i] = m / currency[i];
			m      = m - currency[i] * cnt[i];
		}
		System.out.println("기존금액: " + money + "원");
		
		for (int i = 0; i < cnt.length; i++) {
			System.out.printf("%6d원: %10d장\n", currency[i], cnt[i]);
		}
		
	}

}
