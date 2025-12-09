import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String target = "kabali";
        char[] targetArr = target.toCharArray();
        Arrays.sort(targetArr);

        int count = 0;

        for (int i = 0; i < N; i++) {
            String s = sc.next();
            if (s.length() != target.length()) continue; // length mismatch → not an anagram

            char[] arr = s.toCharArray();
            Arrays.sort(arr);

            if (Arrays.equals(arr, targetArr)) {
                count++;
            }
        }

        System.out.println(count);
    }
}






