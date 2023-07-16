package Samples;

import java.util.LinkedHashSet;

public class DuplicatesRemoval {

	public static void sample(String str) {

		LinkedHashSet<Character> ch = new LinkedHashSet<Character>();
		for (int i = 0; i < str.length(); i++) {

			ch.add(str.charAt(i));

		}

		for (Character c : ch) {
			System.out.print(c);
		}

	}

	public static void main(String[] args) {

		String str = "This iss myyy country";
		sample(str);

	}

}
