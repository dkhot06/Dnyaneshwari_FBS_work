
public class Prime {

	public static void main(String[] args) {
		
		int num,i=2,flag=0;
		
		
	     num=56;
		
		
		while(i<num/2){
			
		   if(num%i==0){
		   	
		   	    flag =1;
		   	    break;
		   }
		   
		     i++;
		
		}
		
		if(flag==0){
			
			System.out.printf("The number is a prime number ");
		}
		
		else{
			
			System.out.printf("The number is not a prime number");
		}

	}

}
