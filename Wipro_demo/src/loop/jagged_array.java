package loop;
import java.util.Scanner;

public class jagged_array {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        
        int[][] seats = new int[3][];
        seats[0] = new int[5]; 
        seats[1] = new int[3]; 
        seats[2] = new int[4]; 

        
        System.out.println("Enter seat status (1 = booked, 0 = available):");
        for (int i = 0; i < seats.length; i++) {
            System.out.println("Row " + (i + 1) + ":");
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print("  Seat " + (j + 1) + ": ");
                seats[i][j] = scanner.nextInt();
            }
        }

        
        System.out.println("\nSeat Booking form:");
        for (int i = 0; i < seats.length; i++) {
            System.out.print("Row " + (i + 1) + ": ");
            for (int seat : seats[i]) {
                System.out.print((seat == 1 ? "[X]" : "[ ]") + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
	}


