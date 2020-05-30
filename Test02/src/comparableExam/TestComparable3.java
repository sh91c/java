package comparableExam;

import java.util.TreeSet;

// 복습.. access modifier : 한정자 (접근제한자)
//public		: 모든 클래스 내부에서 허용되는 전역변수
//private 		: 클래스 내부에서만 허용되는 전역변수
//package (DEFAULT) 		: 같은 패키지 안에서 사용될 수 있는 전역변수 (아무것도 명시하지 않았을 때)
//protected		: 같은 패키지 및 상속받은 관계에서 사용될 수 있는 전역변수

// TreeSet에 사용되는 클래스는 반드시 comparable 인터페이스를 implemenets 해야한다.
// 작성하지 않으면 ClassCastException이 발생함.
class Student implements Comparable<Student>{
	private int    	  num;
	private String    name;
	private double    celcius;
		
	public int getNum() {
		return num;
	}
	public String getName() {
		return name;
	}
	public double getCelcius() {
		return celcius;
	}

	public Student(int num, String name, double celcius) {
		this.num = num;
		this.name = name;
		this.celcius = celcius;
	}
	
	@Override
	public int compareTo(Student o) { // (Object o)로 작성했다면
		return this.num - o.num;	  // return this.num - ((Student) o).num; 으로 Student 캐스팅 해야함
	}
}

public class TestComparable3 {

	public static void main(String[] args) {
		TreeSet<Student> treeSet = new TreeSet<>();
		
		treeSet.add(new Student(1, "태화", 36.4));
		treeSet.add(new Student(2, "석준", 36.9));
		treeSet.add(new Student(3, "원석", 36.8));
		treeSet.add(new Student(1, "태화", 36.4));
		
		System.out.println(treeSet.size());
		
	}

}
 