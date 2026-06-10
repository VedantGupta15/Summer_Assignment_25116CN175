package Day_14;
import java.util.*;
public class Q55 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j,size,t;
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
            for(j=i+1;j<size;j++)
            {
                if(arr[i]>arr[j])
                {
                    t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
        int x=arr[size-1],c=0;
        for(i=size-1;i>=0;i--)
        {
            if(arr[i]==x)
            {
                c=c+1;
            }
        }
        int n= size-1-c;
        if(n<0)
        {
            System.out.println("All elements are equal");
        }
        else{
            System.out.println("The second largest element is : "+arr[n]);
        }
        sc.close();
    }
}
