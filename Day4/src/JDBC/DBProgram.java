
package JDBC;

import java.sql.*;
import javax.sql.*;

public class DBProgram {
	
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
			
			System.out.println("Database is now Connected...");
			
			stmt = con.createStatement();
			rs = stmt.executeQuery("Select * from myemp");
			
			while(rs.next()){
				System.out.println(
						rs.getInt("EMPNO") + " " 
				+ rs.getString("NAME") + " " 
				+ rs.getString("ADDRESS") + " " 
				+ rs.getDouble("SALARY") + " " 
				+ rs.getInt("DNO"));
			}
		}catch(ClassNotFoundException e){
			System.out.println("Driver Class not Found.");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
}
