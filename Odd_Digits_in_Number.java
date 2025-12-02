import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     String num=sc.next();
        int size=num.length();
        int[] arr=new int[size];
        boolean found = false;

        for(int i=0;i<size;i++)
        {
            arr[i]=num.charAt(i)-'0';
        }
        for(int i=0;i<size;i++)
        {
            if(arr[i]%2!=0)
            {
                if(found)
    {
            System.out.print(" ");
                }
            System.out.print(arr[i]);
                found=true;
        }
    }
    if(!found){
        System.out.print("-1");
    }
    }
}