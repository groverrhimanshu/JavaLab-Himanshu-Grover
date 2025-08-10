package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Hos_pital {

	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital", "root", "newpassword@1234");
			
			
			String sql="INSERT INTO patient(name, age, disease) VALUES(?, ?, ?)";
			
			PreparedStatement pstmt=con.prepareStatement(sql);
			String[][] data=
			{
					{"Anshita", "22", "Fever"},
					{"Sri Laxmi", "23", "Cold"},
					{"Ashwarya", "22", "headche"},
					{"Manjeera", "22", "Pain"}
			};
				for(String[] row : data)
			{
				pstmt.setString(1, row[0]);
				pstmt.setInt(2, Integer.parseInt(row[1]));
				pstmt.setString(3, row[2]);
				pstmt.executeUpdate();
			}
			System.out.println(" All patients inserted successfully");
			con.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

	

}
