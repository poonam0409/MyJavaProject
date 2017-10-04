import java.util.Random;

public class Test {

	static {
		System.out.println("This is static 2");
	}
	static {
		System.out.println("This is static 122");
	}
 static int outer_var;
 static void increment()
 {outer_var++; 
 System.out.println(outer_var);
 }
	public static void main(String... poo) {
		int i = 0b1____0_0___0_______1;
		System.out.println("Hello");
		System.out.println(i);

		int a[] = new int[6];
		for (int j = 0; j < 6; j++) {
			Random r = new Random();
			a[j] = r.nextInt(100);
			// System.out.println(a[j]);
		}
		
		for (int k : a)

			System.out.println(k);

		int b[][] = { { 1, 2, 3 }, { 4, 7, 3 }, { 1, 2, 9 } };
		try {
			for (int k : b[3])

				System.out.println(k);
		}

		catch (Exception ex) {
			System.out.println("Out of bound");
		}

		Check c = new Check();
		Check c2 = new Check();
		Check c3 = new Check();
		c.read("8", "Helo");
		c2.read("nice");
		c3.read("work");

		Check.call_non_static_variable();
	}

	static {
		System.out.println("This is static 3");
	}
	
	public static void main(Integer... poo) {
		
		System.out.println("Overloading main");
	}
}

class Check extends Test

{
	int non_static_variable = 12;
	static int che = 8;
	static {
		System.out.println("This is static in classe chck" + che);
	}

	Check() {

	}

	public void read(int k) {
		non_static_variable = k;

		System.out.println("Number is in read " + k);
	}

	{
		System.out.println("This is static 1");
	}

	static void call_non_static_variable() {
		System.out.println("this is non static variable " + che);
	}

	
	public static void main(String ...i) 
	{
		System.out.println("overriding method");
	}
	public void read(String... i) {
		// TODO Auto-generated method stub
		System.out.println("Number is " + che);
		++che;
		System.out.println("Number after increment " + che);
		for (String k : i)
			System.out.println("Number is " + k);
	}
}
