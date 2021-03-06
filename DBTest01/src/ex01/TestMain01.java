package ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestMain01 {
	
	// oracle과 연결
	// driver 프로그램 필요: ojdbc.jar
	private static String driver = "oracle.jdbc.OracleDriver";
	private static String url    = "jdbc:oracle:thin:@localhost:1521:xe";
    private static String dbuid  = "hr";
	private static String dbpwd  = "oracle";
		
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	      Class.forName(driver);
	      // db connection 과 동시에 open됨
	      Connection conn = DriverManager.getConnection(url, dbuid, dbpwd);
	      // Statement: db 명령어를 입력받는 상태와 동시에 open됨
	      Statement  stmt = conn.createStatement();
	      // Statment는 SQL문만 실행함
	      // CallableStatement 스~프리시저를 실행할 때
	      // PrefaredStatement?: Statement의 단점을 개선
	      
	      //String    sql = "SELECT FIRST_NAME, LAST_NAME FROM EMPLOYEES";
	      String    sql  = "SELECT  D.DEPARTMENT_NAME,";
	      
	      			// E.FIRST_NAME || ' ' || E.LAST_NAME는 자바에서 사용할 수 없기 때문에
	      			// Alias를 사용해서 NAME으로 지정했음
	                sql += "E.FIRST_NAME || ' ' || E.LAST_NAME AS NAME ";
	                sql += "FROM  EMPLOYEES E, DEPARTMENTS D ";
	                sql += "WHERE E.DEPARTMENT_ID = D.DEPARTMENT_ID";
	      
	      System.out.println("sql1:" + sql);
	            
	      // SQL명령문을 입력받는 동시에 ctrl + enter 실행하게됨
	      // executeQeury -> select 만을 사용하기 위함
	      // executeUpdate -> create, alter, drop, insert, delete, update를 사용하기 위함
	      ResultSet rs  = stmt.executeQuery(sql); // 커서 역할을 하게 됨
	      
	      System.out.println("부서번호,이름");
	      System.out.println("==================");
	      while(rs.next()) { // PATCH: 1 row를 들고옴
	    	  // rs.next()는 자료가 있으면 TRUE, 없으면 FALSE가 되면서 break;
	    	  
	    	  // 1 row 를 들고오며 컬럼에 맞는 데이터를 담음
	          String dname = rs.getString("DEPARTMENT_NAME");
	          String ename = rs.getString("NAME");
	          
	          // 출력하고 다시 rs.next() 반복
	          System.out.println(dname + "\t" + ename);
	      }
	      
	      // open된 객체들을 close
	      rs.close();
	      stmt.close();
	      conn.close();
    }
}