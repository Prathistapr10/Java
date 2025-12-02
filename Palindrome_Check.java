import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(str.equals(new StringBuilder(str).reverse().toString()) ? "yes" : "no");
    }
}