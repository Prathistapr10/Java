import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isComposite(n)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
    public static boolean isComposite(int n) {
        if (n <= 1) return false;  
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return true;
        }
        return false;
    }
}