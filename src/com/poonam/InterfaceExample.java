package com.poonam;


public interface InterfaceExample{

	void checkLamda();
	static void checkmeth()
	{Thread t = new Thread(new Runnable() {
		
		@Override
		public void run() {
			System.out.println("i can run from interface also");
			
		}
	});
	   t.start();
		
	}
}