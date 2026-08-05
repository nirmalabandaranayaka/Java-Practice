public class SeriesCalculator{
	
	int calsum(int n)
	{
		int a=1;
		int d=2;
		
		return (n/2)*(2*a+(n-1)*d);
	}
	public static void main(String args[])
	{
		SeriesCalculator se=new SeriesCalculator();
		se.calsum(5);
		System.out.println("sum is: "+se.calsum(5));
	}
}
	