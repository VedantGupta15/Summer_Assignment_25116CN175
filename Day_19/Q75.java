package Day_19;
import java.util.*;
public class Q75 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int row,col,i,j;
        System.out.println("Enter num of rows");
        row=sc.nextInt();
        System.out.println("Enter num of coloumns");
        col=sc.nextInt();
        int[][] m1=new int[row][col];
        int[][] res=new int[col][row];     //dimension switch for transpose
        System.out.println("Entert matrix");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                System.out.println("Element ["+i+"]["+j+"]");
                m1[i][j]=sc.nextInt();
            }
        }

         for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                res[j][i]=m1[i][j];
            }
        }

        System.out.println("the final transpose matrix is");
        for(i=0;i<col;i++)
        {
            for(j=0;j<row;j++)
            {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}


