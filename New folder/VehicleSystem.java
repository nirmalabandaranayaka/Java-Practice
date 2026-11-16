class VehicleSystem{
	public static void main(String args[])
	{
		Car c=new Car("CAR001","Toyota",5,8000.00);
		Motorcycle m=new Motorcycle("BIKE001","Honda",150,4000.00);
		c.displaydetails();
		m.displaydetails();
	}
}