
public class BasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=14, count=0;
		boolean flag=true;
		
		for(int i=2;i<=num/2;i++) {
			
			if(num%i==0) {
				count++;
				
			}
		}
			if(count>=1)
				System.out.println("it's not aprime number");
			else
				System.out.println("it's  a aprime number");

	}

}
