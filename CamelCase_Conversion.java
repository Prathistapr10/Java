import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();

        String[] words = s.split("\\s+");
        StringBuilder camel = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                camel.append(Character.toUpperCase(word.charAt(0)));
                if (word.length() > 1) {
                    camel.append(word.substring(1).toLowerCase());
                }
            }
        }

        System.out.print(camel.toString());
    }
}
