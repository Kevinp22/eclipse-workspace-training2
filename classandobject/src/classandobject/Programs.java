package classandobject;
import java.util.Scanner;

class Student{
	 String name;
	 String course;
	int stid;
	  int marks;
	

Student(  String  name1,   String course,  int stid, int marks){
	this.course=course;
	this.marks=marks;
	this.name=name;
	this.stid=stid;

}


void show() {
if(this.marks>60 && this.course=="BCA") {

System.out.println(this.name+this.marks+this.stid+this.course);
}

}
}


public class Programs {


public static void main(String[] args) {
		
	Student[] stu= new Student[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<=5;i++) {
		System.out.println("Enter name");
		  String name=sc.nextLine();
		 
		System.out.println("enter course");
		 String course=sc.nextLine();
		System.out.println("enter marks");
		 int marks=sc.nextInt();
		System.out.println("enter id");
		 int stid=sc.nextInt();
		}
	
	
		
	}



	
		
		



}


