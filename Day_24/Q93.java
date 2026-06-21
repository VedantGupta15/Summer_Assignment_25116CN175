package Day_24;
import java.util.*;
public class Q93 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string ");
        String s1=sc.next();
        System.out.println("Enter a string to check rotation ");
        String s2=sc.next();
        if(s1.length()!=s2.length())
        {
            System.out.println("No string rotation");
            sc.close();
            return;
        }
        String concat=s1+s1;
        if(concat.contains(s2))
        {
            System.out.println("String Rotation");
        }
        else{
            System.out.println("Not a string rotation");
        }
        sc.close();
    }
}
