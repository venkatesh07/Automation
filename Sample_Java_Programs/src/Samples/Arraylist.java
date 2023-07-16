package Samples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Character> li = new ArrayList<Character>();
		List<Character> li1 = new ArrayList<Character>();
		li.add('A');
		li.add('C');
		li.add('V');
		
		System.out.println(li);
		System.out.println(li.get(2));
		li1.addAll(li);
		li.add('H');
		li.add('K');
		li1.add('J');
		System.out.println(li);
		li1.removeAll(li);
		System.out.println(li);
		System.out.println(li1);
		li.set(2, 'V');
		
		List<Integer> ln = new LinkedList<Integer>();
		ln.add(12);
		ln.add(25);
		ln.add(63);
		ln.set(0, 13);
		System.out.println(ln);
		System.out.println(ln.get(2));
		
		

	}

}
