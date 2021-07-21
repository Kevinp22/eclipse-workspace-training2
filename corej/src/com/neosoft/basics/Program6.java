package com.neosoft.basics;


class Shape{
	void draw() {
		System.out.println("Drawing......");
	}
	void area() {
		System.out.println("Area of the shape");
	}
	
	
}
 class Circle extends Shape{
	 void draw() {
	 System.out.println("Drawing Circle with radius 6cm");
	 }
	 void area() {
		 double radius=6;
		 double area=3.14*radius*radius;
		 System.out.println("Area of Circle: "+area);
	 }
 }
 class Triangle extends Shape{
	 void draw() {
	 System.out.println("Drawing Triangle with height= 5cm and breadth= 4cm");
	 }
	 void area() {
		double h=5;
	double b=4;
		double area=0.5 * h *b;
		 System.out.println("Area of triangle: "+area);
	 }
 }
 class Square extends Shape{
	 void draw() {
	 System.out.println("Drawing Square with side= 5cm");
	 }
	 void area() {
			int s=5;
			
			int area= s*s;
			 System.out.println("Area of Square: "+area);
		 }
	 
 }
public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s;
		s=new Circle();
		s.draw();
		s.area();
		s=new Triangle();
		s.draw();
		s.area();
		s=new Square();
		s.draw();
		s.area();

	}

}
