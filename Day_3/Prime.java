package Day_3;
import java.util.*;
public class Prime {
    public static void main(String[] args) {
        int n,i,c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        n=sc.nextInt();
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
            System.err.println(n+" is not a prime num");
        }
        sc.close();
    }
}
