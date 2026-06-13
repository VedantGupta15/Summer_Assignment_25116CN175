package Day_16;
import java.util.*;
public class Q61 {
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
        int total= size;
        int sum=0;
        for(i=0;i<size;i++)
        {
            total=total+i;              //total sum of range (0,1,2,.....,n)
            sum=sum+arr[i];             //sum of elements
        }
        int missing= total-sum;         //difference will be the missing num
        System.out.println("The missing number is : "+ missing);
        sc.close();
    }
}
