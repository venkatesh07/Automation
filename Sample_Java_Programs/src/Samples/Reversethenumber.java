package Samples;

import java.util.Scanner;

public class Reversethenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a , i=0, j =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		
		
		while(n>0) {
			
			i = n%10;
			j = j*10 + i;
			n = n/10;
		
		}
		System.out.println("After reversing the num: " +j);
		
		
	}

}
