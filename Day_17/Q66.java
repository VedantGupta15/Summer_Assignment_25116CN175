package Day_17;
import java.util.*;
public class Q66 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,n1,n2;
        System.out.println("Enter the size of an array 1-");
        n1= sc.nextInt();
        int[] a1=new int[n1];
        System.out.println("Enter elements");
        for(i=0;i<n1;i++)
        {
            a1[i]=sc.nextInt();
        }
        System.out.println("Enter the size of an array 2-");
        n2= sc.nextInt();
        int[] a2=new int[n2];
        System.out.println("Enter elements");
        for(i=0;i<n2;i++)
        {
            a2[i]=sc.nextInt();
        }
        int[] union= new int[n1+n2];
        int c=0;
        for(i=0;i<n1;i++)
        {
            boolean flag = true;
            for(int j=i+1;j<n1;j++)
            {
                if(a1[i]==a1[j])                        //checking all distinct elements of a1
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
            {
             union[c]=a1[i];                            //copying all distinct of a1 into union array
             c++;
            }
        }

        for(i=0;i<n2;i++)
        {
            boolean flag = true;
            for(int j=0;j<c;j++)
            {
                if(a2[i]==union[j])                        //checking the distinct elements in a2 which are already not in union array(a1 array)
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
            {
             union[c]=a2[i];                            //copying all distinct elements of a2 from a1 into union array
             c++;
            }
        }
        System.out.println("The union of array is");
        for(i=0;i<c;i++)
        {
            System.out.print(union[i]+" ");
        }
        sc.close();
    }
}
