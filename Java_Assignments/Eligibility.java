public class Eligibility {

    public static void main(String[] args) {

        int age = 21;
        char gender = 'M';

        if ((gender == 'M' && age >= 21) || (gender == 'F' && age >= 18)) {
            System.out.println("You are eligible for marriage.");
        } else {
            System.out.println("You are not eligible for marriage.");
        }
    }
}
