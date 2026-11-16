class ClassicCar extends Car{
	
	public ClassicCar(String brand,String model,int year,double price)
	{
		super(brand,model,year,price);
	}
	@Override
	public double calculateSalePrice()
	{
		return 100000.00;
		
	}
	@Override
	public void displaydetails()
	{
		super.displaydetails();
		System.out.println("Calculate sale price:"+calculateSalePrice());
	}
}
		
			
	