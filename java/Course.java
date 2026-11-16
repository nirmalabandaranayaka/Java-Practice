class Course{
	private String courseid;
	private String name;
	
	public Course(String courseid,String name)
	{
		this.courseid=courseid;
		this.name=name;
	}
	public void displaydetails()
	{
		System.out.println("Course id:"+courseid);
		System.out.println("Course Name:"+name);
	}
}