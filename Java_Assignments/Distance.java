 class Distance {
  
	 int feet;
	 int inch;
	 
	 public Distance() {
		 
	 }
	 
	 public Distance(int feet,int inch) {
		 
		 this.feet=feet;
		 this.inch=inch;
	 }
	 
	public void setFeet(int feet) {
		this.feet = feet;
	}
	public void setInch(int inch) {
		this.inch = inch;
	}
	 

	public int getFeet() {
		return feet;
	}
	public int getInch() {
		return inch;
	}
	
	
	public void display() {
		
		System.out.println("Feet:"+feet);
		System.out.println("Inch:"+inch);
	}
	
	
	 
		
		 
	 
}
