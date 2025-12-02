import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            int needed = X - num;  
            if (set.contains(needed)) {
                System.out.println("yes");
                return;
            }
            set.add(num);
        }
        System.out.println("no");
    }
}

