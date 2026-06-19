package Day_22;
import java.util.*;
public class Q86 {
    public static void main(String[] args) {
        String s;
        int i,c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        s=sc.nextLine();
        int l=s.length();
        for(i=0;i<l;i++)
        {
            if(s.charAt(i)==' ')
            {
                c++;
            }
        }
        System.out.println("The total count of words are = "+(c+1));
        sc.close();
    }
}
