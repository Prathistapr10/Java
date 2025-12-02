import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float L=sc.nextFloat();
        float B=sc.nextFloat();
        float area=L*B;
        System.out.printf("%.5f",area);
    }
}