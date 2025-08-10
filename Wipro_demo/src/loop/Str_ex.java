package loop;

public class Str_ex {

	public static void main(String[] args) {
		
		String name = "Himanshu";
        int id = 100;
        String department = "Technical";
        int salary = 50000;
        String email = "himanshu@compqany.com";

        
        StringBuilder report = new StringBuilder();

        
        report.append("********** EMPLOYEE PROFILE **********\n");
        report.append("Employee ID  : ").append(id).append("\n");
        report.append("Name         : ").append(name).append("\n");
        report.append("Department   : ").append(department).append("\n");
        report.append("Salary       : ₹").append(salary).append("\n");
        report.append("Email        : ").append(email).append("\n");
        
        report.insert(report.indexOf("Name") + name.length() + 7, " Grover ");
        
        System.out.println(report);
    }

}
