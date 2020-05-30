package collection02;

public class Board {
	// 필드
	private int	   bnum;
	private String subject;
	private String content;
	
	// 생성자
	public Board(int bnum, String subject, String content) {
		this.bnum = bnum;
		this.subject = subject;
		this.content = content;
	}

	@Override
	public String toString() {
		return "Board [bnum=" + bnum + ", subject=" + subject + ", content=" + content + "]";
	}
	
	
	
}
