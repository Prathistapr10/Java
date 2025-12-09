import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int P = sc.nextInt();
        int A = sc.nextInt();

        // If P is odd, S = P/2 won't be integer
        if (P % 2 != 0) {
            System.out.print("no");
            return;
        }

        int S = P / 2;

        long D = 1L * S * S - 4L * A;   // Discriminant

        if (D < 0) {
            System.out.print("no");
            return;
        }

        long sqrtD = (long) Math.sqrt(D);

        if (sqrtD * sqrtD != D) {  // not a perfect square
            System.out.print("no");
            return;
        }

        // L and W
        long L = (S + sqrtD) / 2;
        long W = (S - sqrtD) / 2;

        if (L > 0 && W > 0 && (S + sqrtD) % 2 == 0 && (S - sqrtD) % 2 == 0)
            System.out.print("yes");
        else
            System.out.print("no");
    }
}
