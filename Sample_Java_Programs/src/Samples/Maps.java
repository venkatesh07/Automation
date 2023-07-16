package Samples;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> m= new HashMap<Integer, String>();//random o/p
		Map<Integer, String> m1= new LinkedHashMap<Integer, String>();//Insertion order preserved
		Map<Integer, String> m2= new TreeMap<Integer, String>();//ascending order
		
		m.put(12, "Hello");
		m.put(13, "");
		m.put(13, "");
		m.put(123, "Messi");
		m.put(14, "Sashi");
		m.put(15, "Sashi");
		
		m2.put(12, "Hello");
		m2.put(123, "Messi");
		m2.put(14, "Sashi");
		
		
		System.out.println(m);
		System.out.println(m2);
		System.out.println(m.containsKey(121));
		System.out.println(m.containsValue("Messi"));
		Set<Integer> s = m.keySet();
		System.out.println(s);
		System.out.println(m.get(12));
		System.out.println(m.isEmpty());
		
		

	}

}
