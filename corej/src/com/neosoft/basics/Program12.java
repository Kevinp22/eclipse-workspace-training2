package com.neosoft.basics;

class Sharedresourse{
	synchronized  void doprint(int i, int j) {
		for(int k=1;k<=j;k++) {
		
			
			System.out.println("Printing "+(k+2));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	
	}
}
class Mythread extends Thread{
	Sharedresourse s;
	public Mythread(Sharedresourse s) {
		this.s=s;
	}
	@Override
	public void run(){
		s.doprint(2,5);
		
	}
	
}
class Mythread2 extends Thread{
	Sharedresourse s;
	public Mythread2(Sharedresourse s) {
		this.s=s;
	}
	@Override
	public void run(){
		s.doprint(3,7);
		
	}
	
}



public class Program12 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Sharedresourse s=new Sharedresourse();
		Mythread t1=new Mythread(s);
		Mythread2 t2=new Mythread2(s);
		t1.start();
	t2.start();
	

	}

}
