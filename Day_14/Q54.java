package Day_14;
import java.util.*;
public class Q54 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,size,x,c=0;
        System.out.println("Enter the size of an array-");
        size= sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter elements");
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter number to be searched for frequency: ");
        x=sc.nextInt();
        for(i=0;i<size;i++)
        {
            if(arr[i]==x)
            {
                c=c+1;
            }
        }
        System.out.println("Frequency of entered element is : "+c);
        sc.close();
    }
}
