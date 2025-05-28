
class SalesManager {

	 int id;
	 String name;
	 double salary;
	 double incentive;
	 
	 
	 public SalesManager() {
		 
	 }
	 
	 public SalesManager(int id, String name,double salary,double incentive) {
		 
		 this.id=id;
		 this.name=name;
		 this.salary=salary;
		 this.incentive=incentive;
	 }
	 

	public void setId(int id) {
		this.id = id;
	}




	public void setName(String name) {
		this.name = name;
	}




	public void setSalary(double salary) {
		this.salary = salary;
	}




	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}
	
	
 public int getId() {
		return id;
	}




	public String getName() {
		return name;
	}




	public double getSalary() {
		return salary;
	}




	public double getIncentive() {
		return incentive;
	}




public void display() {
		 
		 System.out.println("SalesManager Id:"+id);
		 System.out.println("SalesManager Name:"+name);
		 System.out.println("SalesManager Salary:"+salary);
		 System.out.println("SalesManager Incentive:"+incentive);
	 }
 
 
 
 
}
