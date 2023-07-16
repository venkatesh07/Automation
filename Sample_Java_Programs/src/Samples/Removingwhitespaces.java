package Samples;

public class Removingwhitespaces {

	public static void whitespaces(String str) {

		String str1 = str.replace("\\s", "");
		System.out.println(str1);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Venkatesh Dixith";
		whitespaces(str);

	}

}
