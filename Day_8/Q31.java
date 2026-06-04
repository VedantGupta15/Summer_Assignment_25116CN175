package Day_8;

public class Q31 {
    public static void main(String[] args) {
        int i,j;
        char ch= 'A';
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(ch);
                ch++;
            }
            ch='A';
            System.out.println();
        }
    }
}
