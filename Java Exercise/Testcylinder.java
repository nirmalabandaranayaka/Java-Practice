public class Testcylinder
	{
		public static void main(String args[])
		{
			Circle2 r1=new Circle2();
			Circle2 r2=new Circle2(12.5);
			Circle2 r3=new Circle2(12.5,"blue");
			System.out.println(r1.getarea());
			System.out.println(r2.getarea());
			System.out.println(r3.getarea());
			
			Cylinder c1=new Cylinder();
			System.out.println("radius is:"+c1.getradius()+"height is:"+c1.getheight()+"color is:"+c1.getcolor()+"area is:"+c1.getarea()+"volume is:"+c1.getvolume());
		
		}
	}