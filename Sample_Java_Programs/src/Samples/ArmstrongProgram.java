package Samples;

public class ArmstrongProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c=0;
		
		for(int k=1;k<=1000;k++) {
			
			int a, i=0, j=0;
			
			a = k;
			
			while(a>0) {
				
				i = a%10;
				j = j+(i*i*i);
				a = a/10;
				
			}
			if(k==j) {
				System.out.println("Number is Armstrong: " +j);
			c++;
			}
			
		}
		System.out.println(c);
		

	}

}
