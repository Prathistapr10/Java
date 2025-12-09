import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Map<Character, Integer> freq = new HashMap<>();

        // Count frequency of each character
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        int uniqueCount = 0;

        // Count characters that appear exactly once
        for (int count : freq.values()) {
            if (count == 1) {
                uniqueCount++;
            }
        }

        // If all characters are duplicated
        if (uniqueCount == 0) {
            System.out.println(-1);
        } else {
            System.out.println(uniqueCount);
        }
    }
}

