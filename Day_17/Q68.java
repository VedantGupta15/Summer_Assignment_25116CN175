// intersection and common elements are same -> Q67 and Q68 are same

package Day_17;
import java.util.*;
public class Q68 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,n1,n2;
        System.out.println("Enter the size of an array 1-");
        n1= sc.nextInt();
        int[] a1=new int[n1];
        System.out.println("Enter elements");
        for(i=0;i<n1;i++)
        {
            a1[i]=sc.nextInt();
        }
        System.out.println("Enter the size of an array 2-");
        n2= sc.nextInt();
        int[] a2=new int[n2];
        System.out.println("Enter elements");
        for(i=0;i<n2;i++)
        {
            a2[i]=sc.nextInt();
        }
        int[] inter=new int[n1+n2];
        int c=0;
        for(i=0;i<n1;i++)
        {
            for(int j=0;j<n2;j++)
            {
                if(a1[i]==a2[j])
                {
                    boolean flag= true;
                    for(int k=0;k<c;k++)
                    {
                        if(inter[k]==a1[i])             //for avoiding duplicate elements
                        {
                            flag=false;
                            break;
                        }
                    }
                    if(flag)
                    {
                    inter[c]=a1[i];
                    c++;
                    }
                    break;
                }
            }
        }
        System.out.println("The common elements of arrays is ");
        for(i=0;i<c;i++)
        {
            System.out.print(inter[i]+" ");
        }
        sc.close();
    }
}

