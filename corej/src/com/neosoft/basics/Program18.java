package com.neosoft.basics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Program18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> hashset=new HashSet<Integer>();
		hashset.addAll(Arrays.asList(new Integer[] {2,3,5,1,6,9,8}));
		Set<Integer> hashset2=new HashSet<Integer>();
		hashset2.addAll(Arrays.asList(new Integer[] {2,3,5,7,0,4,10}));
		
		Set<Integer> hashset3=new HashSet<Integer>(hashset);
		hashset3.addAll(hashset2);
		System.out.println("Union"+hashset3);
		
		Set<Integer> hashset4=new HashSet<Integer>(hashset);
		hashset4.retainAll(hashset2);
		System.out.println("Intersection"+hashset4);
		
		Set<Integer> hashset5=new HashSet<Integer>(hashset);
		hashset5.removeAll(hashset2);
		System.out.println("diffrence"+hashset5);
		System.out.println("1 is there?" + hashset5.contains(1));
		System.out.println("remove" + hashset5.remove(9));
		
		for (Integer i:hashset5) {
			System.out.println("element"+i+" ");
		
		
		
		
	}
	}
}


