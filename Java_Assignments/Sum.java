
public class Sum {

	public static void main(String[] args) {


		int num , rem,sum=0;
		
		num=456;

		
		
		int temp=num;
		while(temp>0){        
			
			rem=temp%10;
			sum=sum+rem;
			temp=temp/10;
		}
		
		
		System.out.printf("Sum=%d",sum);
		System.out.printf("Num=%d",num);

	}

}
