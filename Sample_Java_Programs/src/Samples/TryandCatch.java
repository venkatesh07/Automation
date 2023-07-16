package Samples;

public class TryandCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(1);

		try {

			int a = 10 / 0;
			System.out.println(a);
		}

		catch (NullPointerException e) {

			System.out.println(21);
			System.out.println(e);

		}

		catch (Exception e) {

			System.out.println(21);
			System.out.println(e);

		} finally {
			System.out.println("Finally block");
		}

	}

}
