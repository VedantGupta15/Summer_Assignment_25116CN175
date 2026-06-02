package Day_6;
import java.util.*;
public class SetBitsInNumber {
    public static void main(String[] args) {
        int n,t,r,c=0;
        String b="";
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        n=sc.nextInt();
        t=n;
        while(t>0)
        {
            r=t%2;
            b=r+b;
            t=t/2;
        }
        int num= Integer.parseInt(b);
        while(num>0)
        {
            r=num%10;
            if(r==1)
            {
                c+=1;
            }
            num=num/10;
        }
        System.out.println("The number of set bits in number "+n+" are : "+c);
        sc.close();
    }
}
