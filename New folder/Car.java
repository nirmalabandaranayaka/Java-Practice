class Car extends Vehicle implements Rentable{
	int numberofseats;
	double dailyrent;
	
	public Car(String vehiclenumber,String brand,int numberofseats,double dailyrent)
	{
		super(vehiclenumber,brand);
		this.numberofseats=numberofseats;
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
		System.out.println("Car Number:"+vehiclenumber);
		System.out.println("Number of Seats:"+numberofseats);
		System.out.println("Daily Rent:LKR"+dailyrent);
		System.out.println("Calculated rent:LKR"+calculaterent());
	}
}

	