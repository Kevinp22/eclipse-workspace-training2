package com.neosoft.basics;

class Thread2 extends Thread{
	
	
	public void run() {
		
		String str="Java is nice ";
		for(int i=str.length()-1;i>=0;i--) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			char reverse=str.charAt(i);
			System.out.println(reverse);
			
		}
		
		
		
	}
	
	
	
	
}

public class Program9 extends Thread {
	public void run() {
		
		String str="Java is nice";
		for(int i=str.length()-1;i>=0;i--) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String reverse="";
			reverse= reverse +str.charAt(i);
			System.out.println(reverse);
			
		}
		
	
		
		
		
	}
	
	


	public static void main(String[] args) throws InterruptedException {
		Program9 t=new Program9();
		t.start();
		t.join();
		Thread2 t2=new Thread2();
		t2.start();
		t2.join();
	

	}

}