import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        String s = String.valueOf(N);
        char target = (char)(K + '0');

        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == target) count++;
        }

        if (count == 0)
            System.out.println("-1");
        else
            System.out.println(count);
    }
}

