package ex07;

public class TestMain {
	// 계좌 정보 조회, 입출금 구현
	public static void main(String[] args) {
		Account acc1 = new Account("채수빈", 100000.0);
		Account acc2 = new Account("신세경", 10000.0);
		
		System.out.println(acc1.toString());
		System.out.println(acc2.toString());
		System.out.println();
		
		acc1.deposit(90000.0);
		acc2.deposit(120000.0);
		
		System.out.println(acc1.toString());
		System.out.println(acc2.toString());
		System.out.println();
		
		acc1.deposit(-90000.0);
		System.out.println(acc1.toString());
		System.out.println();
		
		try {
			acc2.withdraw(50000.0);
//			System.out.println(acc2.toString());
			System.out.println(acc2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
