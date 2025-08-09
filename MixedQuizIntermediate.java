import java.util.Scanner;

public class MixedQuizIntermediate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] questions = {
            "Python: What will be the output of print(type([]))?",
            "Python: Which of the following is used to handle exceptions in Python?",
            "C: What is the output of printf(\"%d\", 5/2); in C?",
            "C: Which storage class makes a variable retain its value between function calls?",
            "Java: Which concept allows a subclass to provide a specific implementation of a method already defined in its superclass?",
            "Java: What is the size of a double in Java?",
            "HTML: Which HTML element is used to define important text?",
            "HTML: Which attribute is used to uniquely identify an HTML element?",
            "CSS: Which property is used to change the font of text?",
            "CSS: Which CSS value makes an element invisible but still takes up space?"
        };

        String[][] options = {
            { "a) <class 'list'>", "b) <class 'tuple'>", "c) <class 'dict'>", "d) <class 'set'>" },
            { "a) throw-catch", "b) try-except", "c) if-else", "d) error-check" },
            { "a) 2.5", "b) 2", "c) 3", "d) 2.0" },
            { "a) auto", "b) static", "c) register", "d) extern" },
            { "a) Overloading", "b) Overriding", "c) Encapsulation", "d) Abstraction" },
            { "a) 4 bytes", "b) 6 bytes", "c) 8 bytes", "d) 16 bytes" },
            { "a) <strong>", "b) <important>", "c) <b>", "d) <i>" },
            { "a) class", "b) id", "c) name", "d) style" },
            { "a) font-family", "b) font-style", "c) text-font", "d) font-type" },
            { "a) hidden", "b) display: none", "c) opacity: 0", "d) visibility: hidden" }
        };

        char[] answers = { 'a', 'b', 'b', 'b', 'b', 'c', 'a', 'b', 'a', 'd' };

        int score = 0;

        System.out.println("Welcome to the Mixed Tech Intermediate Quiz!");
        System.out.println("Type the letter (a/b/c/d) for your answer.\n");

        for (int i = 0; i < questions.length; i++) {
            System.out.println((i + 1) + ". " + questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("Your answer: ");
            char userAns = sc.next().toLowerCase().charAt(0);

            if (userAns == answers[i]) {
                System.out.println(" Correct!\n");
                score++;
            } else {
                System.out.println(" Wrong! Correct answer: " + answers[i] + "\n");
            }
        }

        System.out.println("Quiz Finished!");
        System.out.println("Your Score: " + score + "/" + questions.length);

        sc.close();
    }
}
