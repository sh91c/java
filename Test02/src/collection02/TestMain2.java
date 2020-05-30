package collection02;

import java.util.List;
import java.util.Vector;

public class TestMain2 {

	public static void main(String[] args) {
		// Vector 사용.. Vector는 ArrayList의 Thread Safe 버전이다.
		
		
		List<Board> list = new Vector<Board>();

		System.out.println("자료없음: " + list.isEmpty());
		System.out.println("자료 추가 중...");
		
		list.add(new Board(1, "제목1", "내용1"));
		list.add(new Board(2, "제목2", "내용2"));
		list.add(new Board(3, "제목3", "내용3"));
		list.add(new Board(4, "제목4", "내용4"));
		list.add(new Board(5, "제목5", "내용5"));
		list.add(new Board(6, "제목6", "내용6"));

		System.out.println("자료없음: " + list.isEmpty());
		System.out.println("자료 수: " + list.size());
		
		listDisplay(list);
		
		list.remove(2);
		listDisplay(list);
		
		System.out.println("자료 초기화 중...");
		list.clear();
		System.out.println("자료없음: " + list.isEmpty());
	}
	private static void listDisplay(List<Board> list) {
		System.out.println("=============================");
		for (Board board : list) {
			System.out.println(board);
		}
	}
	
}
