import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder encoded = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                encoded.append((char)('A' + (c - 'A' + 3) % 26));
            } else if (c >= 'a' && c <= 'z') {
                encoded.append((char)('a' + (c - 'a' + 3) % 26));
            } else {
                encoded.append(c); // keep other characters as is
            }
        }

        System.out.println(encoded.toString());
    }
}
