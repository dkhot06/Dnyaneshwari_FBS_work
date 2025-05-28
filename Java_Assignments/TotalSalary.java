public class TotalSalary {

    public static void main(String[] args) {

        int salary = 6000;
        int da, ta, hra, total_salary;

        if (salary <= 5000) {
            da = (salary * 10 / 100);
            ta = (salary * 20 / 100);
            hra = (salary * 25 / 100);
        } else {
            da = (salary * 15 / 100);
            ta = (salary * 25 / 100);
            hra = (salary * 30 / 100);
        }

        total_salary = salary + da + ta + hra;
        System.out.printf("Basic Salary: %d\nDA: %d\nTA: %d\nHRA: %d\nTotal Salary: %d\n", 
                          salary, da, ta, hra, total_salary);
    }
}
