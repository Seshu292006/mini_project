import java.util.Scanner;

public class MixedQuizAdvanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] questions = {
            "Python: What will be the output of print(0.1 + 0.2 == 0.3)?",
            "Python: Which of these creates a generator in Python?",
            "C: Which of the following is not a valid storage class in C?",
            "C: What is the output of int x = 5; printf(\"%d\", x++ + ++x); ?",
            "Java: Which of the following will cause a compile-time error?",
            "Java: What is the result of System.out.println(10 + 20 + \"30\");?",
            "HTML: Which HTML5 element is used to embed audio content?",
            "HTML: Which attribute specifies that an input field must be filled before submitting?",
            "CSS: Which property is used to create a flex container?",
            "CSS: Which pseudo-class selects an element when the mouse hovers over it?"
        };

        String[][] options = {
            { "a) True", "b) False", "c) None", "d) Error" },
            { "a) (x for x in range(5))", "b) [x for x in range(5)]", "c) generator(range(5))", "d) gen(range(5))" },
            { "a) auto", "b) static", "c) volatile", "d) register" },
            { "a) 11", "b) 12", "c) Undefined behavior", "d) 13" },
            { "a) Overloading with different parameter types", "b) Overriding a static method", "c) Same name & return type diff only", "d) Same name with diff param count" },
            { "a) 3030", "b) 102030", "c) 3030.0", "d) 30" },
            { "a) <sound>", "b) <music>", "c) <audio>", "d) <media>" },
            { "a) required", "b) validate", "c) mandatory", "d) checked" },
            { "a) display: flex", "b) flex-container: true", "c) container: flex", "d) flexbox: yes" },
            { "a) :hover", "b) :focus", "c) :active", "d) :select" }
        };

        char[] answers = { 'b', 'a', 'c', 'c', 'c', 'a', 'c', 'a', 'a', 'a' };

        int score = 0;

        System.out.println("Welcome to the Mixed Tech Advanced Quiz!");
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

