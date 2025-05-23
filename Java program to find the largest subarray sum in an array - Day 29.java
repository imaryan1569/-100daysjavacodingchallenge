import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int findLargestSubarraySum(int[] arr) {
        int maxSoFar = arr[0];
        int currentMax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }
        return maxSoFar;
    }
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String inputLine = sr.nextLine();
        String[] parts = inputLine.split(",");
        int[] arr = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i].trim());
        }
        int result = findLargestSubarraySum(arr);
        System.out.println(result);
    }
}