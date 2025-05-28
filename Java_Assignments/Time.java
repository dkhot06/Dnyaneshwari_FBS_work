
 class Time {
   
	 int hour;
	 int min;
	 int sec;
	 
	 public Time() {
		 
	 }
	 
	 public Time(int hour,int min,int sec) {
		 
		 this.hour=hour;
		 this.min=min;
		 this.sec=sec;
	 }
	 
	 
	public void setHour(int hour) {
		this.hour = hour;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public void setSec(int sec) {
		this.sec = sec;
	}
	 
	 
	
	public int getHour() {
		return hour;
	}

	public int getMin() {
		return min;
	}

	public int getSec() {
		return sec;
	}

	public  void display() {
		
		System.out.println("Hour:"+hour);
		System.out.println("Minutes:"+min);
		System.out.println("Seconds:"+sec);
	}
	
	
	
	public static void main(String [] args) {
		
		 Time t = new Time();
		 
		 t.setHour(3);
		 t.setMin(45);
		 t.setSec(48);
		 
		 
		 t.display();
	}
	 
	 
}
