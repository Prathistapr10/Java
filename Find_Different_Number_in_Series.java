import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        int evenCount = 0;
        int oddCount = 0;
        int lastEven = -1;
        int lastOdd = -1;

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) {
                evenCount++;
                lastEven = arr[i];
            } else {
                oddCount++;
                lastOdd = arr[i];
            }
        }

        if (evenCount == 1 && oddCount > 1) {
            System.out.println(lastEven);
        } else if (oddCount == 1 && evenCount > 1) {
            System.out.println(lastOdd);
        } else {
            System.out.println(-1);
        }
    }
}

