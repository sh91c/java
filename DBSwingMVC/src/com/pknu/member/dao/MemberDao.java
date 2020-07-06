package com.pknu.member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.pknu.member.vo.MemberVO;

public class MemberDao {
	private  Connection          conn;
	private  PreparedStatement   pstmt;
	private  ResultSet		     rs;
	
	// constructor
	public MemberDao() {};
	
	// method
	private void close() {
		try {
			if(conn  != null) conn.close();
			if(pstmt != null) pstmt.close();
			if(rs    != null) rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
		// 한 회원의 정보만 조회
	public MemberVO getmember(String userid) {
		MemberVO mem = null;

		try {
			// db연결
			conn  = DBConn.getInstance();
			String sql = "SELECT      id, pwd, name, job, gender, intro, regdate\n" + 
						 "FROM        member2\n" + 
						 "where       id = ? ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			rs    = pstmt.executeQuery();
			if( rs.next() ) {
//				String id      = rs.getString("id");
//				String pwd     = rs.getString("pwd");
//				String name    = rs.getString("name");
//				String job     = rs.getString("job");
//				String gender  = rs.getString("gender");
//				String intro   = rs.getString("intro");
//				String regdate = rs.getString("regdate");
				
				String[] cols = new String[7];
				for (int i = 0; i < cols.length; i++) {
					cols[i] = rs.getString( i+1 );
				}
				mem = new MemberVO(cols);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return mem;
	}
}
