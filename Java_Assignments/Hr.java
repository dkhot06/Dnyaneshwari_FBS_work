
 class Hr {
   
	 int id;
	 String name;
	 double salary;
	 double comission;
	 
	 public Hr() {
		 
		 
	 }
	 
	 
	 public Hr(int id,String name,double salary,double comission) {
		 
		 
		 this.id=id;
		 this.name=name;
		 this.salary=salary;
		 this.comission= comission;
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




	public void setComission(double comission) {
		this.comission = comission;
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
	
	public double getcomission() {
		
		return comission;
		
		
	}
 public void display() {
		 
		 System.out.println("Hr Id:"+id);
		 System.out.println("Hr name:"+name);
		 System.out.println("Hr salary:"+salary);
		 System.out.println("Hr comission:"+comission);
	 }
 
 
 

}
