import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int R = sc.nextInt();

        int start = (int)Math.ceil(Math.sqrt(L));
        int end = (int)Math.floor(Math.sqrt(R));

        int count = end - start + 1;

        if (count > 0) {
            System.out.println(count);
        } else {
            System.out.println("-1");
        }
    }
}

