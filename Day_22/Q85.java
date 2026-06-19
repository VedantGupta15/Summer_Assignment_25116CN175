package Day_22;
import java.util.*;
public class Q85 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1,s2="";
        System.out.println("Enter a string");
        s1=sc.nextLine();
        int i,l=s1.length();
        for(i=l-1;i>=0;i--)
        {
            s2+=s1.charAt(i);
        }
        if(s2.equals(s1))
        {
            System.out.println("Pallindrome string");
        }
        else{
            System.out.println("Not a pallindrome string");
        }
        sc.close();
    }
}
