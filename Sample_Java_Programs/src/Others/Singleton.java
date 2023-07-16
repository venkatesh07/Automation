package Others;

public class Singleton {

	static Singleton ab = new Singleton();
	
	private Singleton() {
		
		
	}
	
	public static Singleton getinstance() {
		
		return ab;
		
		
	}

}
