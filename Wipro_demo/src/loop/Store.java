package loop;
import java.util.Scanner;

public class Store {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        int products = 3; 
        int days = 3;
        int[][] inventory = new int[products][days];

        String[] productNames = {"Pen", "Notebook", "Eraser"};

        
        for (int i = 0; i < products; i++) {
            System.out.println("Enter stock for " + productNames[i] + ":");
            for (int j = 0; j < days; j++) {
                System.out.print("  Day " + (j + 1) + ": ");
                inventory[i][j] = scanner.nextInt();
            }
        }

        
        System.out.println("\nInventory Report:");
        for (int i = 0; i < products; i++) {
            int total = 0;
            for (int j = 0; j < days; j++) {
                total += inventory[i][j];
            }
            System.out.println(productNames[i] + " - Total stock over " + days + " days: " + total);
        }

        scanner.close();
    }
	}


