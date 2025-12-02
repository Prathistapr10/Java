import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int maxLen = 1;
        int currentLen = 1;
        for (int i = 1; i < N; i++) {
            if (arr[i] == arr[i - 1]) {
                currentLen++;
            } else {
                maxLen = Math.max(maxLen, currentLen);
                currentLen = 1;
            }
        }
        maxLen = Math.max(maxLen, currentLen);
        if (maxLen == 1) {
            System.out.println(-1);  
        } else {
            System.out.println(maxLen);
        }
    }
}