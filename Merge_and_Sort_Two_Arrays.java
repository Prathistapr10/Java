import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr1 = new int[N];
        int[] arr2 = new int[M];

        for (int i = 0; i < N; i++) arr1[i] = sc.nextInt();
        for (int i = 0; i < M; i++) arr2[i] = sc.nextInt();

        int[] merged = new int[N + M];
        System.arraycopy(arr1, 0, merged, 0, N);
        System.arraycopy(arr2, 0, merged, N, M);

        Arrays.sort(merged);

        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i]);
            if (i != merged.length - 1) System.out.print(" ");
        }
    }
}

