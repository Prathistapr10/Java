import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int balance = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                balance++;
            } else {       // c == ')'
                balance--;
                if (balance < 0) {
                    System.out.println("no");
                    return;
                }
            }
        }

        if (balance == 0)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}









