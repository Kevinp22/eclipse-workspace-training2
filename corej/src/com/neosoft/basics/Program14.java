package com.neosoft.basics;

import java.util.ArrayList;
import java.util.Iterator;

class Student5{
	String name;
	int mark;
	int stid;
	String lang;
	public Student5(int stid, String name,String lang,int mark) {
		super();
		this.name = name;
		this.mark = mark;
		this.stid = stid;
		this.lang = lang;
	}
}

public class Program14 {

	public static void main(String[] args) {
		ArrayList<Student5> studentsList= new ArrayList<Student5>();
		studentsList.add(new Student5(101,"abc1","java",90));
		studentsList.add(new Student5(102,"abc2","python",95));
		studentsList.add(new Student5(103,"abc3","java",80));
		studentsList.add(new Student5(104,"abc4","python",70));
		studentsList.add(new Student5(105,"abc5","java",60));
		
		Iterator<Student5> itr=studentsList.iterator();
		while(itr.hasNext()) {
			Student5 student=itr.next();
			System.out.println("id: "+student.stid+",");
			System.out.println("name: "+student.name+",");
			System.out.println("language: "+student.lang+",");
			System.out.println("marks: "+student.mark+",");
			
			
		}
		
		
	}

}
