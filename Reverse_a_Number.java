import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int rev = 0;
		while (N > 0) {
			int digit = N % 10;
			rev = rev * 10 + digit;
			N = N / 10;
		}
		System.out.println(rev);
	}
}
