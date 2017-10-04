package com.poonam;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentArrayListLearning {
	 CopyOnWriteArrayList<String>  cowal = new CopyOnWriteArrayList<>();
	

	public static void main (String ... args) throws InterruptedException
	{
		CopyOnWriteArrayList<String>  cowal = new CopyOnWriteArrayList<>();
		cowal.add("Poonam");
		cowal.add("Purva");
		Iterator<String> itr = cowal.iterator();
		while(itr.hasNext())
			
		{ cowal.add("Amrita");
			System.out.println(itr.next());
			if(cowal.contains("Purva"))
			itr.remove();
		}
		System.out.println(cowal);
		
	}
	
}
