  class Car{
	String brand;
	String model;
	int year;
	double price;
	
	public Car(String brand,String model,int year,double price)
	{
		this.brand=brand;
		this.model=model;
		this.year=year;
		this.price=price;
	}
	public void displaydetails()
	{
		System.out.println("Brand:"+brand);
		System.out.println("Model:"+model);
		System.out.println("year:"+year);
		System.out.println("Price:"+price);
	}
	public double calculateSalePrice()
	{
		return price;
	}
}