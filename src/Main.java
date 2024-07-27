import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create example questions
        List<Question> exampleQuestions = List.of(
                new Question("What is 2 + 2?", "single", List.of("3", "4", "5"), List.of("4")),
                new Question("What is 3 + 5?", "single", List.of("5", "8", "10"), List.of("8")),
                new Question("Select prime numbers.", "multiple", List.of("2", "4", "6", "7"), List.of("2", "7"))
        );

        // Create a quiz with the example questions
        Quiz quiz = new Quiz(exampleQuestions);

        // Start the quiz
        quiz.displayIntroduction();
        quiz.askQuestions();
    }
}
