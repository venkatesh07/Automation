package Patterns;

public class NumberchangingPyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int c = 1;

		for (int i = 0; i <6; i++) {

			for (int j = 0; j <= i; j++) {

				System.out.print(c);
				c++;
			}

			System.out.println();
		}

	}

}
