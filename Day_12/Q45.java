package Day_12;
import java.util.*;
public class Q45 {
    public static void pallin(int n)
    {
        int t,d,rev=0;
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
    } 
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        n=sc.nextInt();
        pallin(n);
        sc.close();
    }
}
