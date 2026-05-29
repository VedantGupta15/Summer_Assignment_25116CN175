package Day_2;
import java.util.*;
public class ProdDigits {
    public static void main(String[] args) {
        int d,n,p=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        while (n>0)
        {
            d=n%10;
            p=p*d;
            n=n/10;        
        }
        System.err.println("the product of digits is "+p);
        sc.close();
    }
}
