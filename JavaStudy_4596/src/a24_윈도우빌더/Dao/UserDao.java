package a24_윈도우빌더.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import a24_윈도우빌더.Dto.User;
import db.DBConnectionMgr;

/*
 * DAO란?
 * Database Access Object 
 * DB에 접근(Connection)하여 데이터의 CRUD를 담당하는 객체 
 * 
 * DTO란 ?
 * Data Transfer Object 
 * DB와 데이터 전달을 위해 중간에서 컬럼과 변수명을 매칭시켜주는 용도. 
 *  
 */

public class UserDao {
	private DBConnectionMgr pool; 
	
	public UserDao(DBConnectionMgr pool) {
		this.pool = pool; 
	}

	public int loginUserByUsernameAndPassword(String username, String password) {
		String sql = null; 
		Connection con = null; 
		PreparedStatement pstmt = null; 
		ResultSet rs = null;
		
		int login_flag = 3; 
		
		try {
		con = pool.getConnection();
		sql = "SELECT \r\n"
				+ "	COUNT(um.username) + COUNT(um2.PASSWORD) AS login_flag \r\n"
				+ "FROM \r\n"
				+ "	user_mst um \r\n"
				+ "	LEFT OUTER JOIN user_mst um2 ON(um2.user_code = um.user_code AND um2.password = ?) \r\n"
				+ "WHERE \r\n"
				+ "	um.username = ?";
		pstmt = con.prepareStatement(sql); 
		pstmt.setString(1, password); 
		pstmt.setString(2, username);
		rs = pstmt.executeQuery(); 		
		
		if(rs.next()) {
			login_flag = rs.getInt(1); 
		}
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		pool.freeConnection(con, pstmt, rs);
	}
		return login_flag; 
	}
	
	public User getUserByUsername(String username) {
		User user = null; 
		String sql = null; 
		
		Connection con = null; 
		PreparedStatement pstmt = null; 
		ResultSet rs = null; 
		try {
		con = pool.getConnection(); 
		sql = "SELECT \r\n"
				+ "	um.user_code,\r\n"
				+ "	um.username,\r\n"
				+ "	um.password,\r\n"
				+ "	um.name,\r\n"
				+ "	um.email,\r\n"
				+ "	ud.phone,\r\n"
				+ "	ud.addr\r\n"
				+ "FROM \r\n"
				+ "	user_mst um\r\n"
				+ "	LEFT OUTER JOIN user_dtl ud ON(ud.user_code = um.user_code)\r\n"
				+ "WHERE\r\n"
				+ "	um.username = ?";
		pstmt= con.prepareStatement(sql);
		rs = pstmt.executeQuery();
		if(rs.next()) {
			user = User.builder()
						.user_code(rs.getInt(1))
						.username(rs.getString(2))
						.password(rs.getString(3))
						.name(rs.getString(4))
						.email(rs.getString(5))
						.phone(rs.getString(6))
						.address(rs.getString(7))
						.build(); 
						
		}}catch(Exception e) {
			e.printStackTrace();
		}finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return user; 
	}
}
