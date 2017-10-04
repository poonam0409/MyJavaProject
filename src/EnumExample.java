

enum Weekday  {
	 MONDAY,TUESDAY,WEDNESDAY,THRUSDAY,FRIDAY,SATURDAY;
	 
	 public  Weekday[] getvalues(){
		 return Weekday.values();
	 }
 }
 
public class EnumExample {
	public static void main(String...strings)
	{
	Weekday w=Weekday.MONDAY;
	Weekday anotherArray[]=w.getvalues();
	for(Weekday w1:anotherArray)
		System.out.println(w1);
	}
}
