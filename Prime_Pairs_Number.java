import java.util.*;

public class Main {
    
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean found = false;
        
        for (int i = 2; i * i <= N; i++) {
            if (N % i == 0) {
                int a = i;
                int b = N / i;
                if (isPrime(a) && isPrime(b)) {
                    System.out.println(Math.max(a, b) + " " + Math.min(a, b));
                    found = true;
                }
            }
        }
        
        if (!found) {
            System.out.println("-1");
        }
    }
}
