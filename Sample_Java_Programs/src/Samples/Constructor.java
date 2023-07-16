package Samples;

public class Constructor {

	public Constructor() {
		System.out.println("Default Constructor");
	}

	public void Constructor(int i) {
		System.out.println(i);
	}

	public Constructor(int a) {
		System.out.println("Parameter Constructor");
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructor c = new Constructor();
		Constructor c1 = new Constructor(15);
		c1.Constructor(10);

	}

}
