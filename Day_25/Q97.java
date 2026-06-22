package Day_25;
import java.util.*;
public class Q97 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,m,i,j;
        System.out.println("Enter size of array 1-");
        n=sc.nextInt();
        System.out.println("Enter size of array 2-");
        m=sc.nextInt();
        int[] a1=new int[n];
        int[] a2=new int[m];
        System.out.println("Enter elements of array 1");
        for(i=0;i<n;i++)
        {
            a1[i]=sc.nextInt();
        }
        System.out.println("Enter elements of array 2");
        for(i=0;i<m;i++)
        {
            a2[i]=sc.nextInt();
        }
        int[] a3=new int[n+m];
        for(i=0;i<n;i++)
        {
            a3[i]=a1[i];
        }
        for(i=0;i<m;i++)
        {
            a3[n+i]=a2[i];
        }
        for(i=0;i<n+m;i++)
        {
            for(j=0;j<(n+m)-i-1;j++)
            {
                if(a3[j]>a3[j+1])
                {
                    int t=a3[j];
                    a3[j]=a3[j+1];
                    a3[j+1]=t;
                }
            }
        }
        System.out.println("The sorted merged array is ");
        for(i=0;i<n+m;i++)
        {
            System.out.print(a3[i]+" ");
        }
        sc.close();
    }
    
}