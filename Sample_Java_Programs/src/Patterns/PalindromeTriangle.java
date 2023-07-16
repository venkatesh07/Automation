package Patterns;

public class PalindromeTriangle {

	// Java Program to print pattern
	// Palindrome triangle

	public static void printPattern(int n) {
		int i, j;

		for (i = 1; i <= n; i++) {

			for (j = i; j >= 1; j--) {

				System.out.print(j +" ");
			}

				for (j = 2; j <= i; j++) {

					System.out.print(j +" ");
				}

				System.out.println();

		}
		

	}

	// Driver Function
	public static void main(String args[]) {
		int n = 6;
		printPattern(n);
	}
}
