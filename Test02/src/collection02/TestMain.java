package collection02;

import java.util.ArrayList;
// import 단축키 : Ctrl + Shift + O

public class TestMain {

	public static void main(String[] args) {
	ArrayList<Board> boardList = new ArrayList<Board>();

	boardList.add(new Board(1, "제목1", "내용1"));
	boardList.add(new Board(2, "제목2", "내용2"));
	boardList.add(new Board(3, "제목3", "내용3"));
	boardList.add(new Board(4, "제목4", "내용4"));
	boardList.add(new Board(5, "제목5", "내용5"));
	boardList.add(new Board(6, "제목6", "내용6"));
	
	listDisplay(boardList);
	}

	private static void listDisplay(ArrayList<Board> boardList) {
		System.out.println("=============================");
		for (Board board : boardList) {
			System.out.println(board);
		}
	}

}
