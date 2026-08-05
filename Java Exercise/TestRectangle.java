public class TestRectangle
{
	public static void main(String args[])
	{
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle(15.2f,10.0f);
		System.out.println(r1);
		System.out.println(r2);
		r2.setlength(20.3f);
		r2.setwidth(10.8f);
		System.out.println(r2);
		System.out.println("Rectangle area is: "+r2.getarea());
		System.out.println("Rectangle perimeter is: "+r2.getperimeter());
	}
}