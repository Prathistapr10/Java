import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (int w = 0; w < words.length; w++) {
            String word = words[w];

            if (word.length() <= 2) {
                // No middle part to reverse
                result.append(word);
            } else {
                char first = word.charAt(0);
                char last = word.charAt(word.length() - 1);

                String middle = word.substring(1, word.length() - 1);
                String reversedMiddle = new StringBuilder(middle).reverse().toString();

                result.append(first).append(reversedMiddle).append(last);
            }

            if (w < words.length - 1) result.append(" ");
        }

        System.out.println(result.toString());
    }
}


