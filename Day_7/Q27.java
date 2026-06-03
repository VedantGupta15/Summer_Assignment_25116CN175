package Day_7;
import java.util.*;
public class Q27 {
    public static int sum(int n)    //sum of digits recursion
    {
        if(n==0)
        {
            return 0;
        }
        else{
            int d=n%10;
            return d+sum(n/10);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num;
        System.out.println("Enter a number:");
        num=sc.nextInt();
        System.out.println("The sum of digits are: "+ sum(num));
        sc.close();
    }
}
