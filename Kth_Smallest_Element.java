import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        TreeSet<Integer> set = new TreeSet<>();

        for (int i = 0; i < N; i++) {
            set.add(sc.nextInt());
        }

        if (K > set.size()) {
            System.out.print("-1");
            return;
        }

        int count = 1;
        for (int val : set) {
            if (count == K) {
                System.out.print(val);
                return;
            }
            count++;
        }
    }
}

