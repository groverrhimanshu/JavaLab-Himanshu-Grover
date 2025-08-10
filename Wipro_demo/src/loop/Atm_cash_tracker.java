package loop;
import java.util.Scanner;

public class Atm_cash_tracker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        int days = 3;
        int denominations = 2; 
        int[][] atm = new int[days][denominations];

        String[] notes = {"₹500", "₹100"};

        
        for (int i = 0; i < days; i++) {
            System.out.println("Enter number of notes for Day " + (i + 1) + ":");
            for (int j = 0; j < denominations; j++) {
                System.out.print("  " + notes[j] + ": ");
                atm[i][j] = scanner.nextInt();
            }
        }

        
        System.out.println("\nATM Cash Report:");
        for (int i = 0; i < days; i++) {
            int totalCash = atm[i][0] * 500 + atm[i][1] * 100;
            System.out.println("Day " + (i + 1) + " Total Cash: ₹" + totalCash);
        }

        scanner.close();
    }
	}


