package Day_14;
import java.util.*;
public class Q56 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j,size;
        System.out.println("Enter the size of an array-");
        size= sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter elements");
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The duplicate elements are : ");
        for(i=0;i<size;i++)
        {
            int c=1;
            for(j=i+1;j<size;j++)
            {
                if(arr[j]==arr[i])
                {
                    c=c+1;
                }
            }
            if(c>1)
            {
                System.out.print(arr[i]+" ");
            }
        }
        sc.close();
    }
}
