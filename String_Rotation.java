import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int K = sc.nextInt();
        int n = s.length();

        K = K % n; // Avoid extra rotations

        String rotated = s.substring(K) + s.substring(0, K);

        System.out.print(rotated);
    }
}
