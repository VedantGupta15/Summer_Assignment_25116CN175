package Day_27;
import java.util.*;
public class Q105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 100;
        int[] rollNo = new int[max];
        String[] name = new String[max];
        double[] marks = new double[max];
        boolean flag=true;
        int count = 0;
        int ch;

        while(flag)
        {
            System.out.println("\t Student Record Management System ");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter Roll No: ");
                    rollNo[count] = sc.nextInt();
                    sc.nextLine();               //buffer
                    System.out.print("Enter Name: ");
                    name[count] = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    marks[count] = sc.nextDouble();

                    count++;
                    System.out.println("Student Added Successfully!");
                    break;

                case 2:
                    if (count == 0) 
                    {
                        System.out.println("No records found.");
                    } 
                    else {
                        System.out.println("Student Records:");
                        for (int i = 0; i < count; i++) 
                        {
                            System.out.println("Roll No: " + rollNo[i] +", Name: " + name[i] +", Marks: " + marks[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Roll No to Search: ");
                    int search = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (rollNo[i] == search) {
                            System.out.println("Record Found:");
                            System.out.println("Name: " + name[i]);
                            System.out.println("Marks: " + marks[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                    {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Roll No to Update: ");
                    int update = sc.nextInt();
                    found = false;

                    for (int i = 0; i < count; i++) 
                    {
                        if (rollNo[i] == update) 
                        {
                            System.out.print("Enter New Name: ");
                            name[i] = sc.nextLine();

                            System.out.print("Enter New Marks: ");
                            marks[i] = sc.nextDouble();

                            System.out.println("Record Updated");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Roll No to Delete: ");
                    int delete = sc.nextInt();
                    found = false;

                    for (int i = 0; i < count; i++) 
                    {
                        if (rollNo[i] == delete) 
                        {
                            for (int j = i; j < count - 1; j++) 
                            {
                                rollNo[j] = rollNo[j + 1];
                                name[j] = name[j + 1];
                                marks[j] = marks[j + 1];
                            }

                            count--;
                            found = true;
                            System.out.println("Record Deleted!");
                            break;
                        }
                    }

                    if (!found) 
                    {
                        System.out.println("Student not found.");
                    }
                    break;

                case 6:
                    System.out.println("Exit");
                    flag=false;
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }
        sc.close();
    }
}