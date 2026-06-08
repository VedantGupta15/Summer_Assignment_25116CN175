package Day_12;
import java.util.*;
public class Q48 {
    public static void perfect(int n)
    {
        int i,s=0;
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            {
                s=s+i;
            }
        }
        if(s==n)
        {
            System.out.println(n+" is a perfect number");
        }
        else{
            System.out.println(n+ " is not a perfect number");
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        n=sc.nextInt();
        perfect(n);
        sc.close();
    }
}
