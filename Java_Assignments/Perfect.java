
public class Perfect {

	public static void main(String[] args) {
		
		
		
		int num, sum=0, i;

        num=28;
		 
		 i=1;
		while(i<num){
			
			
			if(num%i==0){
				
				sum = sum +i;
				
			
			}
				i++;
						
	}

	if(sum==num){
		
		System.out.printf("The number is a perfect number.");
	}
	else {

	    System.out.printf("The number is not a perfect number.");
	    
	}
	}

}
