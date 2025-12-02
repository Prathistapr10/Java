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
        
        int limit = N - K; 
        
        if (limit <= 0) {
            return; 
        }

        for (int i = 0; i < limit; i++) {
            System.out.print(arr[i]);
            if (i < limit - 1) System.out.print(" ");
        }
    }
}
