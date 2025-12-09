import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        boolean divisible = false;

        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                divisible = true;
                break;
            }
        }

        if (divisible) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
