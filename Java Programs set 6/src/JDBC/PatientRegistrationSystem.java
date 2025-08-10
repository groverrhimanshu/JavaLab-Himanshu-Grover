package JDBC;
import java.sql.*;

public class PatientRegistrationSystem {

	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital", "root", "newpassword@1234");
			
			Statement stmt = con.createStatement();
			
			String sql="CREATE TABLE IF NOT EXISTS patientRegistration("+"id INT PRIMARY KEY AUTO_INCREMENT,"
					+ "name VARCHAR(100),"+"age INT,"+"doctorname VARCHAR(100))";
			
			stmt.executeUpdate(sql);
			
			System.out.println("Table 'Patient_Registration' created successfully.");
			con.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}

		

	}

}
