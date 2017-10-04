package com.poonam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapLearning {
	 static ConcurrentHashMap<String,String> map= new ConcurrentHashMap<>();
	 
	
	static void add(){
		System.out.println("child thread is working");
		map.put("Amrita", "Patna");
		System.out.println(map);
	}

	public static void main (String ... args) throws InterruptedException
	{
		map.put("Poonam","Patna");
		map.put("Purva","Bhopal");
		
		Iterator<Entry<String, String>> itr = map.entrySet().iterator();
java.util.Set newSet =map.entrySet();
newSet.add("strange");
System.out.println(newSet.size());
		new Thread(()->{add();}).start();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		java.util.Set concurrentHashSet =  map.newKeySet();
		concurrentHashSet.add("OCEJWCD"); //OK
		concurrentHashSet.contains("OCEJWCD"); //OK
		concurrentHashSet.remove("OCEJWCD"); //OK
		System.out.println(concurrentHashSet);
		
	}
	
}
