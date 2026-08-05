public class circle
{
	double radius;
	String color;
	
	circle()
	{
		this.radius=1.0;
		this.color="red";
	}
	circle(double r)
	{
		this.radius=r;
		this.color="red";
	}
	circle(double r,String color)
	{
		this.radius=r;
		this.color=color;
	}
	double getradius()
	{
		return this.radius;
	}
	String getcolor()
	{
		return this.color;
	}
	double getarea()
	{
		return 22/7*this.radius*this.radius;
	}
	public static void main(String args[])
	{
		circle c1=new circle(2.0,"blue");
		circle c2=new circle(2.0);
		circle c3=new circle();
		
		System.out.println("circle 1");
		System.out.println("radius is "+c1.getradius());
		System.out.println("color is "+c1.getcolor());
		System.out.println("area is "+c1.getarea());
		
		System.out.println();
		
		System.out.println("circle 2");
		System.out.println("radius is "+c2.getradius());
		System.out.println("color is "+c2.getcolor());
		System.out.println("area is "+c2.getarea());
		
		System.out.println();
		
		System.out.println("circle 3");
		System.out.println("radius is "+c3.getradius());
		System.out.println("color is "+c3.getcolor());
		System.out.println("area is "+c3.getarea());
	}
}