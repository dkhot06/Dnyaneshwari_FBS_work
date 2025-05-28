
public class Factorial {

	public static void main(String[] args) {
		
		
		int num , fact=1 , i;
		
		num=4;
		
		
		i=num;
		
		while(i>0){
			
			fact=fact*i;
			
			i--;
		}
		
		
		
		System.out.printf("Factorial of the %d is:%d",num,fact);
	}

}
