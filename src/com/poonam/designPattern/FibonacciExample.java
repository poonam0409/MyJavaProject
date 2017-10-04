package com.poonam.designPattern;

public class FibonacciExample {

	private int first=0;
	private int second =1;
	private  int count=0;
	
	public void getFibonaci(int times) {
		System.out.print(first +" "+ second);
		for (int i= 2;i<=times;i++)
		{ 
			count=first+second;
			 System.out.print(" "+count);
			first=second;
			second=count;
	
		}	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciExample fib = new FibonacciExample();
		fib.getFibonaci(10);
		
	}

}
