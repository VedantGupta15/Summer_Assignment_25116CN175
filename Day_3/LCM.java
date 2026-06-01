package Day_3;
import java.util.*;
public class LCM
{
    public static void main(String[] args) {
        int n1,n2,lcm;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number 1:");
        n1=sc.nextInt();
        System.out.println("enter a number 2:");
        n2=sc.nextInt();
        lcm= (n1>n2)?n1:n2;
        while(true)
        {
            if(lcm%n1==0 && lcm%n2==0)
            {
                System.out.println("LCM OF "+n1+" and "+n2+" is :"+lcm);
                break;
            }
            else{
                lcm=lcm+1;
            }
        }
        sc.close();
    }
}