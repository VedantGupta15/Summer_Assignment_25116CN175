package Day_26;
import java.util.*;
public class Q104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] questions = {
            "What is the capital of India?",
            "Which language is used for Android development?",
            "12 + 33 = ?",
            "Which planet is known as the Red Planet?"
        };

        String[][] options = {
            {"Mumbai", "Delhi", "Chennai", "Kolkata"},
            {"Java", "Python", "C", "HTML"},
            {"42", "35", "44", "45"},
            {"Earth", "Mars", "Jupiter", "Venus"}
        };

        int[] correctAnswers = {2, 1, 4, 2};

        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println("Q" + (i + 1) + ". " + questions[i]);

            for (int j = 0; j < options[i].length; j++) {
                System.out.println((j + 1) + ". " + options[i][j]);
            }

            System.out.print("Enter your answer (1-4): ");
            int userAnswer = sc.nextInt();

            if (userAnswer == correctAnswers[i]) {
                System.out.println("Correct!");
                score++;
            } 
            else {
                System.out.println("Wrong!");
            }
        }

        System.out.println("===== Quiz Finished =====");
        System.out.println("Score: " + score + "/" + questions.length);

        sc.close();
    }
}
