package Day_26;
import java.util.*;
public class Q101 {
    public static void main(String[] args) {
        Random rand= new Random();
        Scanner sc= new Scanner(System.in);
        int num= rand.nextInt(100)+1;    //rand.nextInt(x)  generates num from 0 to x-1
        boolean flag=true;
        while(flag)
        {
            System.out.println("Guess a number from 1 to 100 ");
            int guess=sc.nextInt();
            if(guess>num)
            {
                System.out.println("Too high :( ");
            }
            else if(guess<num)
            {
                System.out.println("Too low :( ");
            }
            else{
                System.out.println("GUESSED CORRECTLY !!!!!!!!!!!!!");
                flag=false;
            }
        }
        sc.close();
    }
}
