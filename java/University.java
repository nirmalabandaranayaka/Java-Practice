import java.util.ArrayList;
class University{
	private String name;
	private ArrayList<Studen> students;
	
	public University(String name)
	{
		this.name=name;
		students=new ArrayList<>();
	}
	public void addstudent(Studen student)
	{
		students.add(student);
	}
	public void displayalldetils()
	{
		System.out.println("University:"+name);
		System.out.println();
		for(Studen s: students)
		{
			s.displaystudentdetails();
			System.out.println();
		}
	}
}
		