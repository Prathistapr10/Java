import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        
        int MAX = 100000;
        boolean[] isPrime = new boolean[MAX + 1];
        
        // Initialize all as prime initially
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        
        // Sieve of Eratosthenes
        for (int i = 2; i * i <= MAX; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= MAX; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        // Count primes in range L to R
        int count = 0;
        for (int x = L; x <= R; x++) {
            if (isPrime[x]) count++;
        }
        
        System.out.println(count);
    }
}



