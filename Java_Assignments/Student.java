public  class Student {
 
	int rollNo;
	String name;
	double marks;
	
	public void setRollNo(int rollNo)
	{
		this.rollNo=rollNo;
	}
	
	public void setName(String name) {
		
		this.name=name;
	}
	
	public void setMarks(int marks) {
		
		this.marks=marks;
	}
	
	public int getRollNo() {
		 return rollNo;
	}
	
	public String getName() {
		
		return name;
	}
	
	public double getMarks() {
		
		return marks;
	}
	
	
	public Student() {
		
		
	}
	
	
	
	public Student(int rollNo, String name, double marks) {
      
		this.rollNo=rollNo;
		this.name=name;
		this.marks=marks;
      
	}

	public void display() {
		
		System.out.println("Roll No:"+rollNo);
		System.out.println("Name:"+name);
		System.out.println("Marks:"+marks);
	}

	
	
	
}
