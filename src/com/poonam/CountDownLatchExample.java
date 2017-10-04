package com.poonam;

import java.util.concurrent.CountDownLatch;

class Food implements Runnable

{
	private final CountDownLatch cdl;
	private String[] items;

	public Food(CountDownLatch cdl, String[] items) {
		super();
		this.cdl = cdl;
		this.items = items;
	}

	@Override
	public void run() {
		for(int i=0;i<items.length;i++)
			
		{System.out.println(items[i]+" the food item is going to processed "+cdl.getCount());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cdl.countDown();
		System.out.println(items[i]+" the food item is processed "+cdl.getCount());
			
		}
		
	}}

public class CountDownLatchExample {

	public static void main(String[] args) {
		final CountDownLatch cdl =new CountDownLatch(args.length);	
		new Thread(new Food(cdl, args)).start();
		System.out.println("Food is started to processed");
		try {
			cdl.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Send notification to customer that food has prepared");
	}

}
