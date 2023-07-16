package Samples;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();

		for (int i = 2; i <= n / 2; i++) {

			if (n % i == 0)
				count = 1;

		}
		if (count == 0) {
			System.out.println("Its a prime number");
			
		}
		else
			System.out.println("Its not a prime number");

	}

}
