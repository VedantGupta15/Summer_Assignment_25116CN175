package Day_17;
import java.util.*;
public class Q65 {
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
        int[] merge=new int[n1+n2];
        for(i=0;i<n1;i++)
        {
            merge[i]=a1[i];
        }
        for(i=0;i<n2;i++)
        {
            merge[n1+i]=a2[i];
        }
        System.out.println("The merged array is-");
        for(i=0;i<n1+n2;i++)
        {
            System.out.print(merge[i]+" ");
        }
        sc.close();
    }
}
