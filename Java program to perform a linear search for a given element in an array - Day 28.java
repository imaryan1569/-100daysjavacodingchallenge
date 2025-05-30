import java.util.Scanner;

public class LinearSearchExample {

   
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; 
            }
        }
        return -1; 
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(",");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i].trim());
        }
        int target = scanner.nextInt();
        int index = linearSearch(arr, target);
        System.out.println(index);

        scanner.close();
    }
}