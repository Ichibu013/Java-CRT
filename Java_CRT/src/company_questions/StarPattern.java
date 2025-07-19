package company_questions;

public class StarPattern {

	public static void main(String[] args) {
		int rows = 5; // You can change the number of rows

		// Outer loop for rows
		for (int i = 1; i <= rows; i++) {

			// Inner loop for leading spaces
			// This creates the triangular shape by pushing stars to the center
			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" "); // Print a single space
			}

			// Inner loop for stars and spaces between them
			// This prints the stars for the current row
			for (int k = 1; k <= i; k++) {
				System.out.print("* "); // Print a star followed by a space
			}

			System.out.println(); // Move to the next line after each row is complete
		}

	}

}
