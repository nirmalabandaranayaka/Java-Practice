public class Circle2
{
	private double radius;
	private String color;
	
	public Circle2()
	{
		this.radius=1.0;
		this.color="red";
	}
	public Circle2(double radius)
	{
		this.radius=radius;
		this.color="red";
	}
	public Circle2(double radius,String color)
	{
		this.radius=radius;
		this.color=color;
	}
	public double getradius()
	{
		return this.radius;
	}
	public void setradius(double radius)
	{
		this.radius=radius;
	}
	public String getcolor()
	{
		return this.color;
	}
	public void setcolor(String color)
	{
		this.color=color;
	}
	public String toString()
	{
		return "Circle[radius:"+radius+" "+"color:"+color+"]";
	}
	public double getarea()
	{
		return (22.0/7)*this.radius*this.radius;
	}
}