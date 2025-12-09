import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // Always guaranteed length ≥ 3 based on constraints
        System.out.println("" + s.charAt(0) + s.charAt(2));
    }
}


