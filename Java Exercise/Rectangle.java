public class Rectangle
{
	private float length;
	private float width;
	
	public Rectangle()
	{
		this.length=1.0f;
		this.width=1.0f;
	}
	public Rectangle(float length,float width)
	{
		this.length=length;
		this.width=width;
	}
	public float getlength()
	{
		return this.length;
	}
	public void setlength(float length)
	{
		this.length=length;
	}
	public float getwidth()
	{
		return this.width;
	}
	public void setwidth(float width)
	{
		 this.width=width;
	}
	public double getarea()
	{
		return this.length*this.width;
	}
	public double getperimeter()
	{
		return this.length*2+this.width*2;
	}
	public String toString()
	{
		return "Rectangle[length="+this.length+"width="+","+this.width+"]";
	}
}