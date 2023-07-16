package Others;

import java.util.LinkedHashMap;

public class FindCharcountinString {

	public static void charcount(String str) {

		LinkedHashMap<Character, Integer> hm = new LinkedHashMap<Character, Integer>();
		char[] ch = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {

			if (hm.containsKey(ch[i])) {

				int count = hm.get(ch[i]);
				hm.put(ch[i], count + 1);

			} else {

				hm.put(ch[i], 1);

			}

		}

		System.out.println(hm);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abbcccddddeeeeeffffff";
		charcount(str);

	}

}
