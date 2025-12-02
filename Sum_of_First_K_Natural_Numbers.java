import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        long sum = (long) K * (K + 1) / 2;

        System.out.println(sum);

        sc.close();
    }
}
