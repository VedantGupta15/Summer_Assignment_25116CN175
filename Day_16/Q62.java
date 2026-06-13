package Day_16;
import java.util.*;
public class Q62 {
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
        int max=arr[0],counter=0;
        for(i=0;i<size;i++)
        {
            int c=1;
            for(j=i+1;j<size;j++)
            {
                if(arr[i]==arr[j])
                {
                    {
                        c=c+1;
                    }
                }
            }
            if(c>counter)
            {
                max=arr[i];
                counter=c;
            }
        }
        System.out.println("The maximum frequency element is : "+max);
        sc.close();
    }
}
