public class AreaandPerimeter {

    public static void main(String[] args) {
        int ch = 1;
        double l, w, r;
        double PI = 3.14;

        if (ch == 1) {
            l = 23;
            w = 16;
            System.out.printf("Area: %.2f, Perimeter: %.2f\n", l * w, 2 * (l + w));
        } else if (ch == 2) {
            r = 13;
            System.out.printf("Area: %.2f, Circumference: %.2f\n", PI * r * r, 2 * PI * r);
        } else {
            System.out.printf("Invalid Choice.\n");
        }
    }
}
