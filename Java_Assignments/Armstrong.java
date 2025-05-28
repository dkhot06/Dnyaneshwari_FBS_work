
public class Armstrong {

	public static void main(String[] args) {
		
		
		int rem , sum=0 , m=1;
		int num;	
		int count=0;
		int tempcount;
		
	  num=164;
		
		int temp =num;
		
		while(temp>0){
			
			count++;
			temp=temp/10;
		}
		
		temp = num;
		
		while(temp>0){
			
			rem = temp%10;
			tempcount=count;
			
			m=1;
			while(tempcount>0){
				
				m = m*rem;
				tempcount--;
			}
			
			sum = sum+m;
			temp=temp/10;
		}
		
		if(sum==num){
			
			System.out.printf("the number is a Armstrong no.");
		}
		
		else {
			
			System.out.printf("The no. is not Armstrong");
		}

	}

}
