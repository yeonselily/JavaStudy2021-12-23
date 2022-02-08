package a22_데이터베이스;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import a22_데이터베이스.Dto.User;
import db.DBConnectionMgr;

public class InsertData {
	
	private DBConnectionMgr pool; 
	
	public InsertData(DBConnectionMgr pool) {
		this.pool = pool; 
	}
	
	public void InserUser(User user) {
		String sql = null; 
		
		Connection con = null; 
		PreparedStatement pstmt = null; 
		
		try {
			con = pool.getConnection();
			sql = "insert into user_mst values(0, ?, ?, ?, ?, now(), now())"; 
			pstmt = con.prepareStatement(sql); 
			pstmt.setString(1, user.getUsername());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getName());
			pstmt.setString(4, user.getEmail());
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		
		System.out.println("회원 가입 완료");
	}
	
	public User getUser(String username) {
		String sql = null; 
		
		Connection con = null; 
		PreparedStatement pstmt = null; 
		ResultSet rs = null; 
		User user = null;
		
		try {
			con = pool.getConnection();
			sql = "select * from user_mst where username = ?"; 
			pstmt = con.prepareStatement(sql); 
			pstmt.setString(1, username);
			rs = pstmt.executeQuery(); //select만
			
			rs.next(); 
			
			user = User.builder()
					.user_code(rs.getInt(1))
					.username(rs.getString(2))
					.password(rs.getString(3))
					.name(rs.getString(4))
					.email(rs.getString(5))
					.build(); 
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		
		return user; 
	}
	public static void main(String[] args) {
		InsertData insertData = new InsertData(DBConnectionMgr.getInstance());
		User user1 = User.builder()
						 .username("abc")
						 .password("1234")
						 .name("박세연")
						 .email("seyeonyeah@gmail.com")
						 .phone("010-7547-4596")
						 .addr("부산 연제구")
						 .build();
		// insertData.InserUser(user1); 		
		System.out.println(insertData.getUser("abc"));
	}

}
