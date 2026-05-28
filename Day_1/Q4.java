package Day_1;
import java.util.*;
class Q4
{
    public static void main(String[] args) {
        int n,t,c=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        n=sc.nextInt();
        t=n;
        while(n>0)
        {
            n=n/10;
            c=c+1;
        }
        System.out.println("the total count digits in "+t+" are "+c);
        sc.close();
    }    
}
