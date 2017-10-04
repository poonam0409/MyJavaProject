	import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Student extends PoonamException {
	Integer rollNum;
	String name;

	Student(int roll, String name) {
		this.rollNum = roll;
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((rollNum == null) ? 0 : rollNum.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rollNum == null) {
			if (other.rollNum != null)
				return false;
		} else if (!rollNum.equals(other.rollNum))
			return false;
		return true;
	}

	
	@Override
	public String toString() {
		return "Student " + rollNum + "::" + name;
	}

}

public class Learn {

	public static void main(String... strings) throws IOException {
		Student s1 = new Student(32, "Poonam");
		//PoonamException p1 = new PoonamException();
		System.out.println(s1.getClass());
		//System.out.println();
		
		List<String> l = new ArrayList<String>();
		l.add(null);
		l.add(null);
		l.add(null);
		l.add(null);
		System.out.println("LinkedList" + l);

		Set<String> s = new HashSet<String>();
		System.out.println(s.toString());
		System.out.println(s.add("Poonam"));
		System.out.println(s.add("Pankaj"));
		System.out.println(s.add("Poonam"));
		System.out.println(s.add("Poonam"));
		for (String st : s) {
			System.out.println(st);
		}

		Map<String, String> m = new HashMap<>();

//		m.put(new Student(1, "Poonam"), new Student(1, "Poonam"));
//		m.put(new Student(1, "Poonam"), new Student(2, "Pankaj"));

		m.put("Poonam", "Lenovo");
		m.put("Akki", "Iphone");
		m.put("Pankaj", "OnePlusOne");
		String Value ="Iphone";
		String key =null;
		
		Iterator<Entry<String,String>> itr = m.entrySet().iterator();
		while(itr.hasNext())
		{
			if(Value.equals(itr.next().getValue()))
				{key=itr.next().getKey();
				System.out.println("Iteration " +key + Value);
				}
				
		}
			
		for ( Map.Entry<String, String> e : m.entrySet())
		{
			if(Value.equals(e.getValue()))
			{ key= e.getKey();
			System.out.println("Custom Class" + e);
			}
			
		}
		System.out.println("Custom Class" + m);

		// int i =9;
		//
		// if (i<10)
		// {
		// try {
		// throw new PoonamException("i is less than 10 ");
		// } catch (Exception e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// }
		//
		// try{
		// BufferedReader br= new BufferedReader(new
		// InputStreamReader(System.in));
		//
		// String st =br.readLine();
		// System.out.println(st);
		// } catch (IOException e1) {
		// // TODO Auto-generated catch block
		// e1.printStackTrace();
		// }
		// try {
		// i = System.in.read();
		// System.out.println((char)i);
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// Scanner sc = new Scanner(System.in);
		// String str= sc.nextLine();
		// String str2=sc.nextLine();
		// System.out.println(str+" "+str2);
		//
		// String checkSplit="Poonam, Piyush, Pankaj, Vijay";
		// String names[] = checkSplit.split(",");
		//
		// for(String valu:names)
		// {
		// System.out.println(valu);
		// }
		// List <String> l= new ArrayList<>();
		//
		// l.add("poonam");
		// l.add("vijay");
		//
		//
		//
		// Iterator<String> val = l.iterator();
		//
		// while(val.hasNext()){System.out.println(val.next());}
		//
		//
	}
}

class PoonamException extends Exception

{
	public PoonamException(String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
	}
	
	public PoonamException()
	{}
	
}