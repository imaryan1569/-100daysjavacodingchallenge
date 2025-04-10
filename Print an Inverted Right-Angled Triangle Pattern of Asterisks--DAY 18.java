import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Read input
        
        for (int i = n; i > 0; i--) {  // Loop from n to 1
            for (int j = 0; j < i; j++) {  // Print '*' i times
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
        
        sc.close(); // Close scanner
    }
}
