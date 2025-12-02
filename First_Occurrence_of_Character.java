import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char k = sc.next().charAt(0);
        int position = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == k) {
                position = i + 1; 
                break;
            }
        }
        System.out.println(position);
    }
}