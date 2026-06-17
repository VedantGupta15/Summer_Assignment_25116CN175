package Day_20;
import java.util.*;
public class Q79 {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int r1,c1,i,j;
    System.out.print("Enter num of rows for matrix - ");
    r1=sc.nextInt();
    System.out.print("Enter num of coloumns for matrix - ");
    c1=sc.nextInt();
    int[][] m1=new int[r1][c1];
    System.out.println("Enter a matrix ");
    for(i=0;i<r1;i++)
    {
        for(j=0;j<c1;j++)
        {
            System.out.print("Element ["+i+"]["+j+"] : ");
            m1[i][j]=sc.nextInt();
        }
    }

    for(i=0;i<r1;i++)
    {
        int sum=0;
        for(j=0;j<c1;j++)
        {
            sum+=m1[i][j];
        }
        System.out.println("The sum of row "+(i+1)+" is = "+ sum);
    }
    sc.close();
}
    
}
