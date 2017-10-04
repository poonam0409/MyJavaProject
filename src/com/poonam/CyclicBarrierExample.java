package com.poonam;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class Jhula implements Runnable
{ 
	String name;
	CyclicBarrier c;
	

	public Jhula(String name, CyclicBarrier c) {
		super();
		this.name = name;
		this.c = c;
	}


	@Override
	public void run() {
	
     System.out.println(name  +"has arrived");
	try {
		System.out.println(c.getNumberWaiting() );
		c.await();
	} catch (InterruptedException | BrokenBarrierException e) {
		// TODO Auto-generated catch block
		System.out.println("catch me aa gya");
	}
		
	System.out.println("Jhula started for "+name);
	}
	
	
}
	public class CyclicBarrierExample {

	public static void main(String[] args) throws InterruptedException {
	 CyclicBarrier c = new CyclicBarrier(2);
		Thread t1 =	new Thread(new Jhula("Passenger1", c));
		t1.start();
		try{
			System.out.println("waiting in 1st main thread");
			c.await();
		}
		 catch (InterruptedException | BrokenBarrierException e) {
				// TODO Auto-generated catch block
				System.out.println("catch me aa gya");
			}

	 Thread.sleep(5000);
	
//	
//	try{
//		System.out.println("waiting in main thread");
//		c.await();
//	}
//	 catch (InterruptedException | BrokenBarrierException e) {
//			// TODO Auto-generated catch block
//			System.out.println("catch me aa gya");
//		}
	new Thread(new Jhula("Passenger2", c)).start();
//         Thread.sleep(5000);
//		new Thread(new Jhula("Passenger3", c)).start();
//		Thread.sleep(5000);
//		System.out.println("end");
//		new Thread(new Jhula("Passenger4", c)).start();

		
	}

}
