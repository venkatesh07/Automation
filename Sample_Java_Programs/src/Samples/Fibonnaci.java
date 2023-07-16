package Samples;

import java.util.Scanner;

public class Fibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0, b = 1;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println(a);
		System.out.println(b);

		for (int i = 2; i < n; i++) {

			int c = a + b;
			System.out.println(c);
			a = b;
			b = c;

		}

	}

}
