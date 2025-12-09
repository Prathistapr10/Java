import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int minVal = arr[0];
        int maxDiff = 0;

        for (int i = 1; i < n; i++) {
            // Calculate difference with current min
            maxDiff = Math.max(maxDiff, arr[i] - minVal);

            // Update minimum so far
            minVal = Math.min(minVal, arr[i]);
        }

        System.out.println(maxDiff);
    }
}