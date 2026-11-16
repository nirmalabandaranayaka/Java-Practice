class MainBook{
	public static void main(String args[])
	{
		ISBN s=new ISBN("0 941831 39 6");
		Books b=new Books("Object First with java","David j.Barnes and Machael Kolling","Prentice Hall","candy","2026/02/01",s,999.00);
		b.printdetails();
	}
}