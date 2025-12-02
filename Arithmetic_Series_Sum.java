import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong(); 
        long B = sc.nextLong(); 
        long C = sc.nextLong(); 

        long sum = (C * (2 * A + (C - 1) * B)) / 2;

        System.out.println(sum);

        sc.close();
    }
}
