import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int factor = 1;
       while (N % 2 == 0) {
            factor *= 2;
            N /= 2;
        }
        System.out.println(factor);
    }
}
