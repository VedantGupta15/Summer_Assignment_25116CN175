package Day_4;
import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        int n,d,c=0,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        n=sc.nextInt();
        int t=n;
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
        sc.close();
    }
}
