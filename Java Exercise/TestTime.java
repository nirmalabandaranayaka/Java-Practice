public class TestTime
{
	public static void main(String args[])
	{
		Time t1=new Time(1,2,3);
		System.out.println(t1);
		
		Time t2=new Time();
		System.out.println(t2);
		
		t1.sethour(4);
		t1.setminite(5);
		t1.setsecond(6);
		
		System.out.println(t1);
		
		System.out.println("hour is: "+t1.gethour());
		System.out.println("minite is: "+t1.getminite());
		System.out.println("second is: "+t1.getsecond());
		
		t1.settime(58,59,23);
		System.out.println(t1);
		
		System.out.println(t1.nextsecond());
		System.out.println(t1.nextsecond().nextsecond().nextsecond());
	}
}
		