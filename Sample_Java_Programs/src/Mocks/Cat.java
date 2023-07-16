package Mocks;

public class Cat extends Animal{
	
	public void foo()  
	 {  
	     System.out.println("Bfoo");  
	 }  
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a = new Cat();
		Cat b = (Cat) a;
		a.foo();
		b.foo(); 
		

	}

}
