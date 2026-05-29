package Day_2;
import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        int rev=0,n,d;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        while(n>0)
        {
            d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        System.out.println("the reversed number is "+rev);
        sc.close();
    }
}
