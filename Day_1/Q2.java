package Day_1;
import java.util.*;
class Q2 {
    public static void main(String[] args) {
        int i,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        for(i=1;i<11;i++)
        {
            System.out.println(n+" * "+i+" = "+n*i);
        }
        sc.close();
    }
    
}
