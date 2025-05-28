public class Finalprice {

    public static void main(String[] args) {
        
        float price = 200;
        float discount;
        float finalPrice;
        char isStudent = 'N';

        if (isStudent == 'Y') {
            if (price > 500) {
                discount = price * 0.20f;
            } else {
                discount = price * 0.10f;
            }
        } else {
            if (price > 600) {
                discount = price * 0.15f;
            } else {
                discount = 0;
            }
        }

        finalPrice = price - discount;
        System.out.printf("Final price = %.2f\n", finalPrice);
    }
}
