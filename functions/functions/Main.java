import java.util.*;

public class Main {
    // Static method to multiply two integers
    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        // Call the static multiply method
        int prod = multiply(a, b);
        System.out.println("a * b = " + prod);

        // Call the multiply method with different arguments
        prod = multiply(10, 20);
        System.out.println("10 * 20 = " + prod);
    }
}
