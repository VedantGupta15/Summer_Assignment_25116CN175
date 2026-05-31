package Day_4;
import java.util.*;
public class ArmstrongRange {
    public static void main(String[] args) {
        int n,i,t,d,c,sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a the range:");
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            c=0;
            sum=0;
            t=i;
            while (t>0)
            {
                c++;
                t=t/10;   
            }
            t=i;
            while(t>0)
            {
                d=t%10;
                sum=sum+ (int)Math.pow(d, c);
                t=t/10;
            }
            if(sum==i)
            {
                System.out.print(i+"  ");
            }
        }
        sc.close();
    }
}