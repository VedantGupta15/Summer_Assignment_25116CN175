package Day_15;
import java.util.*;
public class Q57 {
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
        int[] rev=new int[size];
        for(i=0;i<size;i++)
        {
            rev[i]=arr[size-1-i];
        }
        System.out.println("The reversed array is ");
        for(i=0;i<size;i++)
        {
           System.out.print(rev[i]+" ");
        }
        sc.close();
    }
}
