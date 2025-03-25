package pro02.sec2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CartDAO {
	
	//JDBC(mysql-connector) 드라이버 로딩부
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} 
	}
	
	//특정 장바구니번호에 해당하는 데이터 1건을 가져오기
	public Cart getCart(int cno) {
		Cart cart = new Cart();
		String sql = "select * from cart where cno=?";
		
		try {
			Connection conn = DBConnector.getConnection(); //데이터베이스 연결
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, cno);
			try {
				ResultSet rs = pstmt.executeQuery();
				if(rs.next()) {
					cart.setCno(rs.getInt("cno"));
					cart.setId(rs.getString("id"));
					cart.setPno(rs.getInt("pno"));
					cart.setPrice(rs.getInt("price"));
					cart.setAmount(rs.getInt("amount"));
				}
			} catch(SQLException e1) {
				e1.printStackTrace();
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return cart;
	}
}
