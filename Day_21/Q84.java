package Day_21;
import java.util.*;
public class Q84 {
     public static void main(String[] args) {
        String s;
        int l;
        char ch;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a sentence");
        s=sc.nextLine();
        l=s.length();
        for(int i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch>=97 && ch<=122)                   //or s.toUpperCase()
            {
                ch-=32;
            }
            System.out.print(ch);
        }
        sc.close();
    }   
}
