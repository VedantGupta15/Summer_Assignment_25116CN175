package Day_18;
import java.util.*;
public class Q71 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,size;
        System.out.println("Enter the size of an array-");
        size= sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter sorted elements");
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter element to be searched-");
        int n= sc.nextInt();
        int beg=0,end=size-1,flag=0;
        int mid=-1;
        while (beg<=end) {
            mid=(beg+end)/2;
            if(n>arr[mid])
            {
                beg=mid+1;
            }
            else if(n<arr[mid])
            {
                end=mid-1;
            }
            else
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("Element found at index : "+mid);
        }
        else{
            System.out.println("The entered element is not present");
        }
        sc.close();
    }
}
