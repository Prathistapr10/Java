import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for (int i = 0; i < N; i++) A[i] = sc.nextInt();
        for (int i = 0; i < N; i++) B[i] = sc.nextInt();
        int i = 0, j = 0;
        boolean found = false;
        while (i < N && j < N) {
            if (A[i] == B[j]) {
                if (!found) {
                    System.out.print(A[i]);
                    found = true;
                } else {
                    System.out.print(" " + A[i]);
                }
                i++;
                j++;
            } else if (A[i] < B[j]) {
                i++;
            } else {
                j++;
            }
        }
        if (!found) System.out.print("-1");
    }
}
