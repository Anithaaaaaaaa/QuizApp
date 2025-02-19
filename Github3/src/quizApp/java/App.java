package quizApp.java;
import java.util.*;

class Question {
    String question;
    ArrayList<String> options;
    int answer;

    public Question(String question, ArrayList<String> options, int answer) {
        this.question = question;
        this.options = options;
        this.answer = answer;
    }
}
public class App 
{
	static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        LinkedList<Question> questions = new LinkedList<>(Arrays.asList(
            new Question("Which of these is not a valid Java keyword?", new ArrayList<>(Arrays.asList("volatile", "transient", "inner", "synchronized")), 3),
            new Question("What is the default size of an int in Java?", new ArrayList<>(Arrays.asList("16-bit", "32-bit", "64-bit", "Depends on OS")), 2),
            new Question("Which of the following statements is true about Java's memory management?", new ArrayList<>(Arrays.asList("Uses manual memory management", "Has no garbage collection", "Uses automatic garbage collection", "Uses pointers for memory")), 3),
            new Question("Which design pattern does Singleton pattern belong to?", new ArrayList<>(Arrays.asList("Creational", "Structural", "Behavioral", "None")), 1),
            new Question("Which of these collections allows null keys?", new ArrayList<>(Arrays.asList("TreeMap", "HashMap", "Hashtable", "ConcurrentHashMap")), 2)
        ));
        
        int score = 0;

        for (int i = 0; i < questions.size(); i++) {
            System.out.println("Q" + (i + 1) + ": " + questions.get(i).question);
            for (int j = 0; j < questions.get(i).options.size(); j++) {
                System.out.println((j + 1) + ". " + questions.get(i).options.get(j));
            }
            System.out.print("Your answer: ");
            int userAnswer = scanner.nextInt();
            
            if (userAnswer == questions.get(i).answer) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! The correct answer is: " + questions.get(i).answer + "\n");
            }
        }

        System.out.println("Quiz Over! Your Score: " + score + "/" + questions.size());
    }



}
