package Others;

import java.util.Arrays;

public class threedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[][] mat = { { 1, 2, 3, 4 },
                 { 5, 6, 7, 8 },
                 { 9, 10, 11, 12 } };
		
		for(int[] row:mat)
		System.out.println(Arrays.toString(row));

	}

}
