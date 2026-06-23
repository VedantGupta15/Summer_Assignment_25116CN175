package Day_26;
import java.util.*;
public class Q103 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double balance = 10000;             //initial balance
        int ch;
        double amt;
        boolean flag=true;
        while(flag)
        {
            System.out.println("\t===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch)
            {
                case 1:
                    System.out.println("Current Balance: "+ balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    amt= sc.nextDouble();
                    balance+= amt;
                    System.out.println(amt + " deposited successfully.");
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    amt= sc.nextDouble();

                    if (amt <= balance) {
                        balance-= amt;
                        System.out.println(amt + " withdrawn successfully.");
                    }
                    else{
                        System.out.println("Insufficient balance!");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM.");
                    flag=false;
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        }
        sc.close();
    }
}
