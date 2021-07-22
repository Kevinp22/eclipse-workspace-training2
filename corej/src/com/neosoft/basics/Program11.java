package com.neosoft.basics;

class Print{
	
	synchronized static  void doprint(String doc) {
		
		
		for(int i=0;i<=10;i++)
			System.out.println("Printing "+doc+i);
			try {
			Thread.sleep(500);
			} catch (InterruptedException e) {
				 
				e.printStackTrace();
		}
			}
	}

	

public class Program11 {

	public static void main(String[] args) {
		
		new Thread() {
			@Override
			public void run() {
				Print.doprint("java");
				
			}
		}.start();
		new Thread() {
			@Override
			public void run() {
				Print.doprint("python");
				
			}
		}.start();
	
	}

}
