package Day_24;
import java.util.*;
public class Q95 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String s= sc.nextLine();
        int i;
        int counter=0;
        String max="";
        String[] arr=s.split(" ");
        int l=arr.length;
        for(i=0;i<l;i++)
        {
            String t=arr[i];
            int c=t.length();
            if(c>counter)
            {
                max=arr[i];
                counter=c;
            }
        }
        System.out.println("The longest word is '"+max+"'");
        sc.close();
    }
}
