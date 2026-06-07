package Day_11;
import java.util.*;
public class Q42 {
    public static double max(double a, double b)
    {
        double res= a>b?a:b;
        return res;
    }
    public static void main(String[] args) {
        double a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1: ");
        a=sc.nextDouble();
        System.out.println("Enter number 2: ");
        b=sc.nextDouble();
        System.out.println("The maximum is :" + max(a,b));
        sc.close();
    }
}
