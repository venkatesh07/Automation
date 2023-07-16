package Others;

public class ReverseString {
	
	public static void reverse(String str) {
		
		char[] ch = str.toCharArray();
		
		for(int i=str.length()-1;i>=0;i--) {
			
			System.out.print(ch[i]);
			
			
		}
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Messi";
		reverse(str);

	}

}
