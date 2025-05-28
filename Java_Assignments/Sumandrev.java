
public class Sumandrev {

	public static void main(String[] args) {
		int num, sum , rev, n1 ,n2 , n3;
		
		num=345;
		
		
		n1 = num/100;
		n2 = (num /10)%10;
		n3 = num %10;
		
		
		sum = n1 + n2+ n3;
		rev = (n3*100)+(n2*10)+n1;
		
		
		System.out.printf("Sum of the digits in the number is:%d\n",sum);
		System.out.printf("Reverse number: %d\n",rev);
		
	}

}
