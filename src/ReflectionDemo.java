import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.poonam.XYZ;

class A{
	public void check()
	{System.out.println("inside check");}
}

public class ReflectionDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Class c = Class.forName("com.poonam.XYZ");
		
		XYZ x= (XYZ) c.newInstance();
	     x.showHello();

	     Class[] args3 = new Class[1];
         args3[0] = Integer.TYPE;
		Method m= c.getDeclaredMethod("show", args3[0]);
		m.setAccessible(true);
		m.invoke(x, 5);
		
		

	}

}
