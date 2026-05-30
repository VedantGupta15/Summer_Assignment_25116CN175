package Day_3;
import java.util.*;
public class PrimeRange {
    public static void main(String[] args) {
        int n,i,j,c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the last number of range");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            c=0;
            for(j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    c=c+1;
                }
            }
            if(c==2)
            {
                System.out.print(i+" ");
            }
        }
        sc.close(); 
    }
}