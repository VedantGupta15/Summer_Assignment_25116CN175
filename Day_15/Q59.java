package Day_15;
import java.util.*;
public class Q59 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,size,p,j,last;
        System.out.println("Enter the size of an array-");
        size= sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter elements");
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the positions needed to be moved right ");
        p=sc.nextInt();
        for(i=0;i<p;i++)
        {
            last= arr[size-1];
            for(j=size-1;j>0;j--)
            {
                arr[j]=arr[j-1];
            }
            arr[0]=last;
        }
        System.out.println("The final array - ");
        for(i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
