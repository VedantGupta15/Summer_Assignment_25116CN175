package Day_6;
import java.util.*;
public class Q24 {
    public static void main(String[] args) {
        int num,pow,i,res=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        num=sc.nextInt();
        System.out.println("Enter its power:");
        pow=sc.nextInt();
        for(i=0;i<pow;i++)
        {
            res=res*num;
        }
        System.out.println("The result is : "+res);
        sc.close();
    }
}
