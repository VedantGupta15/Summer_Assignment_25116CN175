package Day_4;
import java.util.*;
public class NthFibonacci {
     public static void main(String[] args) {
        int first=0,second=1,third,i,n;
        Scanner sc=new Scanner(System.in);
        System.err.println("enter the nth term:");
        n=sc.nextInt();
        //System.out.println("the fibonacci series is-");
        //System.out.print(first +" "+second);
        for(i=3;i<=n;i++)
        {
            third=first+second;
            if(i==n)
            {
                System.out.println("the nth term of fibonacci series is : "+ third);
            }
            first=second;
            second=third;
        }
        sc.close();
    }
}
