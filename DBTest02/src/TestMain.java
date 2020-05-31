import java.util.List;

public class TestMain {

	public static void main(String[] args) {
		DBHandler      db = new DBHandler();
		
		// 모든 회원 조회
		System.out.println("===================================================================");
		List<Member> list = db.getMemberList();
		
		for (Member member : list) {
			System.out.println(member.listInfo());
		}
		
		// 특정 회원 조회
		System.out.println("===================================================================");
		int mid  = 1;         
		Member m = db.getMember(mid);
		if(m == null) System.out.println(mid + "번에 대한 조회할 자료가 없습니다.");
		
		System.out.println(m.info());
		
		// 회원 추가(insert)
		Member m2 = new Member("소연", "SY@naver.com" , "010-7777-1111");
		int cnt = db.addMember(m2);
		System.out.println(cnt + "건 추가되었습니다.");
		
		
		db.close();
		
		
	}

}
