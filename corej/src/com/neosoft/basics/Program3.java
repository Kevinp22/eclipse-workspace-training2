package com.neosoft.basics;

import java.util.Scanner;
import java.util.Arrays;   
public class Program3 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);

	int[] array=new int[5];
	System.out.println("Enter 5 elements");

	for( int i=0; i<array.length;i++) {
		array[i]=sc.nextInt();
		
	}
	for (int i = 0; i < array.length; i++) {     
        for (int j = i+1; j < array.length; j++) {     
           if(array[i] > array[j]) {    
              int temp = array[i];    
               array[i] = array[j];    
               array[j] = temp;    
           }     
        }     
    } 
	 System.out.println("Elements of array sorted ");    
     for (int i = 0; i < array.length; i++) {     
         System.out.print(array[i] + " ");    
     }    
	

	}

}
