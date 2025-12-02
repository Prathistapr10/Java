import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int nextMultiple = ((N / 10) + 1) * 10;

        System.out.println(nextMultiple);

        sc.close();
    }
}