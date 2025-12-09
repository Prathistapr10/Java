import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        
        if (N <= 100000) {
            System.out.println("INT");
        } else {
            System.out.println("LONG");
        }
    }
}
