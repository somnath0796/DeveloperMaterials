package com.demo.web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/*
 * 
 * Data Access Object!! 
 */

public class UserDao {
	private Connection getConnection(){
		
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return con;
	 }
	
	public User getUserByName(String userName){
		User user = new User();
		
		try{
			Connection con = getConnection();
			PreparedStatement pst = con.prepareStatement("SELECT username, password "
					+ "FROM users WHERE username = ?");
			
			pst.setString(1, userName);
			ResultSet rs = pst.executeQuery();
			
			if(rs.next()){
				user.setUserName(rs.getString("username"));
				user.setPassword(rs.getString("password"));
			}
			
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return user;
	}
	
	public boolean insertUser(User u){
		
		boolean saved = false;
		Connection con = getConnection();
		
		try{
			PreparedStatement pst = con.prepareStatement("INSERT INTO Users(username, password) VALUES(?,?)");
			pst.setString(1, u.getUserName());
			pst.setString(2, u.getPassword());
			int count = pst.executeUpdate();
			
			if(count==1){
				saved = true;
			}
			
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		return saved;
	}
}
