import java.util.*;

public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double result = num1 * num2;
        System.out.printf("%.1f\n", result);
        sc.close();
    }
}