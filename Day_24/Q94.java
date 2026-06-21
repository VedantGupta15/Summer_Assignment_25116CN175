package Day_24;
import java.util.*;
public class Q94 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.next();
        int c=1;
        String res= s.charAt(0)+"";
        for(int i=1;i<s.length();i++)
        {
            char curr=s.charAt(i);
            char prev=s.charAt(i-1);
            if(curr==prev)
            {
                c++;
            }
            else
            {
                if(c>1)
                {
                    res+=c;
                    c=1;
                }
                res+=curr;
            }
        }
        if(c>1)
        {
            res+=c;
        }
        System.out.println("The final output is : "+ res);
        sc.close();
    }
}
