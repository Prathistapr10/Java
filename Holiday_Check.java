import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine().toLowerCase();  
        if(day.equals("saturday") || day.equals("sunday")) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}


