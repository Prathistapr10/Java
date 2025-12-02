import java.util.Scanner;
public class Main {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
         if (N % 7 == 0)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}