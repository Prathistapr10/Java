import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if (N < 2) {
            System.out.println("-1");
            return;
        }

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();

            if (num < first) {
                second = first;
                first = num;
            } else if (num < second && num != first) {
                second = num;
            }
        }

        if (second == Integer.MAX_VALUE) {
            System.out.println("-1");
        } else {
            System.out.println(second);
        }

        sc.close();
    }
}