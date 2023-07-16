package Samples;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> s= new HashSet<Integer>();//random o/p
		Set<Integer> s2= new LinkedHashSet<Integer>();//insertion order preserved
		Set<Integer> s3= new TreeSet<Integer>();//ascending small to large
		Set<Integer> s1= new HashSet<Integer>();
		s.add(1243);
		s.add(12);
		s.add(12);
		s.add(112);
		s.add(12556);
		s1.addAll(s);
		s.add(1121);
		s.add(1021);
		s1.add(14);
		s1.add(109);
		System.out.println(s);
		System.out.println(s1);
		s.removeAll(s1);
		System.out.println(s);
		
		
		
		

	}

}
