
public class Main {

	
public static void main(String[] args) {
		
		//Create object of Student class
		
		Student s= new Student();
		Student s1=new Student();
		Student s2=new Student(101,"tanvi",75);
		
		
		
		//Setting values using setter
		s.setRollNo(101);
		s.setName("Tanvi");
		s.setMarks(85);
		s.getRollNo();
		s.getName();
		s.getMarks();
		
		
		//calling display method to print details
		
		System.out.println("----Using setter getter---");
		s.display();
		System.out.println("---Using default construstor---");
		s1.display();
		System.out.println("---USing parameterized constructor---");
		s2.display();
		
		
	
//		//----ADMIN----
		
        Admin a = new Admin();
        Admin a1 = new Admin();
        Admin a2 = new Admin(334,"Yash",50000,4000);
		
		a.setId(2344);
		a.setName("abc");
		a.setSalary(40000);
		a.setAllowance(5000);
		a.getid();
		a.getname();
		a.getsalary();
		a.getallowance();
		
		System.out.println("----Using setter getter---");
		a.display();
		System.out.println("---Using default construstor---");
		a1.display();
		System.out.println("---USing parameterized constructor---");
		a2.display();
		
		
		//---Hr---
		
		 Hr hr= new Hr();
		 Hr hr1 = new Hr();
		 Hr hr2 = new Hr(489,"Sakshi",60000,4000);
		  
		  hr.setId(3787);
		  hr.setName("xyz");
		  hr.setSalary(50000);
		  hr.setComission(4000);
		  
		  System.out.println("----Using setter getter---");
			hr.display();
			System.out.println("---Using default construstor---");
			hr1.display();
			System.out.println("---USing parameterized constructor---");
			hr2.display();
			
		  
		  //-----Employee-----
			
			Employee e=new Employee();
			Employee e1 = new Employee();
			Employee e2 = new Employee(987,"Bhakti",50000);
			
			e.seteId(345);
			e.setName("Yash");
			e.setSalary(40000);
			e.geteId();
			e.getName();
			e.getsalary();
			
			System.out.println("----Using setter getter---");
			e.display();
			System.out.println("---Using default construstor---");
			e1.display();
			System.out.println("---USing parameterized constructor---");
			e2.display();
			
			
			//----Date----
			
			Date d = new Date();
			Date d1=new Date();
			Date d2 = new Date(29,"August",2005);
			
			d.setMyDate(06);
			d.setMyMonth("May");
			d.setMyYear(2002);
			d.getMyDate();
			d.getMyMonth();
			d.getMyYear();
			
			
			System.out.println("----Using setter getter---");
			d.display();
			System.out.println("---Using default construstor---");
			d1.display();
			System.out.println("---USing parameterized constructor---");
			d2.display();
			
			
			//---Complex---
			
			 
			 Complex c = new Complex();
			 Complex c1=new Complex();
			 Complex c2 = new Complex(2,3);
			 
			 c.setReal(2);
			 c.setImaginary(2);
			 c.getReal();
			 c.getReal();
			 
			 System.out.println("----Using setter getter---");
				c.display();
				System.out.println("---Using default construstor---");
				c1.display();
				System.out.println("---USing parameterized constructor---");
				c2.display();
				
				
				//----Distance--
				
				
				 
				 Distance dis = new Distance();
			 Distance dis1 =new Distance();
				 Distance dis2 = new Distance(2,3);
				 

				   dis.setFeet(3);
				   dis.setInch(45);
				   dis.getFeet();
				   dis.getInch();				   
				   
				   
				   
				 
				 System.out.println("----Using setter getter---");
					dis.display();
					System.out.println("---Using default construstor---");
					dis1.display();
					System.out.println("---USing parameterized constructor---");
					dis2.display();
					
					
					
					//---Time---
					
					 Time t = new Time();
					 Time t1 = new Time();
					 Time t2 = new Time(2,34,56);
					 
					 t.setHour(3);
					 t.setMin(45);
					 t.setSec(48);
					 t.getHour();
					 t.getMin();
					 t.getSec();
					 
					 
					 
					
					 
					 
					 System.out.println("----Using setter getter---");
						t.display();
						System.out.println("---Using default construstor---");
						t1.display();
						System.out.println("---USing parameterized constructor---");
						t2.display();
						
						
						
						//SalesManager
						
						 SalesManager sm = new SalesManager();
						    
						 SalesManager sm1 = new SalesManager();
						 SalesManager sm2 = new SalesManager(987,"Bhakti",50000.0,800.8);
							
							sm.setId(345);
							sm.setName("Yash");
							sm.setSalary(40000);
							sm.setIncentive(6000.0);
							sm.getId();
							sm.getName();
							sm.getSalary();
							
							System.out.println("----Using setter getter---");
							sm.display();
							System.out.println("---Using default construstor---");
							sm1.display();
							System.out.println("---USing parameterized constructor---");
							sm2.display();
			
		
		
	}
}
