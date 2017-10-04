package com.poonam.designPattern;

class Worker extends Thread
{
	
	public Worker(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
	for(int i=0;i<10;i++)
	{
		System.out.println(Thread.currentThread().getName()+" "+i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" has ended work");
	}
	}
	}


public class ThreadShceduler {

	private static void createThread()
	{
		new Worker("Thread1").start();
		new Worker("Thread2").start();
//		new Worker("Thread3").start();
//		new Worker("Thread4").start();
//		new Worker("Thread5").start();
//		new Worker("Thread6").start();
	}
	public static void main(String[] args) {
		createThread();

	}
}
