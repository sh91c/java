package comparableExam;

public class Person implements Comparable<Person> {
	// treeSet을 사용하려면 interface를 상속받아야함.
	// 그리고 해당 클래스의 add unimplemented~ 해서 compareTo()를 재정의 해야함
	String name;
	int num;
	
	
	public Person(String name, int num) {
		this.name = name;
		this.num = num;
	}


	// 중복을 막기위한 비교 작성
	@Override
	public int compareTo(Person o) {
		return num - o.num;
	}
	
	
}
