package Day_21;
import java.util.*;
public class Q81 {
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence- ");
        s=sc.nextLine();
        int l=0;
        for(char c : s.toCharArray())
        {
            l++;
        }
        System.out.println("The length of string is : "+l);
        sc.close();
    }
}
