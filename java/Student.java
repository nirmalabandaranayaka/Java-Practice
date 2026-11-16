class Student{
	String name;
	int age;
	String studentid;
	String course;
	
	public Student(String name,int age,String studentid,String course)
	{
		this.name=name;
		this.age=age;
		this.studentid=studentid;
		this.course=course;
	}
	public String getname()
	{
		return this.name;
	}
	public int getage()
	{
		return this.age;
	}
	public String getstudentid()
	{
		return this.studentid;
	}
	public String getcourse()
	{
		return this.course;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public void setage(int age)
	{
		this.age=age;
	}
	public void setstudentid(String studentid)
	{
		this.studentid=studentid;
	}
	public void setcourse(String course)
	{
		this.course=course;
	}
	public void displaydetails()
	{
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Student id:"+studentid);
		System.out.println("Course:"+course);
	}
}
	