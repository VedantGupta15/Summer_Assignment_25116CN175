package Day_5;
import java.util.*;
public class Factors {
    public static void main(String[] args) {
        int n,i,c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c+=1;
                System.out.print(i+" ");
            }
        }
        if(c==0)
        {
            System.out.println("NO FACTORS");
        }
        sc.close();
    }
    
}
