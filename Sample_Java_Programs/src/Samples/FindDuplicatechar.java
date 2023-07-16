package Samples;

public class FindDuplicatechar {

	public static void Duplicatefinder(String str) {

		char[] arr = str.toCharArray();

		for (int i = 0; i < arr.length; i++) {

			for (int j = 1; j < i; j++)

				if (arr[i] == arr[j]) {
					System.out.println("Duplicate char is: " + arr[i]);
				}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Venkateshh";
		Duplicatefinder(str);

	}

}
