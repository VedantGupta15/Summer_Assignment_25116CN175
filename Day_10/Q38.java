package Day_10;

public class Q38 {
    public static void main(String[] args) {
        int i,j,k,sp=0;
        for(i=9;i>=1;i=i-2)
        {
            for(k=1;k<=sp;k++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            sp++;
            System.out.println();
        }
    }
}
