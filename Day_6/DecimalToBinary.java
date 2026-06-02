package Day_6;
import java.util.*;
public class DecimalToBinary {
    public static void main(String[] args) {
        int n,t,r;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a decimal number :");
        n=sc.nextInt();
        t=n;
        String b="";
        while(t>0)
        {
            r=t%2;
            b=r+b;
            t=t/2;
        }
        System.out.println("The binary conversion of "+n+" is : "+b);
        sc.close();
    }
}
