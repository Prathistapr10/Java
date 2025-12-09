import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.next();
        }

        Arrays.sort(arr, new Comparator<String>() {
            public int compare(String a, String b) {
                if (a.length() != b.length())
                    return a.length() - b.length(); 
                return a.compareTo(b);              
            }
        });

        for (int i = 0; i < N; i++) {
            System.out.print(arr[i]);
            if (i < N - 1) System.out.print(" ");
        }
    }
}
