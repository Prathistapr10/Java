import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            if (arr[i] < N) {
                list.add(arr[i]);
            }
        }

        if (list.isEmpty()) {
            System.out.print("-1");
            return;
        }

        Collections.sort(list, Collections.reverseOrder());

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) System.out.print(" ");
        }
    }
}


