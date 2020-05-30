package ex07;

public class MainCl {

	public static void main(String[] args) {
		AccCl acc1 = new AccCl("john",10000.0);
		AccCl acc2 = new AccCl("smith",130000.0);
		
		System.out.println(acc1);
		acc1.withdraw(11000);
		System.out.println(acc1);
	}

}
