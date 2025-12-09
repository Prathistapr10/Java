import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String s = sc.next().trim();
            System.out.println(romanToInt(s));
        }
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        // Check invalid characters
        for (char c : s.toCharArray()) {
            if (!map.containsKey(c)) {
                return -1;
            }
        }

        int total = 0;
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int value = map.get(s.charAt(i));

            if (value < prev) {
                // Check valid subtractive combinations
                if (!isValidSubtract(s.charAt(i), s.charAt(i + 1))) {
                    return -1;
                }
                total -= value;
            } else {
                total += value;
            }

            prev = value;
        }

        return total;
    }

    public static boolean isValidSubtract(char small, char large) {
        return (small == 'I' && (large == 'V' || large == 'X')) ||
               (small == 'X' && (large == 'L' || large == 'C')) ||
               (small == 'C' && (large == 'D' || large == 'M'));
    }
}



