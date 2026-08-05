import java.util.List;

class Institute{
	private String instituteName;
	private List<Department> dep;
	
	public Institute(String instituteName,List<Department> dep)
	{
		this.instituteName=instituteName;
		this.dep=dep;
	}
	public void addDepartment(Department depm)
	{
		dep.add(depm);
	}
	public int getTotalStudentInInstitute()
	{
		int noofstudent=0;
		for(Department d: dep){
			List<Student>stu=d.getStudent();
			for(Student s:stu){
				noofstudent++;
		}
		}
		return noofstudent;
	
	}
}