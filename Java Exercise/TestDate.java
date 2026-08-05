public class TestDate
	{
		
	public static void main(String args[])
	{
		Date dd= new Date(1,2,2026);
		
		System.out.println(dd);
		
		dd.setyear(2012);
		dd.setmonth(02);
		dd.setday(03);
		
		System.out.println(dd.getyear());
		System.out.println(dd.getmonth());
		System.out.println(dd.getday());
		
		System.out.println(dd.toString());
		
	}
	}