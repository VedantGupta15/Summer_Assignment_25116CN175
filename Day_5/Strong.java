package Day_5;
import java.util.*;
public class Strong {
    public static int fact(int num)
    {
        int f=1;
        for(int i=1;i<=num;i++)
        {
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        int n,d,s=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        int t=n;
        while(t>0)
        {
            d=t%10;
            s=s+fact(d);
            t=t/10;
        }
        if (s==n)
        {
            System.out.println(n+ "is a strong number");
        }
        else 
        {
            System.out.println(n+ " is not a strong number");
        }
        sc.close();
    }
}
