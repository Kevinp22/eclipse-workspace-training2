package com.neosoft.basics;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int k=1;
		System.out.println("enter number of rows:");
		int row=sc.nextInt();
		for(int i=1; i<=row;i++) {
			for(int j=1;j<=i;j++) {
				
				System.out.format("%5d",k++);
			}
			System.out.println();
				
			
		}
		
	}
	}
