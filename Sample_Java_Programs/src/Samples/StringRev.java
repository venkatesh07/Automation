package Samples;

public class StringRev {
	
	public static void Reverse(String str) {
		
		int len = str.length();
		char str1[] = str.toCharArray();
		
		for(int i=len-1;i>=0;i--) {
			
			System.out.print(str1[i]);
			
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Venkatesh";
		Reverse(str);

	}

}
