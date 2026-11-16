class Lecture extends Person{
	private String designation;
	private String specialization;
	
	public Lecture(String name,int id,String designation,String specialization)
	{
		super(name,id);
		this.designation=designation;
		this.specialization=specialization;
	}
	@Override
	public void displaydetails()
	{
		System.out.println("Lecture ID:"+id);
		System.out.println("Name:"+name);
		System.out.println("Designation:"+designation);
	}
}