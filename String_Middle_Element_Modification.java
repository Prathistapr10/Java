import java.util.Scanner;
public class Main{
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length(), mid = n / 2;

     if (n % 2 == 1)
         System.out.println(s.substring(0, mid) + "*" + s.substring(mid + 1));
    else
         System.out.println(s.substring(0, mid - 1) + "**" + s.substring(mid + 1));
     }
}