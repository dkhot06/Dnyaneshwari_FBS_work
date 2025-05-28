public class Prime {

    public static void main(String[] args) {

        int a = 1, b = 10; // Define the range
        int num, i, flag;

        System.out.printf("The prime numbers between %d and %d are: ", a, b);

        for (num = a; num <= b; num++) {
            if (num <= 1) {
                continue; // Skip 0 and 1 as they are not prime
            }

            flag = 0;

            for (i = 2; i <= Math.sqrt(num); i++) { 
                if (num % i == 0) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) {
                System.out.printf("%d ", num);
            }
        }
        System.out.println(); // Print newline for clean output
    }
}
