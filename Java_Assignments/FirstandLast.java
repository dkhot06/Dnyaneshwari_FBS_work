
public class FirstandLast {

	public static void main(String[] args) {
	
		
		int num=472, a , b,sum;
		
		
		
		a = num%10;   //last digit
		
		
		b=num;
		while(b>=10){
			
			b = b/10;
		}
		
		sum = a+b;
		
		System.out.printf("Sum of first and last digit is:%d",sum);
	}

}
