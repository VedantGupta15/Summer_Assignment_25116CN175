package Day_27;
import java.util.*;
public class Q107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] empId = new int[100];
        String[] empName = new String[100];
        double[] salary = new double[100];

        int count = 0;
        boolean flag = true;

        while (flag) {
            System.out.println("\t Salary Management System ");
            System.out.println("1. Add Salary Record");
            System.out.println("2. Search Salary");
            System.out.println("3. Display All Records");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("Enter Employee ID: ");
                    empId[count] = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    empName[count] = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    salary[count] = sc.nextDouble();

                    count++;
                    System.out.println("Record Added Successfully!");
                    break;

                case 2:
                    System.out.print("Enter Employee ID to Search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;
                    for(int i=0;i<count;i++) 
                    {
                        if (empId[i] == searchId)
                        {
                            System.out.println("Employee Found");
                            System.out.println("ID: " + empId[i]);
                            System.out.println("Name: " + empName[i]);
                            System.out.println("Salary: " + salary[i]);

                            found = true;
                            break;
                        }
                    }

                    if (!found)
                    {
                        System.out.println("Employee Not Found.");
                    }
                    break;

                case 3:
                    if (count == 0) 
                    {
                        System.out.println("No Records Found.");
                    } 
                    else 
                    {
                        for(int j=0;j<count;j++)
                        {
                            System.out.println("ID: " + empId[j] + ", Name: " + empName[j] + ", Salary: " + salary[j]);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting.");
                    flag = false;
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
        sc.close();
    }
}
