public class TestPoint
{
	public static void main(String args[])
	{
		Point p1=new Point(1,2);
		System.out.println(p1);
		Point p2=new Point();
		System.out.println(p2);
		p1.setx(3);
		p1.sety(4);
		System.out.println(p1);
		System.out.println("x is: "+p1.getx());
		System.out.println("y is: "+p1.gety());
		p1.setxy(5,6);
		System.out.println(p1);
		System.out.println("x is: "+p1.getxy()[0]);
		System.out.println("y is: "+p1.getxy()[1]);
		p2.setxy(10,11);
		System.out.printf("Distance is: %.2f%n",p1.distance(10,11));
		System.out.printf("Distance is: %.2f%n",p2.distance(p1));
		System.out.printf("Distance is: %.2f%n",p1.distance());
	}
}
