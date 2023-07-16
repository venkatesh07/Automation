package DataStructureandAlogo;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 20, 35, -15, 7, 55, 1, -22 };

		for (int lastindex = a.length - 1; lastindex > 0; lastindex--) {
			for (int i = 0; i < lastindex; i++) {

				if (a[i] > a[i+1]) {

					swap(a, i, i + 1);

				}

			}

		}

		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);

		}
	}

	public static void swap(int[] a, int i, int j) {

		if (i == j) {

			return;

		}

		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;

	}
}
