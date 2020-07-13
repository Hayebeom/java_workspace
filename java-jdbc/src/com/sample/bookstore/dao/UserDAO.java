package com.sample.bookstore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sample.bookstore.util.ConnectionUtil;
import com.sample.bookstore.util.QueryUtil;
import com.sample.bookstore.vo.User;

public class UserDAO {
	
	public void addUser(User user) throws Exception {
		/*
		 String sql = "INSERT INTO sample_book_users " +
		 "(user_id, user_password, user_name, user_email, user_point, user_registered_date)"
		 + "VALUES" + "(?, ?, ?, ?, ?, SYSDATE)";
		 
		 INSERT INTO sample_book_users (user_id, user_password, user_name, user_email,
		 user_point, user_registered_date) VALUES ('hong', 'zxcv1234', '홍길동',
		 'hong@gmail.com', 1000, sysdate);
		*/
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement pstmt = connection.prepareStatement(QueryUtil.getSQL("user.addUser"));
		
		pstmt.setString(1, user.getId());
		pstmt.setString(2, user.getPassword());
		pstmt.setString(3, user.getName());
		pstmt.setString(4, user.getEmail());
		// pstmt.setInt(5, user.getPoint()); // 자동 증가라서 생략?
		// 날짜는 생략
		pstmt.executeUpdate();
		
		pstmt.close();
		connection.close();
		
	}
	
	public User getUserById(String userId) throws Exception {
		/*
		String sql = "SELECT * "
				+ "FROM sample_book_users "
				+ "WHERE user_no = ? ";
		*/
		User user = null;
		
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement pstmt = connection.prepareStatement(QueryUtil.getSQL("user.getUserById"));
		pstmt.setString(1, userId);
		ResultSet rs = pstmt.executeQuery();
		
		if (rs.next()) {
			// user = resultSetToUser(rs); 이건 뭔데
			user = new User();
			user.setId(rs.getString("user_id"));
			user.setPassword(rs.getString("user_password"));
			user.setName(rs.getString("user_name"));
			user.setEmail(rs.getString("user_email"));
			user.setPoint(rs.getInt("user_point"));
			user.setRegisteredDate(rs.getDate("user_registered_date"));
		}
		
		rs.close();
		pstmt.close();
		connection.close();
		
		return user;
	}
	
	public void updateUser(User user) throws Exception {
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement pstmt = connection.prepareStatement(QueryUtil.getSQL("user.updateUser"));
		pstmt.setString(1, user.getPassword());
		pstmt.setString(2, user.getEmail());
		pstmt.setInt(3, user.getPoint());
		pstmt.setString(4, user.getId());
		pstmt.executeUpdate();
		
		pstmt.close();
		connection.close();
	}
	
	/*
	public List<User> getAllUsers() throws Exception {
		String sql = "SELECT * " 
				+ "FROM sample_book_users "
				+ "Order by user_no ";
		
		List<User> users = new ArrayList<User>();
		
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement pstmt = connection.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		while (rs.next()) {
			User user = resultSetToUser(rs);
			users.add(user);
		}
		
		rs.close();
		pstmt.close();
		connection.close();
		
		return users;
	}
	
	private User resultSetToUser(ResultSet rs) throws SQLException {
		User user = new User();
		
		user.setId(rs.getString("user_id"));
		user.setPassword(rs.getString("user_password"));
		user.setName(rs.getString("user_name"));
		user.setEmail(rs.getString("user_email"));
		user.setPoint(rs.getInt("user_point"));
		user.setRegisteredDate(rs.getDate("user_registered_date"));
		
		return user;
	}
	*/
	
}
