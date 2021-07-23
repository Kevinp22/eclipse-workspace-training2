package com.neosoft.basics;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program20 {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>();
		set.add("Hello");
		set.add("World");
		set.add("we");
		set.add("are");
		set.add("together");
		
		System.out.println(set);
		
		set.remove("smita");
		System.out.println(set);
		
		Iterator<String> itr= set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()+",");
			
		}

	}

}
