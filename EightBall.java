import java.util.Scanner;
 
public class EightBall
{
    public static void main(String[] args)
    {
        boolean loop = true;
        Scanner input = new Scanner(System.in);

        System.out.print("\n -------------------------------------------------- \n");
        System.out.print("| Hello, I'm Smart-8ball, an 8-ball built in Java. |\n| Use correct English grammar for optimal results. |\n|   (Enter \"x\" anytime you would like to exit!)    |\n|                Ask me any question!              |");
        System.out.print("\n -------------------------------------------------- \n\n"); 
        //umu just format fixes

        while(loop)
        {
            int q = -1;

            //got rid of toLowerCase() because it adjusted the String Question and lowercased names (see next comment)
            //bruh you can just do this:
            String questionOrig = input.nextLine();
            questionOrig = questionOrig.replace("?", "").replace(".", "").replace("!", "");

            //also im so big brain for this:
            String question = questionOrig.toLowerCase().replace("'", "").replace("whats", "what is");
            question = question.replace("whatre", "what are").replace("whens", "when is");
            question = question.replace("wheres", "where is").replace("whose", "who").replace("whos", "who is");
            question = question.replace("whys", "why is").replace("hows", "how is");

            String answer = "placeholder";

            q = QuestionChecker.qChecker(question);

            answer = AnswerFinder.aFinder(q, question);

            if(answer == "Goodbye.")
                loop = false;

            System.out.print("\n- " + answer + "\n\n");
            if(loop)
                System.out.print(" ---------------------- \n| Ask me any question! | \n ---------------------- \n\n");
        }
        input.close();
        System.exit(0);
    }
}
