public class Student5
{
	private String name;
	private String address;
	private String[] courses;
	private int[] grades;
	private int numcourses;
	private static final int max_courses=30;
	
	public Student5(String name,String address)
	{
		this.name=name;
		this.address=address;
		courses=new String[max_courses];
		grades=new int[max_courses];
		numcourses=0;
	}
	public String getname()
	{
		return this.name;
	}
	public String getaddress()
	{
		return this.address;
	}
	public void setaddress(String address)
	{
		this.address=address;
	}
	public String toString()
	{
		return name+"("+address+")";
	}
	public void addcoursegrade(String course,int grade)
	{
		courses[numcourses]=course;
		grades[numcourses]=grade;
		++numcourses;
	}
	public void printgrade()
	{
		System.out.print(name);
		for(int i=0; i<numcourses; i++)
		{
			System.out.print(" "+courses[i]+":"+grades[i]);
		}
		System.out.println();
	}
	public double getaveragegrade()
	{
		int sum=0;
		for(int i=0; i<numcourses; i++)
		{
			sum+=grades[i];
		}
		return (double)sum/numcourses;
	}
}

		