import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class ConcurrentLearning {
	 static HashMap<String,String> map= new HashMap<>();
	
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
		new Thread(()->{add();}).start();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		BlockingQueue<String> queue = new ArrayBlockingQueue<>(10);
		queue.put("Queue1");
		queue.put("Queue2");
		queue.put("Queue3");
		queue.put("Queue4");
		queue.contains("Hello");
	String head= queue.take();
		
		System.out.println(head);
	}
	
}
