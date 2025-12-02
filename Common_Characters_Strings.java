import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        boolean[] chars = new boolean[256]; 
        for (int i = 0; i < s1.length(); i++) {
            chars[s1.charAt(i)] = true;
        }
        boolean found = false;
        for (int i = 0; i < s2.length(); i++) {
            if (chars[s2.charAt(i)]) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
