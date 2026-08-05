import java.util.List;
class Department{
	private String deptname;
	private List<Student> stu;
	
	public Department(String deptname,List<Student> stu)
	{
		this.deptname=deptname;
		this.stu=stu;
	}
	public List<Student> getStudent()
	{
	return stu;
	}
	public void addstudent(Student stud)
	{
		stu.add(stud);
	}
}
