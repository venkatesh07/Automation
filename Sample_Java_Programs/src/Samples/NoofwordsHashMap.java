package Samples;

import java.util.HashMap;
import java.util.Map;

public class NoofwordsHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> map = new HashMap<String, Integer>();

		String str = "This is is is the this best is best";
		String str1[] = str.split(" ");

		for (int i = 0; i < str1.length; i++) {

			if (map.containsKey(str1[i])) {

				int count = map.get(str1[i]);
				map.put(str1[i], count + 1);
				
			} else {
				map.put(str1[i], 1);

			}

		}
		System.out.println(map);

	}

}
