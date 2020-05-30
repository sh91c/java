package ex02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestMain {

	private static String driver = "oracle.jdbc.OracleDriver";
	private static String url    = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String dbuid  = "hr";
	private static String dbpwd  = "oracle";
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, dbuid, dbpwd);
		Statement  stmt = conn.createStatement();
//		String     sql  =  " SELECT        D.DEPARTMENT_NAME DNAME ";
//				   sql  += "            , TO_CHAR(ROUND(AVG(E.SALARY),3), '$99,999,999.00') AVGSAL "; 
//				   sql  += " FROM        DEPARTMENTS D, EMPLOYEES E ";
//			       sql  += " WHERE       D.DEPARTMENT_ID = E.DEPARTMENT_ID "; 
//				   sql  += " GROUP BY    D.DEPARTMENT_NAME ";
//				   sql  += " ORDER BY    D.DEPARTMENT_NAME";
		
		String     sql   = "SELECT      D.DEPARTMENT_NAME DNAME, TO_CHAR(ROUND(NVL(AVG(E.SALARY),0),2), '$99,990.00') AVGSAL\n"; 
				   sql  += "FROM        DEPARTMENTS D LEFT JOIN EMPLOYEES E\n";
				   sql  += "ON          D.DEPARTMENT_ID = E.DEPARTMENT_ID\n";
				   sql  += "GROUP BY    D.DEPARTMENT_NAME\n";
				   sql  += "ORDER BY    1";
				   // 여기에는 쿼리에 ; 붙이면 오류뜸
				   
   	    System.out.println("Query1:\n" + sql);
				   
		ResultSet  rs   = stmt.executeQuery(sql);
		
		System.out.println("========================================\n"
						+ "부서명                         월급평균\n"
						 + "========================================");
		
		while(rs.next()) {
			String dname  = rs.getString("dname");
			String avgsal = rs.getString("avgsal");
			String fmt    = "%-20s        %10s";
			String msg    = String.format(fmt, dname,avgsal);
			System.out.println(msg);
		}
		
		rs.close();
		stmt.close();
		conn.close();
		

	}

}
