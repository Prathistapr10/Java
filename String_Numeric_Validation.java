import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        boolean numeric = true;

        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                numeric = false;
                break;
            }
        }

        System.out.print(numeric ? "yes" : "no");
    }
}
