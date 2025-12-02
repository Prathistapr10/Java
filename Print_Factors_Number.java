import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // Print factors of N
        boolean first = true;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                if (!first) System.out.print(" ");
                System.out.print(i);
                first = false;
            }
        }
    }
}


