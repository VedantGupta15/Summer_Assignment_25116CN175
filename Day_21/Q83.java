package Day_21;
import java.util.*;
public class Q83 {
    public static void main(String[] args) {
        String s;
        int l,v=0,c=0;
        char ch;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a sentence");
        s=sc.nextLine();
        l=s.length();
        for(int i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if((ch>=65 && ch<=90) || (ch>=97 && ch<=122))              //ACII VALUES A-Z(65 to 90) and a-z(97 to 122)
            {
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                {
                    v++;
                }
                else{
                    c++;
                }
            }
        }
        System.out.println("Vowels = "+v);
        System.out.println("Consonents = "+c);
        sc.close();
    }
}
