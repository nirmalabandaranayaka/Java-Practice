class Student {
	 private String studentName;
	 private int studentId;
	 
	 Student(String studentName,int studentId)
	 {
		 this.studentName=studentName;
		 this. studentId= studentId;
	 }
	  public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }
	@Override
    public String toString()
	{
    return "Student Name : " + studentName +
           ", Student ID : " + studentId;
	}
	
}