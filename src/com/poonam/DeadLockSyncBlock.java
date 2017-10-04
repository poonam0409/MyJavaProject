package com.poonam;

class A1 {
	public void meth(B1 b) {
		synchronized (b) {
			System.out.println("Inside Class A meth");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			b.last();
		}
	}

	public void last() {
		synchronized (this) {
			System.out.println("Inside class A");
		}
	}
}

class B1 {
	public void meth(A1 a) {
		synchronized (a) {
			System.out.println("Inside Class B meth");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			a.last();
		}
	}

	public void last() {
		synchronized (this) {
			System.out.println("Inside class B");
		}
	}

}

public class DeadLockSyncBlock {

	public static void main(String[] args) {
		A1 a = new A1();
		B1 b = new B1();
		new Thread(() -> a.meth(b)).start();
  
		new Thread(() -> b.meth(a)).start();
	}

}
