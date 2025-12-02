import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int count = 0;
        for (char c : s.toCharArray()) {  
            count++;  
        }

        System.out.println(count);
    }
}