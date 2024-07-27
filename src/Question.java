import java.util.List;

public class Question {
    private String questionText;
    private String type; // e.g., "single", "multiple"
    private List<String> possibleAnswers;
    private List<String> correctAnswers;

    public Question(String questionText, String type, List<String> possibleAnswers, List<String> correctAnswers) {
        this.questionText = questionText;
        this.type = type;
        this.possibleAnswers = possibleAnswers;
        this.correctAnswers = correctAnswers;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String getType() {
        return type;
    }

    public List<String> getPossibleAnswers() {
        return possibleAnswers;
    }

    public List<String> getCorrectAnswers() {
        return correctAnswers;
    }
}
