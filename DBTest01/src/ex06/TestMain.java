package ex06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestMain {
	
	private static String driver    = "oracle.jdbc.OracleDriver";
	private static String url       = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String userid    = "hrd202";
	private static String userpw    = "oracle";

	public static void main(String[] args) {
		//addStudent("민성","010-1234-4321"); // 1번방법: 인자로 들어갈 이름과 전화번호 데이터
//		Student s1 = new Student("주희", "010-9999-9876"); // 2번 방법
//		addStudent(s1); // 2번 방법: 클래스로 넘겨받기
		
		addStudent(new Student("소연","010-1111-1111"));
		
	}

	private static void addStudent(Student stud) { // 2번 방법ㅣ 클래스로 입력받아 처리하기
		Connection conn = null;
		Statement  stmt = null;

		try {
			Class.forName(driver);
			conn       = DriverManager.getConnection(url, userid, userpw);
			stmt       = conn.createStatement();
			String sql = "INSERT INTO student (    stnum,                                stname,                          tel) \n" + 
					     "VALUES              (    SEQ_STNUM.nextval, '"+  stud.getStname() +"',    '" + stud.getTel() + "  ') ";
			
			System.out.println("sql1: " + sql);
			
			int aftcnt = stmt.executeUpdate(sql);
			System.out.println(aftcnt + "건 추가되었습니다.");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt != null ) stmt.close();
				if(conn != null ) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

	
	
	
	private static void addStudent(String name, String tel) { // 1번 방법: name과 tel로 인자를 넘겨받아 사용하기
		Connection conn = null;
		Statement  stmt = null;
//		ResultSet  rs   = null; 조회하는 결과를 보여주는 것이 아니라면 ResultSet은 사용하지 않음

		try {
			Class.forName(driver);
			conn       = DriverManager.getConnection(url, userid, userpw);
			stmt       = conn.createStatement();
			String sql = "INSERT INTO student (    stnum,                   stname,                tel) \n" + 
					     "VALUES              (    SEQ_STNUM.nextval, '"+ name +"',    '" + tel + "  ') "; // 인자로 사용될 데이터이기 때문에 변수를 사용
			
			System.out.println("sql1: " + sql);
			
			int aftcnt = stmt.executeUpdate(sql); // executeUpdate의 리턴값은 실행된 sql의 결과를 개수로 리턴해준다 0: 추가, 그 외: 추가되지 않음.
			// executeUpdate는 자동 COMMIT이 진행된다.
			// COMMIT을 하지 않은 채 DB를 조회하면 자바에서는 출력되지 않는다.
			// 이유는 DB의 Result는 메모리상의 데이터를 출력해주고, 자바는 디스크상에 존재하는 데이터를 출력해주기 때문이다.
			System.out.println(aftcnt + "건 추가되었습니다.");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
//				if(rs != null ) rs.close();
				if(stmt != null ) stmt.close();
				if(conn != null ) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}


}
