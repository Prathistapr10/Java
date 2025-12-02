import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int L = sc.nextInt();
        int R = sc.nextInt();

        if (N > L && N < R)
            System.out.print("yes");
        else
            System.out.print("no");
    }
}
