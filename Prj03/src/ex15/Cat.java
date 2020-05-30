package ex15;
	// interface 는 implements (구현) 한다 - 상속과 같은 뜻이지만 말이 다름.
	// 하지만 구현은 약간의 제한이 있어서 상속과 분리한다.
public class Cat implements IPet{ // -> add unimplemented methods
	String name;
	
	
	@Override
	public void cry() {
		System.out.println(name + "이 야옹하고 운다.");

	} 

}
