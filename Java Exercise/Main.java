import java.util.ArrayList;
class Main{
	public static void main(String args[])
	{
		ArrayList<Student>ItStudent=new ArrayList<>();
		ItStudent.add(new Student("Nirmala",12971));
		ItStudent.add(new Student("Kumuditha",12975));
		
		ArrayList<Student>CSStudent=new ArrayList<>();
		CSStudent.add(new Student("him",4562));
		CSStudent.add(new Student("jik",4563));
		
		Department Itdept=new Department("It",ItStudent);
		Department CSdept=new Department("CS",CSStudent);
		
		ArrayList<Department>dep=new ArrayList<>();
		dep.add(Itdept);
		dep.add(CSdept);
		
		Institute in = new Institute("Jaffna",dep);
		
		System.out.println("It Department");
		
		for(Student s: Itdept.getStudent()){
			System.out.println(s);
		}
		
		System.out.println("CS Department");
		
		for(Student s: CSdept.getStudent()){
			System.out.println(s);
		}
		System.out.println("TotalStudent:"+in.getTotalStudentInInstitute());
	}
}