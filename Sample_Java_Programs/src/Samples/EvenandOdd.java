package Samples;
import java.util.Scanner;

public class EvenandOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		if(n%2==1) {
			
			System.out.println("Odd number: " +n);
			
		}else {
			
			System.out.println("Even number: " +n);
			
		}
		

	}

}
