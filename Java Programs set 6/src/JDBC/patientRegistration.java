package JDBC;


import java.sql.*;
import java.util.Scanner;


public class patientRegistration {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/Hospital";
        String user = "root";
        String password = "newpassword@1234";   

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Patient Name: ");
        String name = sc.nextLine();

        System.out.print("Age: ");
        int age = sc.nextInt();
        sc.nextLine();  

        System.out.print("Disease: ");
        String disease = sc.nextLine();

        System.out.print("Doctor Assigned: ");
        String doctor = sc.nextLine();

        
        String sql = "INSERT INTO patient (name, age, disease, doctorname) VALUES (?, ?, ?, ?)";

        try (
            Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement pstmt = conn.prepareStatement(sql);
        ) {
            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setString(3, disease);
            
            pstmt.setString(4, doctor);

            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("✅ New patient registered successfully!");
            } else {
                System.out.println("❌ Registration failed.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
