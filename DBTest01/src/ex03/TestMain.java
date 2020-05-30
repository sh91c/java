package ex03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.util.ArrayList;

public class TestMain {

	private static String driver = "oracle.jdbc.OracleDriver";
	private static String url    = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private static String userid = "hrd202";
	private static String userpw = "oracle";
	
	public static void main(String[] args) {
		ArrayList<String> list = getData();
		
		for (String student : list) {
			System.out.println(student);
		}
	}

	private static ArrayList<String> getData() {
	
		ArrayList<String> slist = new ArrayList();
		
		Connection conn = null;
		Statement  stmt = null;
		ResultSet  rs   = null;
		try {
			Class.forName(driver);		// 라이브러리 파일을 new 함
			conn       = DriverManager.getConnection(url, userid, userpw);
			stmt 	   = conn.createStatement();
			String sql  = "select stnum, stname, tel, to_char(indate, 'yyyy-mm-dd day') indate ";
			       sql += " from student";
			       
			rs         = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int    stnum   = rs.getInt("stnum");
				String stname  = rs.getString("stname");
				String tel     = rs.getString("tel");
				//Date   indate  = rs.getDate("indate");
				String indate  = rs.getString("indate");
				
				String pattern = "{0}    {1}    {2}    {3}";
				String msg     = MessageFormat.format(pattern,
						         stnum, stname, tel, indate);
				
				slist.add(msg);
				//System.out.println(msg);
			}
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버가 없습니다.");
		} catch (SQLException e) {
			System.out.println("오류: " + e.getMessage());
		} finally {
			try {
				if(rs != null  ) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
			}
		}
		return slist;
	}

}
