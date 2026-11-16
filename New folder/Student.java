class Student extends Person{
	String program;
	int yearofstudy;
	
	public Student(String name,int id,String program,int yearofstudy)
	{
		super(name,id);
		this.program=program;
		this.yearofstudy=yearofstudy;
	}
	@Override
	public void displaydetails()
	{
		System.out.println("Student ID:"+id);
		System.out.println("Name:"+name);
		System.out.println("Program:"+program);
	}
	
}