package Day_23;
import java.util.*;
public class Q89 {
    public static void main(String[] args) {
        String s;
        int l;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a sentence");
        s=sc.nextLine();
        l=s.length();
        for(int i=0;i<l;i++)
        {
            boolean flag=true;
            for(int j=0;j<l;j++)
            {
                if(s.charAt(i)==s.charAt(j) && i!=j)           //i!=j so that it dont compare with itself...
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
            {
                System.out.println("The first non repeating character is - "+ s.charAt(i));
                break;
            }
        }
        sc.close();
    }
}
