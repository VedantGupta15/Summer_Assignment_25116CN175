package Day_22;
import java.util.*;
public class Q87 {
    public static void main(String[] args) {
        String s;
        int i,l;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        s=sc.nextLine();
        l=s.length();
        boolean[] flag=new boolean[l];     //inital all elements false
        for(i=0;i<l;i++)
        {
            if(flag[i])
            {
                continue;
            }
            int c=1;
            for(int j=i+1;j<l;j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    c++;
                    flag[j]=true;
                }
            }
            System.out.println(s.charAt(i)+" frequency is = "+c);
        }
        sc.close();
    }
}
