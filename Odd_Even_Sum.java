import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(), M = sc.nextInt();
         System.out.println((N + M) % 2 == 0 ? "even" : "odd");
     }
}
