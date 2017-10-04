package com.poonam;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class RunJob implements Runnable {
   
	 String name;
	
	public RunJob(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println("Job is running for"+ Thread.currentThread().getName());
		System.out.println("JOB completed for "+ Thread.currentThread().getName());
		
	}
}

public class ExecutorServiceExample {

	public static void main(String[] args) {
		RunJob [] jobs ={new RunJob("FirstThread"), new RunJob("SecondThread"),new RunJob("ThirdThread"),new RunJob("ForthThread") };
		
		Executor executorService = Executors.newFixedThreadPool(4);
	
		for(RunJob job :jobs)
		{
			((ExecutorService) executorService).submit(job)	;
		}

//		executorService.execute(new Runnable() {
//		    public void run() {
//		        System.out.println("Asynchronous task");
//		    }
//		});
//		
//		 Future f= executorService.submit(new Runnable() {
//		    public void run() {
//		        System.out.println("second task");
//		    }
//		    
//		});
//		try {
//			System.out.println("future object "+ f.get());
//		} catch (ExecutionException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		Future f1= executorService.submit(new Callable<String>() {
//			@Override
//			public String call() throws Exception {
//				System.out.println("submit method of executor servie completed");
//				return "Callable method completed";
//			}
//		});
//		try {
//			System.out.println("CAllable future object "+f1.get());
//		} catch (InterruptedException | ExecutionException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		executorService.execute(new Runnable() {
//		    public void run() {
//		        System.out.println("4 task");
//		    }
//		});
//
		((ExecutorService) executorService).shutdown();


	}

}
