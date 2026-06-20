package Day_23;
import java.util.*;
public class Q91 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter word 1- ");
        String s1=sc.next();
        System.out.println("Enter word 2- ");
        String s2=sc.next();
        int i,j,l1=s1.length(),l2=s2.length();
        if(l1!=l2)
        {
            System.out.println("The strings are  not anagrams ");
            sc.close();
            return;
        }
        char[] a1=s1.toCharArray();
        char[] a2=s2.toCharArray();
        //sorting char a1 and a2 in ascending order
        for(i=0;i<l1;i++)
        {
            for(j=0;j<l1-i-1;j++)
            {
                if(a1[j]>a1[j+1])
                {
                    char t=a1[j];
                    a1[j]=a1[j+1];
                    a1[j+1]=t;
                }
            }
        }

        for(i=0;i<l2;i++)
        {
            for(j=0;j<l2-i-1;j++)
            {
                if(a2[j]>a2[j+1])
                {
                    char t=a2[j];
                    a2[j]=a2[j+1];
                    a2[j+1]=t;
                }
            }
        }
        boolean flag=true;
        for(i=0;i<l1;i++)
        {
            if(a1[i]!=a2[i])
            {
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("The strings are anagrams ");
        }
        else{
            System.out.println("The strings are not anagram ");
        }
        sc.close();
    }
}
