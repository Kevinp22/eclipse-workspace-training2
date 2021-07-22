package com.neosoft.basics;

class Printer{
	//synchronized static  void doprint(String doc) {
	synchronized  void doprint(String doc) {
		//synchronized(this) {
			
		//	for(int i=0;i<=10;i++)
			//	System.out.println("Printing "+doc+i);
		//	try {
			//	Thread.sleep(500);
		//	} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
		//	}
		//	}
	

		
		
		for(int i=0;i<=10;i++)
			System.out.println("Printing "+doc+i);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
}
class Pc1 extends Thread{
	Printer p;
	public Pc1(Printer p) {
		this.p=p;
		
	}
	@Override
	public void run() {
		p.doprint("java");
		
	}
}
class Pc2 extends Thread{
	Printer p;
	public Pc2(Printer p) {
		this.p=p;
		
	}
	@Override
	public void run() {
		p.doprint("Python");
		
	}
}
public class Program10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer p1=new Printer();
		Pc1 p=new Pc1(p1);
		Pc2 p2=new Pc2(p1);
		p.start();
		p2.start();
		

	}

}

