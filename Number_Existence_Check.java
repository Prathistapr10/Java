import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if (num == K) {
                found = true;
            }
        }

        if (found) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        sc.close();
    }
}