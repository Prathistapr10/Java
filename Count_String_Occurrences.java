import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();
        String S = sc.nextLine();

        int count = 0;
        int n = sentence.length();
        int m = S.length();

        for (int i = 0; i <= n - m; i++) {
            int j = 0;
            while (j < m && sentence.charAt(i + j) == S.charAt(j)) {
                j++;
            }
            if (j == m) {     
                count++;
            }
        }

        System.out.println(count == 0 ? -1 : count);
    }
}
