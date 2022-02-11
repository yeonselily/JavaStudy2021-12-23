package a22_데이터베이스;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import a22_데이터베이스.Dto.Product;
import db.DBConnectionMgr;

public class ProductDao {
	private DBConnectionMgr pool; 
	
	public ProductDao(DBConnectionMgr pool) {
		this.pool = pool;
	}
	
	public String insertProductSqlValues(List<Product> products) {
		StringBuilder sqlValues = new StringBuilder();
		
		for(Product product: products) {
			sqlValues.append("(0,'");
			sqlValues.append(product.getProduct_name());
			sqlValues.append("','");
			sqlValues.append(product.getCategory_code());
			sqlValues.append("', now(), now()), " ); 
		}
		sqlValues.delete(sqlValues.length()-2,sqlValues.length()); 
		
		return sqlValues.toString(); 
	}
	
	
	public int insertProducts(List<Product> products) {
		String sql = null; 
		
		Connection con = null; 
		PreparedStatement pstmt = null; 
		
		try {
			con= pool.getConnection();
			sql = "insert into product_mst values" + insertProductSqlValues(products);
			pstmt = con.prepareStatement(sql);
			
			return pstmt.executeUpdate();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		
		return 0; 
	}
	
	public int insertProduct(Product product) {
		String sql = null;  //쿼리문 작성 변수 
		Connection con = null; // 컨넥션 튜브 빌리는것 풀에 연결 
		PreparedStatement pstmt = null; // 값 채우기 
		
		try {
			con = pool.getConnection();
			sql = "insert into product_mst values(0, ?, ?, now(), now())"; 
			pstmt = con.prepareStatement(sql); 
			pstmt.setString(1, product.getProduct_name());
			pstmt.setInt(2, product.getCategory_code());
			
			return pstmt.executeUpdate(); //insert는 업데이트 insert됨 
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt); //connection, PreparedStatement 
		}
		return 0; 
	}
	
	public Product getProduct(int product_code) {
		Product product = null;
		String sql = null; 
		Connection con = null; 
		PreparedStatement pstmt = null; 
		ResultSet rs = null; //결과를 담을 수 있는 ResultSet  
		
		try {
			con = pool.getConnection();
			sql = "select * from product_mst where product_code = ?"; 
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, product_code);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				product = Product.builder()
						.product_code(rs.getInt(1))
						.product_name(rs.getString(2))
						.category_code(rs.getInt(3))
						.build(); 
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			pool.freeConnection(con, pstmt, rs);
		}
		
		
		return product; 
	}
	
	public int deleteProduct(int product_code) {
		String sql = null;
		
		Connection con = null; 
		PreparedStatement pstmt = null; 
		
		try {
			con = pool.getConnection();
			sql = "delete from product_mst where product_code = ?"; 
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, product_code);
			
			return pstmt.executeUpdate();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			pool.freeConnection(con, pstmt); 
		}
		
		return 0; 
	}
	
	public int updateProductName(int product_code, String product_name) {
		String sql = null;
		
		Connection con = null; 
		PreparedStatement pstmt = null; 
		
		try {
			con = pool.getConnection();
			sql = "update product_mst set product_name = ? where product_code = ?";
			pstmt = con.prepareStatement(sql); 
			pstmt.setString(1, product_name);
			pstmt.setInt(2, product_code);
			
			return pstmt.executeUpdate();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		return 0; 
	}
	
	
}
