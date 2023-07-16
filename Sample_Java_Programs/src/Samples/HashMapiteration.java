package Samples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapiteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(10, "Messi");
		map.put(11, "Neymar");
		map.put(07, "De paul");
		map.put(15, "Venkatesh");
		
		Iterator itr = map.entrySet().iterator();
		
		while(itr.hasNext()) {
			
			Map.Entry me = (Map.Entry) itr.next();
			
			System.out.println(me.getKey() + " " + me.getValue());
			
			
			
		}
		
		
		}
		

	}

