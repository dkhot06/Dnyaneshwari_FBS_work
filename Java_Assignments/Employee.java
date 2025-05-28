
class Employee {
	
	
	int eId;
	String name;
	double salary;
	
	
	
	public Employee() {
		
		
	}
	
	public Employee(int id,String name,double salary) {
		
		this.eId=id;
		this.name=name;
		this.salary=salary;
		
	}
	
	
	
	
	public void seteId(int eId) {
		this.eId = eId;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	public int geteId() {
		
		return eId;
	}
	
	public String getName() {
		
		return name;
	}
	
	public double getsalary() {
		
		return salary;
	}


	public void display() {
		
	 System.out.println("Employee Id:"+eId);
	 System.out.println("Employee name:"+name);
	 System.out.println("Employee Salary:"+salary);
	 
	
		
	}
	
	
	

}
