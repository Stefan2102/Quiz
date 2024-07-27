# Quiz Application

Welcome to the Quiz Application! This command-line quiz application written in Java allows users to take quizzes with various types of questions and tracks their scores.

## Features

- Multiple types of questions (e.g., single choice, multiple choice).
- Score tracking.

## Getting Started

### How to Run the Project

1. **Clone the repository:**
   - Use your IDE to clone the repository directly: [https://github.com/Stefan2102/Quiz.git](https://github.com/Stefan2102/Quiz.git)
   - Alternatively, download the zip file from the GitHub repository and extract it to your preferred location.

2. **Open the project in your IDE:**
   - Open your IDE (e.g., IntelliJ IDEA, Eclipse).
   - Import the project from the directory where you cloned or extracted the zip file.

3. **Run the Application:**
   - Navigate to the `src/main/java/` directory within your IDE.
   - Locate the `Main` class.
   - Run the `Main` class to start the quiz application.

### Usage

1. Start the application by running the `Main` class.
2. Follow the on-screen instructions to take the quiz.
3. At the end of the quiz, your score will be displayed.

### Code Structure

- **`Main`**: Entry point of the application. Handles the quiz lifecycle and user interaction.
- **`Quiz`**: Manages the list of questions and tracks the user's score.
- **`Question`**: Represents a question, its possible answers, and correct answers.
- **`Answer`**: Represents an answer option.
- **`QuestionType`**: Enum to define the type of question (e.g., single, multiple).
