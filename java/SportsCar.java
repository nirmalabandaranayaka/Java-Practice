class SportsCar extends Car{
	
	public SportsCar(String brand,String model,int year,double price)
	{
		super(brand,model,year,price);
	}
	@Override
	public double calculateSalePrice()
	{
		
		if(year>2000)
		{
			price=price*0.75;
		}else if(year>1995)
		{
			price=price*0.5;
		}else{
			price=price*0.25;
		}
		return price;
	}
	@Override
	public void displaydetails()
	{
		super.displaydetails();
		System.out.println("calculate sale price:"+calculateSalePrice());
	}
		
}