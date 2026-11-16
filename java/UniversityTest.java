class UniversityTest{
	public static void main(String args[])
	{
		University university=new University("Jaffna");
		
		MathCourse c1=new MathCourse("C101","mathematics");
		EnglishCourse c2=new EnglishCourse("C102","English");
		ScienceCourse c3=new ScienceCourse("C104","Science");
		
		Studen s1=new Studen("S101","Nir");
		Studen s2=new Studen("S102","Dip");
		Studen s3=new Studen("S103","Sitha");
		Studen s4=new Studen("S104","Kawya");
		Studen s5=new Studen("S105","Himasha");
		
		s1.addcourse(c1);
		s1.addcourse(c2);
		s1.addcourse(c3);
		
		s2.addcourse(c1);
		s2.addcourse(c2);
		
		s3.addcourse(c3);
		
		s4.addcourse(c1);
		s5.addcourse(c2);
		
		university.addstudent(s1);
		university.addstudent(s2);
		university.addstudent(s3);
		university.addstudent(s4);
		university.addstudent(s5);
		
		university.displayalldetils();
	}
}
		