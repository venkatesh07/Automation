package Samples;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count=0;

		for (int k = 1; k <= 1000; k++) {
			int a, i = 0, j = 0;
			

			a = k;

			while (a > 0) {

				i = a % 10;
				j = j * 10 + i;
				a = a / 10;

			}
			if (k == j) {
				System.out.println("Number is palindrome: " + j);
			    count++;
			}
			// else
				// System.out.println("Number is not palindrome: " + j);
		}
		
		 System.out.println(count);
	}

}
