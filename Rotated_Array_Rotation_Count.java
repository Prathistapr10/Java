import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int[] arr = new int[M];
        for (int i = 0; i < M; i++) {
            arr[i] = sc.nextInt();
        }
        int rotationIndex = findRotationIndex(arr);
        if (rotationIndex == 0) {
            System.out.println(-1);
        } else {
            System.out.println(rotationIndex);
        }
    }
    public static int findRotationIndex(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                return i; 
            }
        }
        return 0; 
    }
}