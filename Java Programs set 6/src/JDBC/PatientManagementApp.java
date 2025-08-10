package JDBC;
import java.util.Scanner;
import java.sql.*;

public class PatientManagementApp {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/Management";
        String user = "root";
        String password = "newpassword@1234"; 

        
        String createTableSQL = "CREATE TABLE IF NOT EXISTS patientRegistrat ("
                + "id INT AUTO_INCREMENT PRIMARY KEY, "
                + "name VARCHAR(100) NOT NULL, "
                + "age INT NOT NULL, "
                + "disease VARCHAR(100), "
                + "admission_date DATE, "
                + "doctor_assigned VARCHAR(100)"
                + ")";

        
        String insertPatientSQL = "INSERT INTO patientRegistrat (name, age, disease, admission_date, doctor_assigned) VALUES (?, ?, ?, ?, ?)";

        try (
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            Scanner sc = new Scanner(System.in);
        ) {
           
            stmt.execute(createTableSQL);
            System.out.println(" Table 'patientRegistrat' is ready.");

            
            System.out.print("Enter patient name: ");
            String name = sc.nextLine();

            System.out.print("Enter age: ");
            int age = sc.nextInt();
            sc.nextLine();  

            System.out.print("Enter disease: ");
            String disease = sc.nextLine();

            System.out.print("Enter admission date (yyyy-mm-dd): ");
            String admissionDate = sc.nextLine();

            System.out.print("Enter doctor assigned: ");
            String doctorAssigned = sc.nextLine();

            
            try (PreparedStatement pstmt = conn.prepareStatement(insertPatientSQL)) {
                pstmt.setString(1, name);
                pstmt.setInt(2, age);
                pstmt.setString(3, disease);
                pstmt.setDate(4, java.sql.Date.valueOf(admissionDate));
                pstmt.setString(5, doctorAssigned);

                int rowsInserted = pstmt.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("New patient registered successfully!");
                } else {
                    System.out.println("Failed to register the patient.");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	

}
