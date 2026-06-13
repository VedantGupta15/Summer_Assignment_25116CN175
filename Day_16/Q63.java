package Day_16;
import java.util.*;
public class Q63 {
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
        System.out.println("Enter the target sum: ");
        int sum=sc.nextInt();
        int flag=0;
        for(i=0;i<size;i++)
        {
            for(j=i+1;j<size;j++)
            {
                if(arr[i]+arr[j]==sum)
                {
                    flag=1;
                    System.out.println(arr[i]+" "+  arr[j]);
                }
            }
        }
        if(flag==0)
        {
            System.out.println("No pairs found");
        }
        sc.close();
    }
}
