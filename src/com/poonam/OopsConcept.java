package com.poonam;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Poonam {
	protected int id;
	private String name;
	
	static int stat;
 int nonstat;
//	public Poonam(int id, String name) {
//		System.out.println("inside parameterized construtor");
//		this.id = id;
//		this.name = name;
//	}

	 public Poonam() {
		super();
		System.out.println("inside default construtor");
	}

	private String getName() {
		return name;
	}

	private int getId() {
		return id;
	}
	public  void runlamda(InterfaceExample r) {
		// TODO Auto-generated method stub
		r.checkLamda();
	}

	public  void getnonstaticCount()  {
		nonstat++;
	}
	public static void getstaticCount()  {
		stat++;
	}
}

class SubPoonam extends Poonam {

	public SubPoonam(int id, String name) {
		//super(id, name);
		// TODO Auto-generated constructor stub\
	System.out.println("Inside parameterized sub class constructor");
	}

	
	public void getmeth() {
		// TODO Auto-generated method stub
		// super.getmeth();
	}

}

public class OopsConcept implements InterfaceExample  {
	private int i;
	protected int y;
	int z;
	public int x;
	

	public static void main(String[] args) throws Exception{
Poonam po  =new Poonam();
Poonam.getstaticCount();
//po.runlamda(() -> {System.out.println("run lamba ");});

OopsConcept os = new OopsConcept();
InterfaceExample.checkmeth();
Thread.sleep(3000);
System.out.println("after waiting");

//******************************************************************************
//Class<?> toRun = Class.forName("com.poonam.Calculator");
//  Method mainmethod = findmain(toRun);
//  mainmethod.invoke(null, new Object[]{toRun});
//
//	}
//
//	 static Method findmain(Class<?> toRun) {
//		// TODO Auto-generated method stub
//		 Method meth[]= toRun.getMethods();
//		for(int i=0;i<=meth.length;i++)
//			{if (meth[i].getName().equals("main"))
//			return meth[i];
//			}	
//		return null;
	}
	

@Override
public void checkLamda() {
	// TODO Auto-generated method stub
	
}
	


	

	
	

}
