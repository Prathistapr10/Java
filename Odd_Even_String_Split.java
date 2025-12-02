import java.util.*;
public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
             if (i % 2 == 0) { 
                odd.append(S.charAt(i));
            } else { 
                even.append(S.charAt(i));
            }
        }
        System.out.println(odd.toString() + " " + even.toString());
    }
}