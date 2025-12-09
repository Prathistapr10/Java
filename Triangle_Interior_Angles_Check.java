import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if (A > 0 && B > 0 && C > 0 && (A + B + C == 180)) {
            System.out.print("yes");
        } else {
            System.out.print("no");
        }
    }
}
