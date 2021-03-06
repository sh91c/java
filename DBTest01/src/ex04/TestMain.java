package ex04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class TestMain {
	
	private static String driver = "oracle.jdbc.OracleDriver";
	private static String url    = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private static String userid = "hrd202";
	private static String userpw = "oracle";
	
	public static void main(String[] args) {
		ArrayList<Student> list = getData();
		
		for (Student student : list) {
			System.out.println(student);
		}

	}

	private static ArrayList<Student> getData() {
		
		ArrayList<Student> slist = new ArrayList<Student>();
		// <- Student클래스를 ArrayList인 slist에 담기
		
		Connection conn = null;
		Statement  stmt = null;
		ResultSet  rs   = null;
		try {
			Class.forName(driver);
			conn        = DriverManager.getConnection(url, userid, userpw);
			stmt        = conn.createStatement();
			String sql  = "select stnum, stname, tel, to_char(indate, 'yyyy-mm-dd day') indate ";
		           sql += " from student";
		       
		    rs          = stmt.executeQuery(sql);
		    
		    while( rs.next() ){
		    	int    stnum  = rs.getInt("stnum");
		    	String stname = rs.getString("stname");
		    	String tel    = rs.getString("tel");
		    	String indate = rs.getString("indate");
		    	
		    	Student s     = new Student(stnum, stname, tel, indate);
		    	// -> 이 클래스를 ArrayList에 담기
		    	
		    	slist.add(s);
		    }
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs   != null) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return slist;
		
	}

}
