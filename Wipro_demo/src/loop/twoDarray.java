package loop;
import java.util.Scanner;

public class twoDarray {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students = 2;  
        int days = 3;      

        
        int[][] attendance = new int[students][days * 2];

        
        System.out.println("Enter attendance (1 = present, 0 = absent)");

        for (int i = 0; i < students; i++) {
            System.out.println("Student " + (i + 1) + ":");
            for (int j = 0; j < days; j++) {
                System.out.print("  Day " + (j + 1) + " Morning: ");
                attendance[i][j * 2] = scanner.nextInt();

                System.out.print("  Day " + (j + 1) + " Evening: ");
                attendance[i][j * 2 + 1] = scanner.nextInt();
            }
        }

        
        System.out.println("\nAttendance Summary:");
        for (int i = 0; i < students; i++) {
            int total = 0;
            for (int j = 0; j < days * 2; j++) {
                total += attendance[i][j];
            }
            System.out.println("Student " + (i + 1) + " attended " + total + " out of " + (days * 2) + " sessions.");
        }

        scanner.close();
    }
}


