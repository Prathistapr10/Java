import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        long product = 1;

        if (N == 0) {
            product = 0; 
        } else {
            while (N > 0) {
                product *= N % 10; 
            }
        }

        System.out.println(product);

        sc.close();
    }
}
