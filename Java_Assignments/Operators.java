
public class Operators {

	public static void main(String[] args) {
		int a= 100 , b= 20;
	 	char sy = '/';
	 	int result;
	 	
	 	if(sy == '+'){
	 		
	 		result = a + b;
	 		System.out.printf("result =%d",result);
		 }
		 else if(sy == '-'){
		 	
		 	result = a-b;
		 	System.out.printf("result =%d",result);
		 }
		 
		 else if (sy == '*'){
		 	
		 	result = a*b;
		 	System.out.printf("result = %d", result);
		 }
		 
		 else if(sy == '/'){
		 	 result = a/b;
		 	 System.out.printf("result =%d",result);
		 	 
		 }
		 else if( sy =='%'){
		 	
		 	result = a%b;
		 	System.out.printf("result = %d",result);
		 }

	}

}
