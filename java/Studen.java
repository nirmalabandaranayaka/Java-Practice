import java.util.ArrayList;
class Studen{
	private String studentid;
	private String name;
	private ArrayList<Course> courses;
	
	
	public Studen(String studentid,String name)
	{
		this.studentid=studentid;
		this.name=name;
		courses=new ArrayList<>();
	}
	public String getstudentid()
	{
		return studentid;
	}
	public String getstudentname()
	{
		return name;
	}
	public void addcourse(Course course)
	{
		System.out.println("Current size:"+courses.size());
		if(courses.size()<2)
		{
			courses.add(course);
			
		}else
		{
			System.out.println("Student has Maximum of two courses");
		}
	}
	public void displaystudentdetails()
	{
		System.out.println("Student ID:"+studentid);
		System.out.println("Student Name:"+name);
		
		for(Course c:courses)
		{
			c.displaydetails();
		}
		
	}
}
	