import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array of questions
        String[] questions = {
                "1. Who is Rohit Sharma?\nA. Actor\nB. Cricketer\nC. Footballer\nD. Prime Minister",
                "2. How many times has Mumbai Indians won the IPL Championship?\nA. 0\nB. 2\nC. 5\nD. 7",
                "3. Jersey number of Rohit Sharma is?\nA. 45\nB. 28\nC. 10\nD. 18",
                "4. How many T-20 centuries does Rohit Sharma have?\nA. 5\nB. 4\nC. 0\nD. 10",
                "5. Who is called HITMAN?\nA. Dhoni\nB. Virat\nC. Bumrah\nD. Rohit"
        };
        System.out.println("Enter Your Name:");
        String name = scanner.nextLine();
        System.out.println("Enter Last Two Digits of PRN Number:");
        int number = scanner.nextInt();
        System.out.println("PRN Number is: 2124UMLM" + number);
        if (number > 0 && number < 80) {
            // Array of correct answers
            char[] answers = { 'B', 'C', 'A', 'A', 'D' };

            // Welcome banner
            System.out.println("********************************************");
            System.out.println("           WELCOME TO CRICKET QUIZ          ");
            System.out.println("********************************************");

            int score = 0; // Initialize score

            // Loop through the questions
            for (int i = 0; i < questions.length; i++) {
                System.out.println(questions[i]); // Display question
                char userAnswer;

                while (true) { // Keep asking until valid input is provided
                    System.out.print("Your answer (A/B/C/D): ");
                    userAnswer = Character.toUpperCase(scanner.next().charAt(0));
                    // Validate the input
                    if (userAnswer == 'A' || userAnswer == 'B' || userAnswer == 'C' || userAnswer == 'D') {
                        if (userAnswer == answers[i]) {
                            System.out.println("Correct!\n");
                            score++;
                            break;
                        } else {
                            System.out.println("Wrong! Try again. \n");
                        }

                    } else {
                        System.out.println("Invalid Input. Please enter A, B, C, or D.");
                    }
                }
            }

            // Display final score
            System.out.println("Quiz Completed!");
            System.out.println("Your final score is: " + score + "/" + questions.length);

            // Provide feedback based on score
            if (score == questions.length) {
                System.out.println("Excellent! You got all answers right!");
            } else if (score >= questions.length / 2) {
                System.out.println("Good job! Keep practicing to improve.");
            } else {
                System.out.println("Better luck next time!");
            }
        } else {
            System.out.println("No Quize Found...");
        }
    }
}
