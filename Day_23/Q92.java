package Day_23;
import java.util.*;
public class Q92 {
    public static void main(String[] args) {
        String s;
        int i,l;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        s=sc.nextLine();
        l=s.length();
        boolean[] flag=new boolean[l];     //inital all elements false
        int counter=0;
        char max=' ';
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
            if(c>counter)
            {
                max=s.charAt(i);
                counter=c;
            }
        }
        System.out.println("The maximum occuring character is : "+max);
        sc.close();
    }
}
