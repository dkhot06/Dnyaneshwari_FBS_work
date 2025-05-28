
public class Palindrome {

	public static void main(String[] args) {
		
		int rem;
		int num=6342;
		int temp=num;
		int sum =0;
		while(temp>0){
			
			rem = temp%10;
		    System.out.printf("%d",rem);
			temp = temp/10;
		}
		


	}

}
