package Day_27;
import java.util.*;
public class Q108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] rollNo = new int[100];
        String[] name = new String[100];
        int[] marks1 = new int[100];
        int[] marks2 = new int[100];
        int[] marks3 = new int[100];

        int count = 0;
        boolean flag = true;

        while (flag) 
        {
            System.out.println("\t Marksheet Generation System ");
            System.out.println("1. Add Student");
            System.out.println("2. Generate Marksheet");
            System.out.println("3. Display All Students");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            int ch = sc.nextInt();

            switch (ch) 
            {

                case 1:
                    System.out.print("Enter Roll No: ");
                    rollNo[count] = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    name[count] = sc.nextLine();

                    System.out.print("Enter Marks in Subject 1: ");
                    marks1[count] = sc.nextInt();

                    System.out.print("Enter Marks in Subject 2: ");
                    marks2[count] = sc.nextInt();

                    System.out.print("Enter Marks in Subject 3: ");
                    marks3[count] = sc.nextInt();

                    count++;
                    System.out.println("Student Added Successfully!");
                    break;

                case 2:
                    System.out.print("Enter Roll No: ");
                    int searchRoll = sc.nextInt();

                    boolean found = false;
                    for(int i=0;i<count;i++) 
                    {
                        if (rollNo[i] == searchRoll) 
                        {
                            int total = marks1[i] + marks2[i] + marks3[i];
                            double percentage = total / 3.0;

                            String grade;

                            if (percentage >= 90)
                                grade = "A+";
                            else if (percentage >= 75)
                                grade = "A";
                            else if (percentage >= 60)
                                grade = "B";
                            else if (percentage >= 40)
                                grade = "C";
                            else
                                grade = "F";

                            System.out.println("\t MARKSHEET ");
                            System.out.println("Roll No : " + rollNo[i]);
                            System.out.println("Name    : " + name[i]);
                            System.out.println("Subject 1 : " + marks1[i]);
                            System.out.println("Subject 2 : " + marks2[i]);
                            System.out.println("Subject 3 : " + marks3[i]);
                            System.out.println("Total     : " + total);
                            System.out.println("Percentage: " + percentage);
                            System.out.println("Grade     : " + grade);

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Not Found.");
                    }
                    break;

                case 3:
                    for(int j=0;j<count;j++)
                    {
                        System.out.println("Roll No: " + rollNo[j] +", Name: " + name[j]);
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    flag = false;
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        }

        sc.close();
    }
}
