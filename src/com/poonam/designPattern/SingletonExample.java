package com.poonam.designPattern;

import java.io.Serializable;

class Singleton implements Serializable {
	private static volatile Singleton singleObj = null;

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (singleObj == null) {
//			synchronized (Singleton.class) {
//				if (singleObj == null) {
					System.out.println(Thread.currentThread().getName() + "inside null");
					singleObj = new Singleton();
//				}
//			}
		}
		System.out.println(Thread.currentThread().getName() + "outside null");
		return singleObj;
	}

	public void doSomething() {
		System.out.println("happily created singletonclass");
	}

}

public class SingletonExample {
	public static void main(String... strings) {
		new Thread(() -> {
			Singleton.getInstance();
		}, "THread1").start();
		new Thread(() -> {
			Singleton.getInstance();
		}, "THread2").start();
	}

}
