import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

// DB open과 close, data를 사용할 목적으로 작성

public class DBHandler {
	//field
	private String driver = "oracle.jdbc.OracleDriver";
	private String url    = "jdbc:oracle:thin:@localhost:1521:xe";
	private String userid = "testdb";
	private String userpw = "oracle";
	
	private Connection conn;
	private Statement  stmt;
	private ResultSet  rs;
	
	
	//constructor
	public DBHandler() {
		open();
	};
	
	public void open() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, userid, userpw);
			stmt = conn.createStatement();
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void close() {
		try {
			if(rs   != null) rs.close();
			if(stmt != null) stmt.close();
			if(conn != null) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// Member 전체 목록 조회..MID, NAME, EMAIL, ML.MLEVEL, RDATE
	public List<Member> getMemberList() {
		List<Member> list = new ArrayList<Member>();
		
		try {
			stmt       = conn.createStatement();
			String sql = "SELECT   M.MID MID, M.NAME NAME, M.EMAIL EMAIL, ML.MLEVEL MLEVEL\n" + 
						 "        ,TO_CHAR(M.RDATE, 'YY-MM-DD') RDATE\n" + 
						 "FROM    MEMBER M, MEMBERLEVEL ML\n" + 
						 "WHERE   M.POINT BETWEEN ML.LOPOINT AND ML.HIPOINT ";
			rs         = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int      mid  = rs.getInt("mid");
				String  name  = rs.getString("name");
				String email  = rs.getString("email");
				String mlevel = rs.getString("mlevel");
				String rdate  = rs.getString("rdate");
				Member m = new Member(mid, name, email, mlevel, rdate);
				
				list.add(m);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return list;
	}

	// 특정 회원 조회
	public Member getMember(int mid) {
		Member m = null; // 조회할 자료가 없을 때 null
		try {
			stmt       = conn.createStatement();
			String sql = "SELECT   M.MID MID, M.NAME NAME, M.EMAIL EMAIL, M.PHONE PHONE, M.POINT POINT, ML.MLEVEL MLEVEL \n" + 
						 "        ,TO_CHAR(M.RDATE, 'YYYY-MM-DD DAY') RDATE\n" + 
						 "FROM    MEMBER M, MEMBERLEVEL ML\n" + 
						 "WHERE   M.POINT BETWEEN ML.LOPOINT AND ML.HIPOINT\n" + 
						 "AND     MID = "+ mid;
			rs         = stmt.executeQuery(sql);
			if( rs.next() ) { // 하나만 조회하기 때문에 while을 사용하지 않음
				String   name = rs.getString("name");
				String  email = rs.getString("email");
				String  phone = rs.getString("phone");
				int     point = rs.getInt("point");
				String mlevel = rs.getString("mlevel");
				String  rdate = rs.getString("rdate");
				
				m = new Member(mid, name, email, phone, point, mlevel, rdate);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return m;
	}
	
	// 회원 추가
	public int addMember(Member m) {
		int aftcnt = 0;
		try {
			stmt       = conn.createStatement();
			String sql = "INSERT INTO MEMBER (MID, NAME, EMAIL, PHONE)\n" + 
						 "VALUES             ((SELECT NVL(MAX(MID),0) + 1 FROM MEMBER)\n" + 
						 "                    , '"+ m.getName() +"', '"+ m.getEmail() +"', '"+ m.getPhone() +"') ";
			aftcnt = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return aftcnt;
	}
	
}
