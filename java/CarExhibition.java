import java.util.ArrayList;
class CarExhibition{
	ArrayList<Car> cars;
	
	public CarExhibition()
	{
		cars=new ArrayList<>();
	}
	public void addcar(Car car)
	{
		cars.add(car);
	}
	public double gettotalprice()
	{
		double total=0.0;
		for(Car c: cars)
		{
			total=total+c.calculateSalePrice();
		}
		return total;
		
	}
	public void displaycardetails()
	{
		System.out.println("=====CAR EXHIBITION====");
		for(Car c: cars)
		{
			c.displaydetails();
		}
		System.out.printf("Total sale Price: %.2f%n",+gettotalprice());
	}
}