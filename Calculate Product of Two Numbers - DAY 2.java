import java.util.Scanner;

public class ProductOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long product = a * b;
        System.out.println(product);
        scanner.close();
    }
}