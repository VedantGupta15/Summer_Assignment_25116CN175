package Day_23;
import java.util.*;
public class Q90 {
    public static void main(String[] args) {
        String s;
        int l;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a sentence");
        s=sc.nextLine();
        l=s.length();
        for(int i=0;i<l;i++)
        {
            boolean flag=false;
            for(int j=i+1;j<l;j++)
            {
                if(s.charAt(i)==s.charAt(j))           
                {
                    flag=true;
                    break;
                }
            }
            if(flag)
            {
                System.out.println("The first repeating character is - "+ s.charAt(i));
                break;
            }
        }
        sc.close();
    }
}
