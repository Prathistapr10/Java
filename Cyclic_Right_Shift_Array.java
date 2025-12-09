import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        
        K = K % N; // to avoid extra rotations
        
        // If no shift needed
        if (K == 0) {
            printArray(arr);
            return;
        }
        
        int[] result = new int[N];
        
        // Perform right cyclic shift
        for (int i = 0; i < N; i++) {
            result[(i + K) % N] = arr[i];
        }
        
        printArray(result);
    }
    
    private static void printArray(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int x : arr) sb.append(x).append(" ");
        System.out.println(sb.toString().trim());
    }
}




