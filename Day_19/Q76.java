package Day_19;
import java.util.*;
public class Q76 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int row,col,i,j;
        System.out.println("Enter num of rows");
        row=sc.nextInt();
        System.out.println("Enter num of coloumns");
        col=sc.nextInt();
        int[][] m1=new int[row][col];
        int sum=0;
        if(row==col)
        {
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
                    if(i==j)
                    {
                        sum=sum+m1[i][j];
                    }
                }
            }

            System.out.println("the final resultant diagnol sum is : "+sum);
        }
        else{
            System.out.println("No diagonal sum since rows and columns are not equal");
        }

        sc.close();
    }
}
