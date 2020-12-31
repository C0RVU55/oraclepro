package com.javaex.phone;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PhoneDao {

	// 필드
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String id = "webdb";
	private String pw = "webdb";
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	int count = 0;
	// 생성자
	// 메소드 겟셋
	// 메소드 일반

		
	public void getConnection() {
		
	}
	
	public void close() {
		  try {
		        if (rs != null) {
		            rs.close();
		        }                
		        if (pstmt != null) {
		            pstmt.close();
		        }
		        if (conn != null) {
		            conn.close();
		        }
		    } catch (SQLException e) {
		        System.out.println("error:" + e);
		    }
	}
	
	public List<PhoneVo> getList() {
		List<PhoneVo> pList = new ArrayList<PhoneVo>();
		try {
		    // 1. JDBC 드라이버 (Oracle) 로딩

		    // 2. Connection 얻어오기

		    // 3. SQL문 준비 / 바인딩 / 실행
		    
		    // 4.결과처리

		} catch (ClassNotFoundException e) {
		    System.out.println("error: 드라이버 로딩 실패 - " + e);
		} catch (SQLException e) {
		    System.out.println("error:" + e);
		} 
		return pList;
	}
	
	public int phoneInsert() {
		try {
		    // 1. JDBC 드라이버 (Oracle) 로딩

		    // 2. Connection 얻어오기

		    // 3. SQL문 준비 / 바인딩 / 실행
		    
		    // 4.결과처리

		} catch (ClassNotFoundException e) {
		    System.out.println("error: 드라이버 로딩 실패 - " + e);
		} catch (SQLException e) {
		    System.out.println("error:" + e);
		} 
		return count;
	}
	
	public int phoneUpdate() {
		try {
		    // 1. JDBC 드라이버 (Oracle) 로딩

		    // 2. Connection 얻어오기

		    // 3. SQL문 준비 / 바인딩 / 실행
		    
		    // 4.결과처리

		} catch (ClassNotFoundException e) {
		    System.out.println("error: 드라이버 로딩 실패 - " + e);
		} catch (SQLException e) {
		    System.out.println("error:" + e);
		} 
		return count;
	}
	
	public int phoneDelete() {
		try {
		    // 1. JDBC 드라이버 (Oracle) 로딩

		    // 2. Connection 얻어오기

		    // 3. SQL문 준비 / 바인딩 / 실행
		    
		    // 4.결과처리

		} catch (ClassNotFoundException e) {
		    System.out.println("error: 드라이버 로딩 실패 - " + e);
		} catch (SQLException e) {
		    System.out.println("error:" + e);
		}
		return count;
	}
	
	public List<PhoneVo> phoneSearch(){
		List<PhoneVo> pList = new ArrayList<PhoneVo>();
		
		return pList;
	}
	
	
}
