package Day_2;

import java.util.*;
public class SumOfDigits {
    public static void main(String[] args) {
        int d,n,s=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number ");
        n=sc.nextInt();
        while (n>0) 
        {
            d=n%10;
            s=s+d;
            n=n/10;   
        }
        System.out.println("the sum of digits is "+s);
        sc.close();
    }
    
}
