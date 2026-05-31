package Day_4;
import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        int first=0,second=1,third,i,n;
        Scanner sc=new Scanner(System.in);
        System.err.println("enter the number of terms:");
        n=sc.nextInt();
        System.out.println("the fibonacci series is-");
        System.out.print(first +" "+second);
        for(i=2;i<n;i++)
        {
            third=first+second;
            System.out.print(" "+third);
            first=second;
            second=third;
        }
        sc.close();
    }
}
