package Day_14;
import java.util.*;
public class Q53 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,size,x;
        boolean flag=true;
        System.out.println("Enter the size of an array-");
        size= sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter elements");
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter number to be searched: ");
        x=sc.nextInt();
        for(i=0;i<size;i++)
        {
            if(arr[i]==x)
            {
                System.out.println("Element found at index : "+i);
                flag=false;
                break;
            }
        }
        if(flag)
        {
            System.out.println("Not found");
        }
        sc.close();
    }
    
}
