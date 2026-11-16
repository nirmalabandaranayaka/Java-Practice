
class MainCar{
	public static void main(String args[])
	{
		CarExhibition ex=new CarExhibition();
		ClassicCar c1=new ClassicCar("jkh","JKkk",2001,800000.00);
		SportsCar c2=new SportsCar("jkk","jkk",1996,100000.00);
		ex.addcar(c1);
		ex.addcar(c2);
		
		ex.displaycardetails();
		
	}
}