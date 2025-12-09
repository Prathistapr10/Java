import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] mat = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int count = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

                if (mat[i][j] == 1) {

                    boolean up = (i == 0) || (mat[i - 1][j] == 0);
                    boolean down = (i == N - 1) || (mat[i + 1][j] == 0);
                    boolean left = (j == 0) || (mat[i][j - 1] == 0);
                    boolean right = (j == N - 1) || (mat[i][j + 1] == 0);

                    if (up && down && left && right) {
                        count++;
                    }
                }
            }
        }

        if (count == 0)
            System.out.println("-1");
        else
            System.out.println(count);
    }
}
