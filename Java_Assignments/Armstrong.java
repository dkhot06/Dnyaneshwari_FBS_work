
public class Armstrong {

	public static void main(String[] args) {
		
		int i ,range=10;
		
		
		
		int temp,count,rem,m,sum;
		int tempcount;
		
		for (i=1;i<=range;i++)
		{
			temp=i;
			
			count=0;
	    	while(temp>0){
			
			count++;
			temp=temp/10;
		}
		
		temp = i;
		sum=0;
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
		
		
		if(sum==i){
			
			System.out.printf("\n%d",i);

			
		}

	    }
	}

}
