package Day_21;
import java.util.*;
public class Q82 {
    public static void main(String[] args) {
        String s;
        int l;
        char ch;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a sentence");
        s=sc.nextLine();
        l=s.length();
        for(int i=l-1;i>=0;i--)
        {
            ch=s.charAt(i);
            System.out.print(ch);
        }
        sc.close();
    }
}
