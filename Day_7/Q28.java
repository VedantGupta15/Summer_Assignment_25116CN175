package Day_7;
import java.util.*;
public class Q28 {
    public static int reverse(int n, int rev)    // recursive reverse number
    {
        if(n==0)
        {
            return rev;
        }
       int d=n%10;
       rev=rev*10+d;
       return reverse(n/10, rev);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num;
        System.out.println("Enter a number:");
        num=sc.nextInt();
        System.out.println("The reverse number is : "+ reverse(num,0));
        sc.close();
    }
    
}
