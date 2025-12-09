import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c != ' ') {
                sb.append(c);
            }
        }

        System.out.print(sb.toString());
    }
}

