import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        long K = sc.nextLong();

        if (K <= 1) {
            System.out.print((N == 1) ? "yes" : "no");
            return;
        }

        boolean ok = true;

        while (N > 1) {
            if (N % K != 0) {
                ok = false;
                break;
            }
            N /= K;
        }

        System.out.print(ok ? "yes" : "no");
    }
}
