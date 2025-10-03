import java.io.*;
import java.util.*;

class Question {
    private String question;
    private List<String> options;
    private int correctAnswer;

    public Question(String question, List<String> options, int correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public List<String> getOptions() {
        return options;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(question + "\n");
        for (int i = 0; i < options.size(); i++) {
            sb.append((i + 1)).append(". ").append(options.get(i)).append("\n");
        }
        return sb.toString();
    }
}

class QuizGame {
    private List<Question> questions = new ArrayList<>();
    private int score = 0;

    public QuizGame() {
        loadQuestions();
    }

    private void loadQuestions() {
        questions.add(
                new Question("What is the capital of France?", Arrays.asList("Berlin", "Madrid", "Paris", "Rome"), 3));
        questions.add(new Question("Which language is used for Android development?",
                Arrays.asList("Python", "Java", "C#", "Swift"), 2));
        questions.add(new Question("Who developed Java?",
                Arrays.asList("Microsoft", "Sun Microsystems", "Google", "Apple"), 2));
        questions.add(new Question("Which planet is known as the Red Planet?",
                Arrays.asList("Earth", "Venus", "Mars", "Jupiter"), 3));
    }

    public void start() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Welcome to the Quiz Game ===\n");
        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);
            System.out.println("Q" + (i + 1) + ": " + q);
            System.out.print("Your answer (1-4): ");
            int answer = sc.nextInt();
            if (answer == q.getCorrectAnswer()) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! Correct answer: " + q.getOptions().get(q.getCorrectAnswer() - 1) + "\n");
            }
        }
        System.out.println("=== Quiz Over ===");
        System.out.println("Your Score: " + score + "/" + questions.size());
        saveResult(score, questions.size());
        sc.close();
    }

    private void saveResult(int score, int total) {
        try (FileWriter fw = new FileWriter("quiz_results.txt", true)) {
            fw.write("Player scored " + score + " out of " + total + "\n");
            System.out.println("Result saved to quiz_results.txt");
        } catch (IOException e) {
            System.out.println("Error saving result.");
        }
    }
}

public class Program_109 {
    public static void main(String[] args) {
        QuizGame quiz = new QuizGame();
        quiz.start();
    }
}