package Day_13;
import java.util.*;
public class Q50 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,size,sum=0;
        System.out.println("Enter the size of an array-");
        size= sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter elements");
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        double avg=sum/size;
        System.out.println("The sum is : "+sum);
        System.out.println("The average is : "+avg);
        sc.close();
    }
}
    
