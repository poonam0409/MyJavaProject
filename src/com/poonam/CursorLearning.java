package com.poonam;

import java.util.ArrayList;
import java.util.ListIterator;

public class CursorLearning {

	public static void main(String... args) throws InterruptedException {
		ArrayList<String> al = new ArrayList<>();
		al.add("hello");
		al.add("Welcome");

		ListIterator<String> ltr = al.listIterator();
		while (ltr.hasNext()) { // System.out.println(ltr.next());
			String str = (String) ltr.next();
			System.out.println(str);
			if (str.equals("Welcome"))
				ltr.add("Hi");
			if (str.equals("hello")) {
				ltr.set("World");
			}

		}
		System.out.println(al);
		// Runnable r1 = new Runnable() {
		// @Override
		// public void run() {
		// final int total = 0;
		// synchronized (this) {
		// System.out.println("synchronized child block started"+ total);
		// for(int i=0;i<100;i++)
		// total=total+i;
		// System.out.println("synchronized child block done"+ total);
		// this.notify();
		//
		// }
		// }
		//
		// };

		ThreadA r1 = new ThreadA();
		ThreadA r2 = new ThreadA();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t2.start();

		synchronized (r2) {
			System.out.println("synchronized main block started" + r1.total);
			r2.wait();
			System.out.println("synchronized main block ended" + r1.total);

		}

	}
}

class ThreadA implements Runnable {
	int total = 0;

	@Override
	public void run() {

		synchronized (this) {
			System.out.println("synchronized child block started" + total);
			for (int i = 0; i < 100; i++)
				total = total + i;
			System.out.println("synchronized child block done" + total);
			this.notify();

		}
	}
}