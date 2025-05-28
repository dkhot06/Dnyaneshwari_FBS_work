public class Discount {

    public static void main(String[] args) {

        int price = 500;
        float finalprice;
        float discount = 0; // Initialize discount to prevent errors

        if (price <= 500) {
            discount = price * 0.10f;
        } else if (price <= 1000) { // No need to check price > 500, it's already checked
            discount = price * 0.20f;
        } else if (price < 2000) {
            discount = price * 0.25f;
        } else {
            discount = price * 0.30f; // Example: 30% discount for prices >= 2000
        }

        finalprice = price - discount;
        System.out.printf("Final Price = %.2f", finalprice);
    }
}
