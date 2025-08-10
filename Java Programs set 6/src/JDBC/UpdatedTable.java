package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdatedTable {

	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital", "root", "newpassword@1234");
			
			
			String sql="UPDATE patient SET name=? WHERE name=?";
			
			PreparedStatement pstmt=con.prepareStatement(sql);
	 
			pstmt.setString(1, "Sai Manjeera");
			pstmt.setString(2, "Manjeera");
			int rows=pstmt.executeUpdate();
			
			System.out.println("Patient name updated successfully");
			con.close();
		    }
		catch (Exception e)
		{
		e.printStackTrace();
				
		}

	}

}
