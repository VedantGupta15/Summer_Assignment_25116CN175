package Day_25;
import java.util.*;
public class Q98 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter sentence 1");
        String s1=sc.nextLine();
        System.out.println("Enter sentence 2");
        String s2=sc.nextLine();

        for(int i=0;i<s1.length();i++)
        {
            boolean flag=false;
            char ch=s1.charAt(i);
            for(int k=0;k<i;k++)
            {
                if(ch==s1.charAt(k))
                {
                    flag=true;
                    break;
                }
            }
            if(flag)
            {
                continue;
            }
            for(int j=0;j<s2.length();j++)
            {
                if(ch==s2.charAt(j))
                {
                    System.out.println("'"+ch+"'");
                    break;
                }
            }
        }
        sc.close();
    }
}
