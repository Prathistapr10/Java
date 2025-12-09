import java.util.*;

public class Main {

    static int N;
    static int[][] points;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        points = new int[N][2];
        visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            points[i][0] = sc.nextInt(); // x
            points[i][1] = sc.nextInt(); // y
        }

        int components = 0;

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                dfs(i);
                components++;
            }
        }

        System.out.println(components - 1);
    }

    static void dfs(int i) {
        visited[i] = true;

        for (int j = 0; j < N; j++) {
            // not visited and share x or y coordinate
            if (!visited[j] && (points[i][0] == points[j][0] || points[i][1] == points[j][1])) {
                dfs(j);
            }
        }
    }
}

