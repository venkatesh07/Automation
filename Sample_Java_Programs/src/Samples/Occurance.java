package Samples;
import java.util.HashMap;
import java.util.Map;

public class Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "I I am am learning learning am Java Java Program Program";
		Integer count = 1;
		Map<String, Integer> map = new HashMap<String, Integer>();
		String arr[] = str.split(" ");
		for(int i=0;i<arr.length;i++) {
			
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], count);
			}else
				map.put(arr[i], map.get(arr[i])+1);
			
			
		}
		
		for(String x:map.keySet()) {
			System.out.println("Word count is " +x+ " = " +map.get(x));
		}
		

	}

}
