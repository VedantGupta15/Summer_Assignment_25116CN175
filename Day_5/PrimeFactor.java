package Day_5;
import java.util.*;
public class PrimeFactor {
    public static boolean prime(int num)
    {
        int j,c=0;
        for(j=1;j<=num;j++)
        {
            if(num%j==0)
            {
                c=c+1;
            }
        }
        if(c==2)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        for(i=n;i>0;i--)
            {
                if(n%i==0)
                {
                    if(prime(i))
                    {
                        System.out.println("The largest prime factor of "+n+" is :"+i);
                        break;
                    }
                }
            } 
        sc.close();
    }
}
