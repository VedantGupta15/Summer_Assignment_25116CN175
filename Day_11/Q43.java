package Day_11;
import java.util.*;
public class Q43 {
    public static void prime(int n)
    {
        int i,c=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c=c+1;
            }
        }
        if(c==2)
        {
            System.out.println(n+" is a prime num");
        }
        else{
            System.out.println(n+" is not a prime num");
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        n=sc.nextInt();
        prime(n);
        sc.close();
    }
}
