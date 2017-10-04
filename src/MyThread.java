import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

import com.poonam.OopsConcept;


class Syncvariable {
	ReentrantLock lock = new ReentrantLock(false);
	int count = 0;

	public void increment() throws IllegalArgumentException {

		try {
			if (lock.tryLock(10,TimeUnit.SECONDS)) {
				System.out.println("count value " + count);
				count++;
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	finally {
			 lock.unlock();
			// lock.notify();
		}

		// System.out.println("Does not get lock");

	}

}

public class MyThread  {
	 private static ThreadLocal<String> tl = new ThreadLocal<>();
	public static void main(String... strings) throws InterruptedException, ExecutionException {
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		String value = "threadloal value";
		tl.set(value );
		System.out.println("threadlocal variable  "+ tl.get() );
		tl.remove();
		System.out.println("After removethreadlocal variable  "+ tl.get() );
		
		Syncvariable sync = new Syncvariable();
		Runnable r1 = () -> {
			for (int i = 0; i < 10; i++) {
				sync.increment();
				System.out.println("In r1 " + sync.count);
				//ThreadLocal<String> t2 = new ThreadLocal<>();
				String value1 = "In r1 threadloal value";
				tl.set(value1 );
				System.out.println("threadlocal variable  "+ tl.get() );
				tl.remove();
				System.out.println("After removethreadlocal variable  "+ tl.get() );
			
			}
		};

		Runnable r2 = () -> {
			for (int i = 65; i < 75; i++) {
				sync.increment();
				System.out.println("In r2 " + sync.count);

			}

		};

		Runnable r3 = () -> {
			for (int i = 65; i < 75; i++) {
				sync.increment();
				System.out.println("In r3 " + sync.count);

			}

		};
				Thread t3 = new Thread(r1);
		Thread t4 = new Thread(r2);
		 Thread t5 = new Thread(r3);
		t3.start();
		t4.start();
		// t5.start();
		t3.join();
		t4.join();
		System.out.println(sync.count);
		System.out.println("At end hreadlocal variable  "+ tl.get() );
		System.out.println("end");
		 System.out.println("end2");
		 System.out.println("end3");
		 
	MyThread T = new MyThread();
		
		
	}

}
