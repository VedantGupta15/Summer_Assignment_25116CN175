package Day_15;
import java.util.*;
public class Q58 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,size,p,j,first;
        System.out.println("Enter the size of an array-");
        size= sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter elements");
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the positions needed to be moved left ");
        p=sc.nextInt();
        for(i=0;i<p;i++)
        {
            first= arr[0];
            for(j=0;j<size-1;j++)
            {
                arr[j]=arr[j+1];
            }
            arr[size-1]=first;
        }
        System.out.println("The final array - ");
        for(i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
