package Day_6;
import java.util.*;
public class BinaryToDecimal {
    public static void main(String[] args) {
        int n,t,r,c=0,s=0;
        boolean flag= true;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        n=sc.nextInt();
        t=n;
        while(t>0)
        {
            r=t%10;
            if(r!=0 && r!=1)
            {
                flag=false;
                break;
            }
            s=s+(r*(int)Math.pow(2, c));
            t=t/10;
            c+=1;
        }
        if(flag)
        {
            System.out.println("The decimal conversion of "+n+" is : "+s);
            sc.close();
        }
        else{
            System.out.println("Entered number is not binary");
            sc.close();
        }
    }
}
