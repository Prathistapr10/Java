import java.util.Scanner;

public class Main {
    public static int gcd(int a, int b) {
        if (a == 0 || b == 0) {
            return -1; 
        }
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int result = gcd(N, M);
        System.out.println(result);

    sc.close();
    }
}