package ex01.generic3;

class Car {}
class Tv {}

class Product<T, M> {
	T kind; // 종류 Tv t;
	M model; // 모델 Model m;
	
	public Product() {}
	public Product(T kind, M model) {
		this.kind = kind;
		this.model = model;
	}
}

// 상속이 가능함
class NewProduct<T, M, C> extends Product<T, M> {
	C color;

	public NewProduct(T kind, M model, C color) {
		super(kind, model);
//		this.kind  = kind;
//		this.model = model;
		this.color = color;
	}
}

public class TestMain {

	public static void main(String[] args) {
		Product<Tv, String> p1  			 = new Product<Tv, String>();
		p1.kind				    			 = new Tv();
		p1.model			    			 = "Smart TV";
		
		Car d520							 = new Car();
		Product<Car, String> p2			 	 = new Product<>();
//		p2.kind							     = new Car();
		p2.kind								 = d520;
		p2.model							 = "Benz 520d";
		
		// Product를 상속받은 NewProduct 사용하기
		NewProduct<Car, String, Integer> np1 = new NewProduct<>(d520, "520d", 0xff0000);
		

	}

}
