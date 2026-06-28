package Day_29;
import java.util.*;
public class Q114 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        int[] arr=new int[100];
        int c=0;
        while(flag)
        {
            System.out.println("\t\tArray Operations");
            System.out.println("1. Add element in Array");
            System.out.println("2. Display Array");
            System.out.println("3. Search an Element");
            System.out.println("4. Calculate Sum of Elements");
            System.out.println("5. Exit");

            System.out.println("Enter Your Choice: ");
            int ch = sc.nextInt();

            switch (ch){
                case 1:
                    System.out.println("Enter the element to be added: ");
                    arr[c]=sc.nextInt();
                    c++;
                    System.out.println("Added successfully");
                    break;

                case 2:
                    if(c==0)
                    {
                        System.out.println("ARRAY EMPTY");
                    }
                    else{
                        for(int i=0;i<c;i++)
                        {
                            System.out.print(arr[i]+" ");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Enter the element to be searched");
                    int n=sc.nextInt();
                    for(int i=0;i<c;i++)
                    {
                        if(arr[i]==n)
                        {
                            System.out.println("Found at index: "+i);
                            break;
                        }
                        else{
                            System.out.println("Not present");
                        }
                    }
                    break;

                case 4:
                    int s=0;
                    for(int i=0;i<c;i++)
                    {
                        s+=arr[i];
                    }
                    System.out.println("The sum of elements is:  "+s );
                    break;

                case 5:
                    flag=false;
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;

            }
        }
        sc.close();
    }
}
