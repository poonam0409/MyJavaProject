package com.poonam;

public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}

	public int subtract(int a, int b)
	{ 
		if (a>b)
		return a-b;
		else return b-a;
	}
	
	public int multiply(int a, int b) {
		return a *b;
	}
 
	public int divide(int a, int b) throws Exception {
		if (a>b)
			return a/b;
			else return b/a;
	}

	public static void main(String ... args)
	{
	 System.out.println("Main method of calculator class");	
	 System.out.println( "Existing Apicatigggon");
	}
}
