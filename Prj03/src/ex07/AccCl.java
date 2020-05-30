package ex07;

public class AccCl {
	// fields
	private String name;
	private double money;
	
	// get set
	
	
	// constructor
	public AccCl() {}

	public AccCl(String name, double money) {
		this.name = name;
		this.money = money;
	}
	
	// method
	public double getBalance() {
		return this.money;
	}
	
	public void deposit(double money) {
		this.money = this.money + money;
		if(money > 0) {
			String fmt = "%.1f원이 입금되었습니다. %s님의 잔액은 %.1f원입니다.";
			String msg = String.format(fmt, money, this.name, this.money);
			System.out.println(msg);
			}
		else {
			System.out.println("입금액을 정확히 입력해주세요.");
		}
	}
	
	public void withdraw(double money) {
		if(this.money >= money) {
			this.money = this.money - money;
			String fmt = "%.1f원이 출금되었습니다. %s님의 잔액은 %.1f원입니다.";
			String msg = String.format(fmt, money, this.name, this.money);
			System.out.println(msg);
		}
		else {
			System.out.println("잔액이 부족합니다.");
		}
			
	}

	@Override
	public String toString() {
		return "[계좌 정보: " + this.name + "님의 계좌 잔액은 " + this.money + "원 입니다.]";
	}
	
	
}
