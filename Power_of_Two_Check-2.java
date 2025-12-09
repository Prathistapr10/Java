
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N > 0 && (N & (N - 1)) == 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
