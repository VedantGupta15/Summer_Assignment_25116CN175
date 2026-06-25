package Day_27;
import java.util.*;
public class Q106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] empId = new int[100];
        String[] empName = new String[100];
        double[] empSalary = new double[100];

        int count = 0;
        boolean flag = true;

        while (flag) 
        {
            System.out.println("\t Employee Management System ");
            System.out.println("1. Add Employee");
            System.out.println("2. Search Employee");
            System.out.println("3. Display Employees");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            int ch = sc.nextInt();

            switch (ch)
            {

                case 1:
                    System.out.print("Enter Employee ID: ");
                    empId[count] = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    empName[count] = sc.nextLine();

                    System.out.print("Enter Employee Salary: ");
                    empSalary[count] = sc.nextDouble();

                    count++;

                    System.out.println("Employee Added Successfully!");
                    break;

                case 2:
                    System.out.print("Enter Employee ID to Search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;
                    int i = 0;

                    while (i < count) 
                    {
                        if (empId[i] == searchId) 
                        {
                            System.out.println("Employee Found");
                            System.out.println("ID: " + empId[i]);
                            System.out.println("Name: " + empName[i]);
                            System.out.println("Salary: " + empSalary[i]);

                            found = true;
                            break;
                        }
                        i++;
                    }

                    if (found == false) 
                    {
                        System.out.println("Employee Not Found.");
                    }
                    break;

                case 3:
                    if (count == 0) 
                    {
                        System.out.println("No Employees Found.");
                    } 
                    else {
                        System.out.println("Employee Records:");
                        for(int j=0;j<count;j++)
                        {
                            System.out.println("ID: " + empId[j] +", Name: " + empName[j] +", Salary: " + empSalary[j]);
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
