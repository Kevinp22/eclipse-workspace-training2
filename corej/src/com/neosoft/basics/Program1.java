package com.neosoft.basics;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to check for palindrome");
        
       x= sc.nextInt();
       
       int sum,temp=0,number=0;
     x=number;
      while(number>0) {
    	  x=number%10;
    	  number=number/10;
    	  temp=temp*10+x;
    	  
    	  
      }
     
      if(temp==x) {
    	  System.out.println("it is palindrome");
      }
      else {
    	  System.out.println("it is  not palindrome");
    	  
      }
	}

}
