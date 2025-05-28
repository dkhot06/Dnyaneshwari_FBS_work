
public class Strong {

	public static void main(String[] args) {
	
		int num=145, rem, i , fact ,temp;
		
		int sum = 0;
		
		
		
		temp = num;
		
		while(temp>0){
			
			rem = temp%10;
			
			fact=1;
			
			for(i=1;i<=rem;i++){
				
				fact= fact*i;
			}
			
			sum = sum+fact;
			temp = temp/10;
			
		}
		
		if(sum==num){
			
			System.out.printf("The number is a strong number.");
			
		}
		
		else{
			
			System.out.printf("The  number is not a strong number.");
			
			
			
		
		}
	}

}
