package Day_26;
import java.util.*;
public class Q102 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age...");
        int age=sc.nextInt();
        if(age>=18)
        {
            System.out.println("Eligible for voting");
        }
        else
        {
            int x=18-age;
            System.out.println("Not eligible for voting, wait "+x+" years.");
        }
        sc.close();
    }
}
