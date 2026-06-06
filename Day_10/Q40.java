package Day_10;

public class Q40 {
    public static void main(String[] args) {
        int i,j,k,l,sp=4;
        for(i=1;i<=5;i++)
        {
            char ch='A';
            for(k=1;k<=sp;k++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(ch);
                ch++;
            }
            ch-=2;
            for(l=i-1;l>0;l--)
            {
                System.out.print(ch);
                ch--;
            }
            System.out.println();
            sp--;
        }
    }
    
}
