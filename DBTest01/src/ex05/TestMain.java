package ex05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class TestMain {

	private static String driver    = "oracle.jdbc.OracleDriver";
	private static String url       = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String userid    = "hrd202";
	private static String userpw    = "oracle";
	
	public static void main(String[] args) {
		ArrayList<StudentScore> list = getStudentScoreList();
		
		for (StudentScore studentScore : list) {
			System.out.println(studentScore.info());
		}
	}

	private static ArrayList<StudentScore> getStudentScoreList() {
		ArrayList<StudentScore> slist = new ArrayList<StudentScore>();
		Connection conn = null;
		Statement  stmt = null;
		ResultSet  rs   = null;
		
		try {
			Class.forName(driver);
			conn       = DriverManager.getConnection(url, userid, userpw);
			stmt       = conn.createStatement();
			String sql = "SELECT      st.stnum, st.stname, decode(sum(sc.score), null, '미응시', sum(sc.score)) totscore, \n" + 
						 "            decode(avg(sc.score),null, '미응시', to_char(avg(sc.score),'999.99')) avgscore,\n" + 
						 "            case\n" + 
						 "                when avg(score) >= 90 then 'A'\n" + 
						 "                when avg(score) >= 80 then 'B'\n" + 
						 "                when avg(score) >= 70 then 'C'\n" + 
						 "                when avg(score) >= 60 then 'D'\n" + 
						 "                when avg(score) >= 50 then 'E'\n" + 
						 "                else                       'F'\n" + 
						 "            end grade,\n" + 
						 "            rank() over(order by avg(score) desc nulls last) rnk\n" + 
						 "FROM        student st left join scores sc\n" + 
						 "on          st.stnum = sc.stnum\n" + 
						 "group by    st.stnum, st.stname ";
			rs         = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int        stnum = rs.getInt("stnum");
				String    stname = rs.getString("stname");
				String  totscore = rs.getString("totscore"); // tot, avg는 미응시도 출력하기때문에 문자열 타입으로 선언해야함
				String  avgscore = rs.getString("avgscore");
				String     grade = rs.getString("grade");
				int         rank = rs.getInt("rnk");
				
				StudentScore sc = new StudentScore(stnum, stname, totscore, avgscore, grade, rank);
				slist.add(sc);
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
			}
		}
		
		return slist;
	}

}
