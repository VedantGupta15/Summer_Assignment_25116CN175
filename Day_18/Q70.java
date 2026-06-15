package Day_18;
import java.util.*;
public class Q70 {
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

        for(i=0;i<size;i++)
        {
            int pointer=i;             //pointer is smallest element index
            for(int j=i+1;j<size;j++)
            {
                if(arr[j]<arr[pointer])
                {
                    pointer=j;
                }
            }
            int t=arr[pointer];              //swapping the smallest element at front
            arr[pointer]=arr[i];
            arr[i]=t;
        }
        System.out.println("selection sorted array-");
        for(i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
