package com.poonam;

class A {
	public synchronized void meth(B b) {
		System.out.println("Inside Class A meth");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		b.last();
	}

	public synchronized void last() {
		System.out.println("Inside class A");
	}
}

class B {
	public synchronized void meth(A a) {
		System.out.println("Inside Class B meth");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		a.last();
	}

	public synchronized void last() {
		System.out.println("Inside class B");
	}

}

public class DeadLockExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		A a = new A();
		B b = new B();
		new Thread(() -> a.meth(b)).start();
		Thread.sleep(1000);

		new Thread(() -> b.meth(a)).start();

	}

}
