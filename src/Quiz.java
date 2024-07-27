import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<Question> questions;
    private int score;
    private Scanner scanner = new Scanner(System.in);

    public Quiz(List<Question> questions) {
        this.questions = questions;
        this.score = 0;
    }

    // Method to display the introduction
    public void displayIntroduction() {
        System.out.println("Welcome to the quiz!");
        System.out.println("This quiz has " + questions.size() + " questions.");
        System.out.println(); // Add a blank line for spacing
    }

    // Method to ask questions
    public void askQuestions() {
        for (int i = 0; i < questions.size(); i++) {
            Question question = questions.get(i);
            System.out.println((i + 1) + ". " + question.getQuestionText() + " (Question with " + question.getType() + " answer)");

            // Display possible answers
            List<String> possibleAnswers = question.getPossibleAnswers();
            for (int j = 0; j < possibleAnswers.size(); j++) {
                System.out.println((char) ('a' + j) + ". " + possibleAnswers.get(j));
            }

            // Add spacing
            System.out.println();

            // Get user input
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            // Check the user's answer
            checkAnswer(question, userAnswer);

            // Add spacing between questions
            System.out.println();
        }
        displayResults();
    }

    // Method to check the user's answer
    private void checkAnswer(Question question, String userAnswer) {
        List<String> correctAnswers = question.getCorrectAnswers();
        List<String> userAnswers = new ArrayList<>();
        for (char c : userAnswer.toCharArray()) {
            if (c >= 'a' && c < 'a' + question.getPossibleAnswers().size()) {
                userAnswers.add(question.getPossibleAnswers().get(c - 'a'));
            }
        }
        if (question.getType().equals("single")) {
            if (userAnswers.size() == 1 && correctAnswers.contains(userAnswers.get(0))) {
                score++;
            }
        } else if (question.getType().equals("multiple")) {
            if (userAnswers.containsAll(correctAnswers) && correctAnswers.containsAll(userAnswers)) {
                score++;
            }
        }
    }

    // Method to display the results
    private void displayResults() {
        System.out.println("You had " + score + "/" + questions.size() + " answers correct");
    }
}
