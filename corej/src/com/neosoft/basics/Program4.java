package com.neosoft.basics;

import java.util.Scanner;

class Student{
	static String name;
	 static String course;
	 static int stid;
	 static int marks;
	

Student(  String  name1,   String course,  int stid, int marks){
	Student.name= name1;
	Student.course=course;
	Student.stid=stid;
	Student.marks=marks;
}

public static class Program4 {

	public static void main(String[] args) {
		Student[] stu= new Student[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<=5;i++) {
		System.out.println("Enter name");
		name=sc.nextLine();
		System.out.println("enter course");
		course=sc.nextLine();
		System.out.println("enter marks");
		marks=sc.nextInt();
		System.out.println("enter id");
		stid=sc.nextInt();
		}
		
		show();
		
	}


	
		
		

}

public static void show() {
	// TODO Auto-generated method stub
	if(Student.course=="BCA"&& Student.marks>=60) {
		
	System.out.println(Student.name);
	System.out.println(Student.course);
	System.out.println(Student.marks);
	System.out.println(Student.stid);
	
}
}
}
