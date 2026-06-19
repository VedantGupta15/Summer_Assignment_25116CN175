package Day_22;
import java.util.*;
public class Q88 {
    public static void main(String[] args) {
        String s;
        int i,l;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        s=sc.nextLine();
        l=s.length();
        String s2="";
        for(i=0;i<l;i++)
        {
            if(s.charAt(i)==' ')
            {
                continue;
            }
            else{
                s2+=s.charAt(i);
            }
        }
        System.out.println("The final string is -");
        System.out.println(s2);
        sc.close();
    }
}
