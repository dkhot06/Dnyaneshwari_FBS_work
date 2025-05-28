
 class Date {
   
	 int date;
	 String month;
	 int year;
	 
	 
	 public Date() {
		 
	 }
	 
	 public Date(int date,String month,int year) {
		 
		 this.date=date;
		 this.month=month;
		 this.year=year;
	 }
	 
	 

	public void setMyDate(int date) {
		this.date = date;
	}


	public void setMyMonth(String month) {
		this.month = month;
	}


	public void setMyYear(int year) {
		this.year = year;
	}
    

	public int getMyDate() {
		return date;
	}

	public String getMyMonth() {
		return month;
	}

	public int getMyYear() {
		return year;
	}

	public void display() {
		 
		 System.out.println("Date:"+date);
		 System.out.println("Month:"+month);
		 System.out.println("Year:"+year);
	 }
	
	
	
	
}
