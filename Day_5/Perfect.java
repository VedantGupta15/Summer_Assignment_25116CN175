package Day_5;
import java.util.*;
public class Perfect {
    public static void main(String[] args) {
        int n,i,s=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
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
        sc.close();
    }
}
