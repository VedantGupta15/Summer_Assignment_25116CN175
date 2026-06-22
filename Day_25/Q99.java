package Day_25;
import java.util.*;
public class Q99 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total numbers of names");
        int n=sc.nextInt();
        String[] s=new String[n];
        System.out.println("Enter the names-");
        int i,j;
        for(i=0;i<n;i++)
        {
            s[i]=sc.next();
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-1-i;j++)
            {
                if(s[j].compareTo(s[j+1])>0)     //if s1>s2 then +ve ; if s1=s2 then 0 ; if s1<s2 then -ve 
                {
                    String t=s[j];
                    s[j]=s[j+1];
                    s[j+1]=t;
                }
            }
        }
        System.out.println("the sorted names are");
        for(i=0;i<n;i++)
        {
            System.out.print(s[i]+"\t");
        }
        sc.close();
    }
}
