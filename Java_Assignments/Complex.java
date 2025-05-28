
 class Complex {
  
	 int real;
	 int imaginary;
	 
	 public Complex(){
		 
		 
	 }
	 
	 public Complex(int real,int imaginary) {
		 
		 this.real=real;
		 this.imaginary=imaginary;
	 }
	 
	 
	public void setReal(int real) {
		this.real = real;
	}
	public void setImaginary(int imaginary) {
		this.imaginary = imaginary;
	}
	
	public int  getReal() {
		return real;
	}
	 
	
	public int getImaginary() {
		
		return imaginary;
		
	}
	 
	public void display() {
	    System.out.println(real + " + i" + imaginary);
	}

	 
	 
	 
	 
}
