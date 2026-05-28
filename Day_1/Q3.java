package Day_1;
import java.util.*;
class Q3
{
    public static void main(String[] args) {
        int n,i,f=1;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            f=f*i;
        }
        System.out.println("the factorial of "+n+ " is = "+f);
        sc.close();
    }
}
