## Goal:
Create a functional trivia game with at least 3 questions, each with 3 answers.
## Bonus: 
Add scoring

## The Actual Code:
```java
import java.util.Scanner;

public class Main {
public static void main(String[] args) {







        int score = 0;

        String q1 = "In what year was Minecraft fully released?";
        String q1a1 = "\n2009"; // Option 1
        String q1a2 = "\n2007"; // Option 2
        String q1a3 = "\n2011"; // Option 3
        String q1a = "2011"; // Correct answer

        String q2 = "A school in which country had Minecraft become a mandatory part of its curriculum for all 13-year olds?";
        String q2a1 = "\nUSA";
        String q2a2 = "\nSweden";
        String q2a3 = "\nGermany";
        String q2a = "Sweden";

        String q3 = "In what Minecraft update were llamas added?";
        String q3a1 = "\n1.14";
        String q3a2 = "\n1.11";
        String q3a3 = "\n1.6";
        String q3a = "1.11";

        System.out.println("Type your answer to the following question. Watch for trailing or leading spaces. Answers are case sensitive.");

        Scanner scanner = new Scanner(System.in);

        /* Q1 */
        System.out.println(q1+q1a1+q1a2+q1a3);


        String input = scanner.nextLine();


        if(input.equals(q1a)) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect.");
        }
        System.out.println("Your score is now "+score+".");

        /* Q2 */
        System.out.println(q2+q2a1+q2a2+q2a3);

        input = scanner.nextLine();

        if(input.equals(q2a)) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect.");
        }
        System.out.println("Your score is now "+score+".");

        /* Q3 */
        System.out.println(q3+q3a1+q3a2+q3a3);

        input = scanner.nextLine();

        if(input.equals(q3a)) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect.");
        }

        switch (score) {
            case 3: System.out.println("You got all 3 questions correct. Congrats."); break;
            case 2: System.out.println("You got 2 questions correct. Decent."); break;
            case 1: System.out.println("You got only 1 question correct."); break;
            case 0: System.out.println("You failed miserably."); break;
            default: System.out.println("Something went horribly wrong."); break;
        }
    }
}
```

## Output Ex:

Type your answer to the following question. Watch for trailing or leading spaces. Answers are case sensitive.
In what year was Minecraft fully released?\
2009\
2007\
2011\
_2011_\
Correct!\
Your score is now 1.\
A school in which country had Minecraft become a mandatory part of its curriculum for all 13-year olds?\
USA\
Sweden\
Germany\
_Sweden_\
Correct!\
Your score is now 2.\
In what Minecraft update were llamas added?\
1.14\
1.11\
1.6\
_0_\
Incorrect.\
You got 2 questions correct. Decent.  
