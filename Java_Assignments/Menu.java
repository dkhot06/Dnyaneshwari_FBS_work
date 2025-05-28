public class Menu {

    public static void main(String[] args) {
        int ch = 2;
        int a = 10;
        int basicSalary = 5000;
        float ta, hra, ba;
        float totalSalary;

        if (ch == 1) {
            if (a % 2 == 0) {
                System.out.printf("a is even\n");
            } else {
                System.out.printf("a is odd\n");
            }
        } else if (ch == 2) {
            if (basicSalary <= 5000) {
                ba = basicSalary * 0.10f;
                ta = basicSalary * 0.15f;
                hra = basicSalary * 0.20f;
            } else {
                ba = basicSalary * 0.30f;
                ta = basicSalary * 0.35f;
                hra = basicSalary * 0.40f;
            }

            totalSalary = basicSalary + ba + ta + hra;
            System.out.printf("Total Salary = %.2f\n", totalSalary);
        } else {
            System.out.printf("Invalid choice\n");
        }
    }
}
