package Others;

public class SampleProgram {
	
	 SampleProgram(){
		
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SampleProgram s= new SampleProgram();
		
		String str = "Venkatesh";
		
		StringBuffer sb = new StringBuffer(str);
		
		//System.out.println(sb.reverse());
		
		char[] ch = str.toCharArray();
		
		for(int i=str.length()-1;i>=0;i--) {
			
			System.out.print(ch[i]);
			
		}
	
		
		
		
	}

}
