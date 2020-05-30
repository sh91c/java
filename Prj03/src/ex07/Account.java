package ex07;
	// 계좌
public class Account {
	// Fields
	private String name;  // 1. 이름
	private double money; // 2. 돈 정보
	
	// constructor
	public Account() {}   // 3. 기본 생성자
		// 4. 신규 계좌 생성
	public Account(String name, double money) {
		this.name = name;
		this.money = money;
	}
	
	// Getter, Setter <- 직접적으로 계좌를 건드리는 것은 위험하기 때문에 사용하지 않음.
	
	// Methods
		// 5. 잔액 확인 : 현재 돈의 잔액을 확인할 수 있지만 수정 되면 안됨. 입출금제외.
	public double getBalance() {
		return this.money;
	}
	// 6. 출금(인출)
	public void withdraw(double amount) throws Exception {
		if(this.money > amount) {
			this.money -= amount;
			System.out.println(amount + "원 출금되었습니다.");
		} else {
			throw new Exception("잔액이 부족합니다.");
		} 
	}
		// 7. 입금
	public void deposit(double amount) {
		if(amount > 0) {
			this.money += amount;
		} else {
			System.out.println("입금액을 정확이 입력하세요.");
		}
	}
	
	// 현재 정보 출력 info() -> toString()
//	public String info() {
//		String fmt = "%s님의 계좌 잔액은 %.3f원 입니다.";
//		String msg = String.format(fmt, name, money);
//		return msg;
//	}
	@Override // 8. 객체 정보를 출력할 때 사용. ( generate toString() 메뉴 사용 )
	public String toString() {
//		return "Account [name=" + name + ", money=" + money + "]";
		String fmt = "%s님의 계좌 잔액은 %.3f원 입니다.";
		String msg = String.format(fmt, name, money);
		return msg;
	}
	
}
