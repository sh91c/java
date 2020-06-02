package preparedStatement1;

import java.util.List;

public class TestMain {

	private static DBHandler db;

	public static void main(String[] args) {
		db = new DBHandler();
		
		displayMemberList();
		
		// 회원 추가
		Member insertM = new Member("다솔", "DS@naver.com", "010-9876-8888");
		int insertCnt  = db.addMember(insertM);
		System.out.println(insertCnt + "건 추가되었습니다.");
		displayMemberList();
		
		// 회원 수정 :          mid, name, email, phone, point
		Member updateM = new Member( 9, "석준", "SJ@naver.com", "010-6767-7878", 3500);
		int updateCnt  = db.updateMember(updateM);
		System.out.println(insertCnt + "건 수정되었습니다.");
		
		// 회원 삭제
		
		
		// 특정 회원 조회
		

		
		db.close();
	}

	private static void displayMemberList() {
		// 목록 조회
		List<Member> mlist = db.getMemberList();
		System.out.println("====================회원 전체 목록====================");
		for (Member member : mlist) {
			System.out.println(member.listInfo());
		}
		
	}

}
