package Samples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class PracticePrograms {

	public static void duplicatechar(Integer[] ar) {

		List<Integer> li = Arrays.asList(ar);
		System.out.println(li);

		Collections.sort(li);
		System.out.println(li);

		System.out.println(li.get(ar.length - 1));
		System.out.println(li.get(ar.length - 2));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] ar = { 15, 25, 58, 41, 52, 65, 98, 14, 45, 78 };
		duplicatechar(ar);

	}

}
