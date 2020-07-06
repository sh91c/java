package com.pknu.member.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// DB Connection 작성하는 객체

// patterns
// Singleton pattern : 객체가 인스턴스화를 한번에 하나만 구현. = 한번만 new 하도록 재활용(효율)의 목적
// 대표적인 함수 : getInstance() 
public class DBConn {
	private static String driver = "oracle.jdbc.OracleDriver";
	private static String url    = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String userid = "member2";
	private static String userpw = "oracle";
	
	private static Connection conn;
	
	// Singleton pattern..
	// 생성자를 private으로 만듬. <- 중요.. 싱글턴패턴에서 사용하기 때문에
	// private 이유: 현재 자신인 DBConn.java 클래스 안에서만 인스턴스화 가능..
	// 외부 클래스에서 사용할 시 getInstance()를 사용해 인스턴스화 하겠다는 말.
	private DBConn(){  
	}
	
	public static Connection getInstance() {
		return getConnection();
	}

	// getConnection 함수를 통해 생성자가 만들어졌는지 체크.
	public static Connection getConnection() {
		// new 되어있는 conn 객체가 있으면 conn 객체 return하고 종료
		if(conn != null) {
			return conn;
		} else {
		// conn 객체가 new 되지 않았으면 인스턴스화 진행.
			try {
				Class.forName(driver);
				conn = DriverManager.getConnection(url, userid, userpw);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return conn;			
		}
	}
}
