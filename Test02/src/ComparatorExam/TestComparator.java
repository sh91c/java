package ComparatorExam;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Fruit {
	String name;
	int    price;
	
	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}
}

class DescendingComparator implements Comparator<Fruit>{
                                       
	@Override
	public int compare(Fruit o1, Fruit o2) {
		return o2.price - o1.price;
	}
	
}

class DescendingComparatorByName implements Comparator<Fruit>{

	@Override
	public int compare(Fruit o1, Fruit o2) {
		return o2.name.compareTo(o1.name);
	}
	
}

public class TestComparator {

	public static void main(String[] args) {
		
//		TreeSet<Fruit> treeSet = new TreeSet<>();	// error (Comparable 사용X, Fruit클래스를 수정못한다는 전제 하에)
//		TreeSet<Fruit> treeSet = new TreeSet<>(new DescendingComparator()); // 가격 내림차순
		TreeSet<Fruit> treeSet = new TreeSet<>(new DescendingComparatorByName()); // 이름 내림차순
		
		treeSet.add(new Fruit("포도", 3000));
		treeSet.add(new Fruit("수박", 10000));
		treeSet.add(new Fruit("딸기", 6000));
		treeSet.add(new Fruit("딸기", 6000));
		treeSet.add(new Fruit("오렌지", 8000));
		
		System.out.println(treeSet.size());
		
		Iterator<Fruit> iter = treeSet.iterator();
		while(iter.hasNext()) {
			Fruit fruit = iter.next();
			System.out.println(fruit.name + " " + fruit.price);
		}
	}
}
