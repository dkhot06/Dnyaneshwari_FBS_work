public class Strong {

    public static void main(String[] args) {
        int num, temp, rem, fact, sum;
        int range = 1000; // Define the range for finding Strong numbers

        System.out.println("Strong numbers up to " + range + ":");
        for (num = 1; num <= range; num++) {
            temp = num;
            sum = 0;

            while (temp > 0) {
                rem = temp % 10;
                fact = 1;

                // Calculate factorial of the digit
                for (int i = 1; i <= rem; i++) {
                    fact *= i;
                }

                sum += fact;
                temp /= 10;
            }

            // Check if the number is a Strong number
            if (sum == num) {
                System.out.println(num);
            }
        }
    }
}
