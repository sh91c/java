package comparableExam;

// treeSet을 사용하는 이유 : 중복하지 않고 tree를 저장하기 위해서.

// TreeSet에 사용할 객체는 반드시 implements Comparable<Person> 해야한다.
// implements 하지 않으면 java.lang.ClassCassException 예외 발생함.
// 내부적으로 compare()를 호출함. -> compareTo()를 override 해야함.

import java.util.Iterator;
import java.util.TreeSet;

public class TestComparable {

	public static void main(String[] args) {
		// 옵션 : 나이가 같으면 저장하지 않기.
		TreeSet<Person> treeSet		= new TreeSet<>();
		
		treeSet.add(new Person("홍길동", 1));
		treeSet.add(new Person("홍길순", 2));
		treeSet.add(new Person("박지원", 3));
		treeSet.add(new Person("홍길동", 1));
		treeSet.add(new Person("고길동", 4));
		
		for(Iterator<Person> iterator = treeSet.iterator(); iterator.hasNext();) {
			Person person = (Person) iterator.next();
			System.out.println(person.num + ", " + person.name);
		}

	}

}
