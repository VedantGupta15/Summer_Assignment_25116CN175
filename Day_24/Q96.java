package Day_24;
import java.util.*;
public class Q96 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string ");
        String s=sc.nextLine();
        char[] ch=s.toCharArray();
        int i,j,l=ch.length;
        boolean[] flag=new boolean[l];          //initial all false
        String result="";
        for(i=0;i<l;i++)
        {
            for(j=i+1;j<l;j++)
            {
                if(ch[i]==ch[j])
                {
                    flag[j]=true;
                    continue;
                }
            }
            if(!flag[i])
            {
                result+=ch[i];
            }
        }
        System.out.println("String after removal of duplicate characters : "+result);
        sc.close();
    }
}
