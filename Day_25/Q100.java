package Day_25;
import java.util.*;
public class Q100 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total size");
        int n=sc.nextInt();
        String[] s=new String[n];
        System.out.println("Enter the words-");
        int i,j;
        for(i=0;i<n;i++)
        {
            s[i]=sc.next();
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-1-i;j++)
            {
                int l1=s[j].length();
                int l2=s[j+1].length();
                if(l1>l2)
                {
                    String t=s[j];
                    s[j]=s[j+1];
                    s[j+1]=t;
                }
            }
        }
        System.out.println("Words sorted on basis of length");
        for(i=0;i<n;i++)
        {
            System.out.print(s[i]+" ");
        }
        sc.close();
    }
}
