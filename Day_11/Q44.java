package Day_11;
import java.util.*;
public class Q44 {
    public static int fact(int n)
    {
        int i,f=1;
        for(i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        n=sc.nextInt();
        System.out.println("The factorial is: "+ fact(n));
        sc.close();
    }
}
