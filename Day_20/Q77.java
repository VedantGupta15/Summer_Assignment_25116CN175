package Day_20;
import java.util.*;
public class Q77 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int r1,r2,c1,c2,i,j,k;
        System.out.print("Enter num of rows for first matrix - ");
        r1=sc.nextInt();
        System.out.print("Enter num of coloumns for first matrix - ");
        c1=sc.nextInt();
        int[][] m1=new int[r1][c1];
        System.out.print("Enter num of rows for second matrix - ");
        r2=sc.nextInt();
        System.out.print("Enter num of coloumns for second matrix - ");
        c2=sc.nextInt();
        int[][] m2=new int[r2][c2];
        if(c1==r2)
        {
            int[][] res=new int[r1][c2];
            System.out.println("Enter first matrix ");
            for(i=0;i<r1;i++)
            {
                for(j=0;j<c1;j++)
                {
                    System.out.print("Element ["+i+"]["+j+"] : ");
                    m1[i][j]=sc.nextInt();
                }
            }
            System.out.println("Enter second matrix");
            for(i=0;i<r2;i++)
            {
                for(j=0;j<c2;j++)
                {
                    System.out.print("Element ["+i+"]["+j+"] : ");
                    m2[i][j]=sc.nextInt();
                }
            }
            
            for(i=0;i<r1;i++)    //rows of first matix
            {
                for(j=0;j<c2;j++)       //columns of second matix
                {
                    for(k=0;k<c1;k++)
                    {
                        res[i][j]+=m1[i][k]*m2[k][j];                   //in java initial value of int array is 0
                    }
                }
            }
            System.out.println("The multication of the matrices is-");
            for(i=0;i<r1;i++)   
            {
                for(j=0;j<c2;j++)       
                {
                    System.out.print(res[i][j]+"\t");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Multiplication not possible");
        }
            sc.close();
        }
    }

