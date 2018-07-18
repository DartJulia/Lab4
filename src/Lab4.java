
/*
 * @author Julia Dart 
 * Java July Bootcamp
 * Lab 4
 */
import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("This program will display a table of squares and cubes from 1 to the value you enter.");
		int userNum = 0;
		String decision = "";
		
		// Do, while loop letting user continue with program if desired
		do {
			// User prompt to enter integer
		System.out.println("Enter an integer: ");
		userNum = scan.nextInt();

			// Prints out heading in specific format
			System.out.printf("%-10s %-10s %-10s%n", "Number", "Squared", "Cubed");
			System.out.printf("%-10s %-10s %-10s%n", "======", "=======", "=====");

			// Increments through numbers 1 to userNum and calculates the square and cube
			// values
		for(int i=1; i<=userNum; i++) {
				int squared = (int) Math.pow(i, 2);
				int cubed = (int) Math.pow(i, 3);

				// Prints values in specific format
				System.out.printf("%-10s %-10s %-10s%n", i, squared, cubed);
		}


			System.out.println("Continue? (y/n)");
			decision = scan.next();
		
		} while (decision.equalsIgnoreCase("y"));
		
		
		scan.close();

	}

}
