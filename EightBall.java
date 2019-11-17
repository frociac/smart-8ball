import java.util.Scanner;
 
public class EightBall
{
    public static void main(String[] args)
    {
        boolean loop = true;
        Scanner input = new Scanner(System.in);

        System.out.print("\n -------------------------------------------------- \n");
        System.out.print("| Hello, I'm Smart-8ball, an 8-ball built in Java. |\n" + 
                         "| Use correct English grammar for optimal results. |\n" + 
                         "|   (Enter \"x\" anytime you would like to exit!)    |\n" + 
                         "|                Ask me any question!              |");
        System.out.print("\n -------------------------------------------------- \n\n"); 

        while(loop)
        {
            int q = -1;

            // got rid of toLowerCase() because it adjusted the String Question and lowercased names (see next comment)
            // bruh you can just do this:
            String questionOrig = input.nextLine();
            questionOrig = questionOrig.replace("?", "");

            // also im so big brain for this:
            String[][] replacements = {{"'", ""}, {"whats", "what is"}, {"whatre","what are"}, 
                                       {"whens","when is"}, {"wheres","where is"}, {"whos ", "who is "}, 
                                       {"whys", "why is"}, {"hows", "how is"}};

            String question = "placeholder?";
            for(String[] replacement: replacements) {
                question = questionOrig.toLowerCase().replace(replacement[0], replacement[1]);
            }

            String answer = "placeholder";

            q = QuestionChecker.qChecker(question);

            answer = AnswerFinder.aFinder(q, question);

            if(answer == "Goodbye")
                loop = false;

            System.out.print("\n- " + answer + ".\n\n");
            if(loop)
                System.out.print(" ---------------------- \n" + 
                                 "| Ask me any question! | \n" + 
                                 " ---------------------- \n\n");
        }
        input.close();
        System.exit(0);
    }
}
