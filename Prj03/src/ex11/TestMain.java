package ex11;

public class TestMain {

	public static void main(String[] args) {
//		Person p1 = new Person();
//		p1.name = "채수빈";			// private에 대해 직접적으로 값을 대입할 수 없음
//		p1.tel  = "010-1111-1111";  
//		p1.info();
		
	Person p1 = new Person("아이유", "010-1111-1111"); // 1번 대안 : 생성자를 통해서 매개변수로
		// 데이터를 할당하는 방법으로 대체
	p1.info();
//	System.out.println("p1의 이름: " + p1.name);  // private이라 not visible 상태임.. error..
	System.out.println("p1의 이름: " + p1.getName()); // getter를 이용해 필드가 아닌 getter 함수를 읽어들임.
	
	Person pTemp = new Person();
//	pTemp.name = ""; // 키보드로 입력받은 값이라고 할 때(스캐너 사용했다 치고)
					 // private이라 not visible 상태 
	pTemp.setName("채수빈");
	}

}
