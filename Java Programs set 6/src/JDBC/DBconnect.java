package JDBC;
import java.sql.*;

public class DBconnect {

	public static void main(String[] args) {
		try {
			//Load JDBC Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Establish Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hg", "root", "newpassword@1234");
			
			//System.out.println("Connected successfully");
			Statement stmt = con.createStatement();
			String sql="CREATE TABLE IF NOT EXISTS student("+"id INT PRIMARY KEY AUTO_INCREMENT,"
					+ "name VARCHAR(100),"+"age INT,"+"course VARCHAR(100))";
			
			stmt.executeUpdate(sql);
			System.out.println("Table 'student' created successfully.");
			con.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

}
