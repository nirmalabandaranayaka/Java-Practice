class Motorcycle extends Vehicle implements Rentable{
	int enginecapacity;
	double dailyrent;
	
	public Motorcycle(String vehiclenumber,String brand,int enginecapacity,double dailyrent)
	{
		super(vehiclenumber,brand);
		this.enginecapacity=enginecapacity;
		this.dailyrent=dailyrent;
		
	
	}
	@Override
	public double calculaterent()
	{
		return dailyrent;
	}
	@Override
	public void displaydetails()
	{
		System.out.println("Motorcycle Number:"+vehiclenumber);
		System.out.println("Brand:"+brand);
		System.out.println("Engine Capacity:"+enginecapacity+"cc");
		System.out.println("Daily Rent:LKR"+dailyrent);
		System.out.println("Calculate Rent:LKR"+calculaterent());
	}
	}
		
	