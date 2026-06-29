package Day_30;
import java.util.*;
public class Q120 {
    static Scanner sc = new Scanner(System.in);
    static String[] food = {"Burger","Pizza","Sandwich","Pasta","Cold Drink"};
    static int[] price = {120,250,90,180,50};
    static int[] quantity = new int[5];
    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            System.out.println("========== RESTAURANT BILLING SYSTEM ==========");
            System.out.println("1. Display Menu");
            System.out.println("2. Place Order");
            System.out.println("3. View Bill");
            System.out.println("4. Search Food Item");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    displayMenu();
                    break;

                case 2:
                    placeOrder();
                    break;

                case 3:
                    viewBill();
                    break;

                case 4:
                    searchItem();
                    break;

                case 5:
                    System.out.println("Thank you for visiting!");
                    flag = false;
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }

    public static void displayMenu() {

        System.out.println("----------- MENU -----------");

        for (int i = 0; i<5; i++) {
            System.out.println((i + 1) + ". " + food[i] + " - Rs." + price[i]);
        }
    }

    public static void placeOrder() {
        char ch;
        boolean flag=true;
        while(flag)
        {
            displayMenu();
            System.out.print("Enter Food Number: ");
            int item = sc.nextInt();

            if (item >= 1 && item <= food.length) {

                System.out.print("Enter Quantity: ");
                int qty = sc.nextInt();

                quantity[item - 1] += qty;

                System.out.println("Order Added Successfully!");

            } else {

                System.out.println("Invalid Food Number!");

            }

            System.out.print("Order Another Item? (Y/N): ");
            ch = sc.next().charAt(0);

            if (ch == 'Y' || ch == 'y')
            {
                flag=true;
            }
            else{
                flag=false;
            }
       }
    }

    public static void viewBill() {

        int total = 0;

        System.out.println("========= BILL ==========");

        System.out.println( "Item Price Qty Amount");

        for (int i = 0; i < food.length; i++) {

            if (quantity[i] > 0) {

                int amount = quantity[i] * price[i];

                total += amount;

                System.out.println(food[i]+" "+price[i]+" "+quantity[i]+" "+amount);
            }
        }

        System.out.println("---------------------------------------------");
        System.out.println("Total Bill = Rs." + total);
    }

    public static void searchItem() {

        sc.nextLine();

        System.out.print("Enter Food Name: ");
        String name = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < food.length; i++) {

            if (food[i].equalsIgnoreCase(name)) {

                System.out.println("Item Found!");
                System.out.println("Price : Rs." + price[i]);

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Food Item Not Available.");
        }
    }
}