package Day_20;
import java.util.*;
public class Q78 {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int r1,c1,i,j;
        System.out.print("Enter num of rows for matrix - ");
        r1=sc.nextInt();
        System.out.print("Enter num of coloumns for matrix - ");
        c1=sc.nextInt();
        int[][] m1=new int[r1][c1];
        if(r1==c1)
        {
            System.out.println("Enter a matrix ");
            for(i=0;i<r1;i++)
                {
                    for(j=0;j<c1;j++)
                    {
                        System.out.print("Element ["+i+"]["+j+"] : ");
                        m1[i][j]=sc.nextInt();
                    }
                }
            boolean flag= true;
            for(i=0;i<r1;i++)
            {
                for(j=0;j<c1;j++)
                {
                    if(m1[i][j]!=m1[j][i])
                    {
                        flag=false;
                         break;
                    }
                }
                if(!flag)
                {
                    break;
                }
            }
            if(flag)
            {
                System.out.println("The matrix is symmetric");
            }
            else{
                System.out.println("The matrix is not symmetric");
            }
        }

        else{
            System.out.println("Not a square matrix");
        }
        sc.close();
    }
}
