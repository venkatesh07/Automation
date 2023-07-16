package Samples;

import java.util.Scanner;

public class Swappingwithoutthird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c;
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		Scanner sc1 = new Scanner(System.in);
		int b = sc1.nextInt();
		
		System.out.println("Berfore swapping: " +a);
		System.out.println("Berfore swapping: " +b);
		
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swapping: " +a);
		System.out.println("After swapping: " +b);
		
	}

}
