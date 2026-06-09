package Day_13;
import java.util.*;
public class Q52 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,size,even=0,odd=0;
        System.out.println("Enter the size of an array-");
        size= sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter elements");
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]%2==0)
            {
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Even elements : "+even+" , Odd elements : "+odd);
        sc.close();
    }
}
