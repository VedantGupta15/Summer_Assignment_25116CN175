package Day_11;
import java.util.*;
public class Q41 {
    public static int sum(int a,int b)
    {
        return a+b;
    }
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1: ");
        a=sc.nextInt();
        System.out.println("Enter number 2: ");
        b=sc.nextInt();
        System.out.println("The sum is :" + sum(a,b));
        sc.close();
    }
}
