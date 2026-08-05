class Serioscalculator
{
	int calcusum(int n)
	{
		int a=1;
		int d = 2;
		return (n*(2*a+(n-1)*d))/2;
	}
		public static void main(String args[])
		{
			Serioscalculator se = new Serioscalculator();
			int sum = se.calcusum(5);
			System.out.println("sum of the serios "+sum);
		}
	
	
	
	
	
	
	
	
	
	
}
