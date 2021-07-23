package com.neosoft.basics;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Program19 {

	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<String>();
		set.add("amit");
		set.add("smita");
		set.add("rucha");
		set.add("rohan");
		set.add("mike");
		
		System.out.println(set);
		
		set.remove("smita");
		System.out.println(set);
		
		Iterator<String> itr= set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()+",");
			
		}

	}

}
