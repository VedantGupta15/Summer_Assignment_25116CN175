package Day_15;
import java.util.*;
public class Q60 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,size;
        System.out.println("Enter the size of an array-");
        size= sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter elements");
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int c=0;
        for(i=0;i<size;i++)
        {
            if(arr[i]!=0)
            {
                int t=arr[i];
                arr[i]=arr[c];
                arr[c]=t;
                c++;
            }
        }
        System.out.println("The final array - ");
        for(i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
