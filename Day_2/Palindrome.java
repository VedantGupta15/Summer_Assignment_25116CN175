package Day_2;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        int d,n,t,rev=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        t=n;
        while (t>0)
        {
            d=t%10;
            rev=rev*10+d;
            t=t/10;        
        }
        if(rev==n)
        {
            System.out.println(n+" is a palindrome number");
        }
        else
        {
            System.out.println(n+" is not a palindrome number");
        }
        sc.close();
    }
}
