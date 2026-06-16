package Day_19;
import java.util.*;
public class Q74 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int row,col,i,j;
        System.out.println("Enter num of rows");
        row=sc.nextInt();
        System.out.println("Enter num of coloumns");
        col=sc.nextInt();
        int[][] m1=new int[row][col];
        int[][] m2=new int[row][col];
        int[][] res=new int[row][col];
        System.out.println("Enter first matrix");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                System.out.println("Element ["+i+"]["+j+"]");
                m1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter second matrix");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                System.out.println("Element ["+i+"]["+j+"]");
                m2[i][j]=sc.nextInt();
            }
        }

         for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                res[i][j]=m1[i][j]-m2[i][j];
            }
        }

        System.out.println("the final resultant matrix");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}

