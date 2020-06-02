package preparedStatement1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBHandler {
	private String driver = "oracle.jdbc.OracleDriver";
	private String url    = "jdbc:oracle:thin:@localhost:1521:xe";
	private String userid = "testdb";
	private String userpw = "oracle";
	
	private Connection        conn  = null;
	private PreparedStatement pstmt = null;
	private ResultSet         rs    = null;
	
	
	public DBHandler() {
		open();
	}

	public Connection open() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, userid, userpw);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	};
	
	public void close() {
		try {
			if(rs    != null)    rs.close();
			if(pstmt != null) pstmt.close();
			if(conn  != null)  conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Member> getMemberList() {
		List<Member> mlist = new ArrayList<>();
		
		try {
			String sql = "SELECT      M.MID, M.NAME, M.EMAIL, ML.MLEVEL\n" + 
						 "FROM        MEMBER M JOIN MEMBERLEVEL ML\n" + 
						 "ON          M.POINT BETWEEN ML.LOPOINT AND ML.HIPOINT\n" +
						 "ORDER BY    1 ASC";
			pstmt      = conn.prepareStatement(sql);
			rs         = pstmt.executeQuery();
			while(rs.next()) {
				int       mid = rs.getInt("mid");
				String   name = rs.getString("name");
				String  email = rs.getString("email");
				String mlevel = rs.getString("mlevel");
				
				Member      m = new Member(mid, name, email, mlevel);
				
				mlist.add(m);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return mlist;
	}

	// insert Member
	public int addMember(Member insertM) {
		int cnt = 0;
		try {
			String sql = "INSERT INTO MEMBER ( MID, NAME, EMAIL, PHONE )\n" + 
						 "VALUES             ( (SELECT NVL(MAX(MID), 0) + 1 FROM MEMBER) \n" + 
						 "                    , ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, "원석"); // preparedStatement의 setString()은 자동으로 문자열 앞뒤에 ''가 붙음.
//			pstmt.setString(2, "OS@naver.com");
//			pstmt.setString(3, "010-2222-3333");
			pstmt.setString(1, insertM.getName());
			pstmt.setString(2, insertM.getEmail());
			pstmt.setString(3, insertM.getPhone());
			cnt    = pstmt.executeUpdate(); // 정수 값을 리턴함
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}

	// update Member
	public int updateMember(Member updateM) {
		int cnt = 0;
	
		return 0;
	};
	
}
