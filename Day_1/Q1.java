package Day_1;
import java.util.*;
class Q1
{
    public static void main(String[] args) 
    {
        int i,n,s=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n for sum of n terms");
        n=sc.nextInt();
       for(i=1;i<=n;i++)
       {
        s=s+i;
       }
       System.out.println("the sum is 5"+s);
       sc.close();
    }
}