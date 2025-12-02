import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();  
        char k = sc.next().charAt(0); 

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == k) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println(-1);
        } else {
            System.out.println(count);
        }
    }
}
