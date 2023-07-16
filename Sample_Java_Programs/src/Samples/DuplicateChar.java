package Samples;
import java.util.HashMap;
import java.util.Map;


public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "laptop";
		int count=1;
		char array[] = name.toCharArray();
		int len = name.length();
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (int i=0;i<len;i++) {
			
			if(!map.containsKey(array[i])) {
				map.put(array[i], count);
				
			}else {
				map.put(array[i], map.get(array[i])+1);
			}
			
			
		}
		
		for(Character key:map.keySet()) {
			
			if(map.get(key)>1) {
				System.out.println("Duplicate value: " +map.get(key));
			}
			
		}
		

	}

}
