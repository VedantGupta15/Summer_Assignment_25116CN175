package Day_7;
import java.util.*;
public class Q26 {
    public static int fib(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else if(n==1)
        {
            return 1;
        }
        else
        {
            return fib(n-1)+fib(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int nth,i;
        System.out.println("Enter the nth term: ");
        nth=sc.nextInt();
        System.out.println("The fibonacci seriea is: ");
        for(i=0;i<=nth;i++)
        {
            System.out.print(fib(i)+" , ");
        }
        sc.close();
    }
    
}
