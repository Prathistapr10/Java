import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        if (s1.contains(s2)) 
            System.out.print("yes");
        else 
            System.out.print("no");
    }
}

