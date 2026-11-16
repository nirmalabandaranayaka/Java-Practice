import java.util.Scanner;
import java.util.ArrayList;
class StudentManagement{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Student> students=new ArrayList<>();
		int choice;
		do{
			System.out.println("=====Student Management Menu=====");
			System.out.println("1.Add new Student");
			System.out.println("2.Display All Students");
			System.out.println("3.Exit");
			choice=sc.nextInt();
			
			switch(choice)
			{
				case 1: 
				sc.nextLine();
				System.out.print("Enter Name:");
				String name=sc.nextLine();
				System.out.print("Enter Age:");
				int age=sc.nextInt();
				System.out.print("Enter student ID:");
				sc.nextLine();
				String id=sc.nextLine();
				System.out.print("Enter Course:");
				String course=sc.nextLine();
				
				Student s1=new Student(name,age,id,course);
				students.add(s1);
				System.out.println("Student added successfully!");
				
				break;
				
				case 2:
				if(students.isEmpty())
				{
					System.out.println("Not student");
				}
				else{
					System.out.println("=====Student List=====");
					for(Student s: students)
					{
						s.displaydetails();
					}
				}
				break;
				
				case 3:
				System.out.println("Exiting system,goodbye!");
				break;
				
				default:
				System.out.println("Invalid choice");
			}
		}while(choice !=3);
			sc.close();
	}
}
				
				