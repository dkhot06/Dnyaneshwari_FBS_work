 
class Admin {
	
	
	int id;
	String name;
	double salary;
	double allowance;
	
	
	
	public Admin() {
		
		
	}
	
	public Admin(int id,String name,double allowance,double salary) {
		
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.allowance=allowance;
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




	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	
	
	public int getid() {
		
		return id;
	}
  
	
	public String getname() {
		
		return name;
	}
	
	
	public double getsalary() {
		
		return salary;
	}
	
	
	public double getallowance() {
		
		return allowance;
	}



	public void display(){
		
		System.out.println("Admin Id:"+id);
		System.out.println("Admin name:"+name);
		System.out.println("Admin salary:"+salary);
		System.out.println("Admin allowance:"+allowance);
		
	}
	
	
	
}

