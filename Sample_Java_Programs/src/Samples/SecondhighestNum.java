package Samples;

import java.util.Collections;
import java.util.LinkedList;
import java.util.TreeSet;

public class SecondhighestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> num = new LinkedList<Integer>();

		num.add(100);
		num.add(120);
		num.add(10);
		num.add(63);
		num.add(65);
		num.add(98);
		
		int len = num.size();
		
		System.out.println(num);
		Collections.sort(num);
		System.out.println(num);
		System.out.println(num.get(len-2));

	}

}
