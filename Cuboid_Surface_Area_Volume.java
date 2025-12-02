import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int B = sc.nextInt();
        int H = sc.nextInt();
        int surfaceArea = 2 * (L*B + B*H + H*L);
        int volume = L * B * H;
        System.out.println(surfaceArea + " " + volume);
        sc.close();
    }
}