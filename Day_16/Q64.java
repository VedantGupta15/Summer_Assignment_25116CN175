package Day_16;
import java.util.*;
public class Q64 {
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
        int index=1;
        for(i=1;i<size;i++)
        {
            if(arr[i]!=arr[i-1])
            {
                arr[index]=arr[i];      //getting all unique elements at the front and duplicates at the back of array
                index++;
            }
        }
        System.out.println("Final array after removing duplicates - ");
        for(i=0;i<index;i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
