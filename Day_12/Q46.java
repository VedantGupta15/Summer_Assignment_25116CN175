package Day_12;
import java.util.*;
public class Q46 {
    public static void armstrong(int n)
    {
        int t,d,c=0,sum=0;
        t=n;
        while (t>0)
        {
            c++;
            t=t/10;   
        }
        t=n;
        while(t>0)
        {
            d=t%10;
            sum=sum+ (int)Math.pow(d, c);
            t=t/10;
        }
        if(sum==n)
        {
            System.out.println(n+" is ARMSTRONG");
        }
        else{
            System.out.println(n+" is not armstrong");
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        n=sc.nextInt();
        armstrong(n);
        sc.close();
    }
    
}
