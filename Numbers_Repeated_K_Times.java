import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Map<Integer, Integer> freq = new HashMap<>();

        for(int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();

        for(Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if(entry.getValue() == K) {
                result.add(entry.getKey());
            }
        }

        if(result.isEmpty()) {
            System.out.print("-1");
        } else {
            Collections.sort(result);
            for(int i = 0; i < result.size(); i++) {
                System.out.print(result.get(i));
                if(i != result.size() - 1) System.out.print(" ");
            }
        }

        sc.close();
    }
}

