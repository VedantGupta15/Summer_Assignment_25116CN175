package Day_12;
import java.util.*;
public class Q47 {
    public static void fibonacci(int n)
    {
        int first=0,second=1,third,i;
        System.out.print(first +" "+second);
        for(i=2;i<n;i++)
        {
            third=first+second;
            System.out.print(" "+third);
            first=second;
            second=third;
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of terms : ");
        n=sc.nextInt();
        System.out.println("The fibonacci series is - ");
        fibonacci(n);
        sc.close();
    }
}
