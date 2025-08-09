
    import java.util.Scanner;

public class MixedQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] questions = {
            "Python: What is the correct file extension for Python files?",
            "Python: Which function is used to display output in Python?",
            "C: Which header file is required for printf() function?",
            "C: Which symbol is used to end each statement in C?",
            "Java: Which keyword is used to define a class in Java?",
            "Java: What is the file extension for Java files?",
            "HTML: What does HTML stand for?",
            "HTML: Which tag is used to create a hyperlink?",
            "CSS: What does CSS stand for?",
            "CSS: Which CSS property is used to change text color?"
        };

        String[][] options = {
            { "a) .py", "b) .python", "c) .pt", "d) .pyt" },
            { "a) echo()", "b) display()", "c) print()", "d) output()" },
            { "a) stdio.h", "b) conio.h", "c) stdlib.h", "d) math.h" },
            { "a) . (dot)", "b) ; (semicolon)", "c) : (colon)", "d) , (comma)" },
            { "a) define", "b) create", "c) class", "d) struct" },
            { "a) .jav", "b) .java", "c) .jv", "d) .jvm" },
            { "a) Hyperlinks and Text Markup Language", "b) Hyper Text Markup Language", "c) Home Tool Markup Language", "d) Hyper Transfer Markup Language" },
            { "a) <link>", "b) <href>", "c) <a>", "d) <hyper>" },
            { "a) Creative Style System", "b) Cascading Style Sheets", "c) Colorful Style Syntax", "d) Computer Style Setup" },
            { "a) font-color", "b) text-color", "c) color", "d) foreground" }
        };

        char[] answers = { 'a', 'c', 'a', 'b', 'c', 'b', 'b', 'c', 'b', 'c' };

        int score = 0;

        System.out.println("Welcome to the Mixed Tech Beginner Quiz!");
        System.out.println("Type the letter (a/b/c/d) for your answer.\n");

        for (int i = 0; i < questions.length; i++) {
            System.out.println((i + 1) + ". " + questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("Your answer: ");
            char userAns = sc.next().toLowerCase().charAt(0);

            if (userAns == answers[i]) {
                System.out.println("✅ Correct!\n");
                score++;
            } else {
                System.out.println("❌ Wrong! Correct answer: " + answers[i] + "\n");
            }
        }

        System.out.println("Quiz Finished!");
        System.out.println("Your Score: " + score + "/" + questions.length);

        sc.close();
    }
}


