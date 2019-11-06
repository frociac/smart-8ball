import java.util.Scanner;
import java.util.Random;
 
public class Eight_Ball
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("\n --------------------------------------------------------------------- \n");
        System.out.print("| Ask me a question! (Use correct English grammar for useful results) |");
        System.out.print("\n --------------------------------------------------------------------- \n\n"); 
        //umu just format fixes

        while(true)
        {
            int caseChecker = -1;
            Random random = new Random();
            //umu thanks for the random class, i used it below

            //got rid of toLowerCase() because it adjusted the String Question and lowercased names (see next comment)
            //bruh you can just do this:
            String questionOrig = input.nextLine();
            questionOrig = questionOrig.replace("?", "");
            questionOrig = questionOrig.replace(".", "");
            questionOrig = questionOrig.replace("!", "");

            //also im so big brain for this:
            String question = questionOrig.toLowerCase().replace("'", "").replace("whats", "what is");
            question = question.toLowerCase().replace("'", "").replace("whatre", "what are");
            question = question.toLowerCase().replace("'", "").replace("whens", "when is");
            question = question.toLowerCase().replace("'", "").replace("wheres", "where is");
            question = question.toLowerCase().replace("'", "").replace("whos", "who is");
            question = question.toLowerCase().replace("'", "").replace("whys", "why is");
            question = question.toLowerCase().replace("'", "").replace("hows", "how is");

            String answer = "placeholder";

            //instead i just put the toLowerCase() in here
            if(question.toLowerCase().startsWith("what is your name"))
                caseChecker = 0;
            else if(question.toLowerCase().startsWith("what are you") || question.toLowerCase().equals("who are you") || question.toLowerCase().equals("what is this"))
                caseChecker = 1;
            else if(question.toLowerCase().startsWith("what is"))
                caseChecker = 2;
            else if(question.toLowerCase().startsWith("who is joe")) //xddd funy meme
                caseChecker = 3;
            else if(question.toLowerCase().startsWith("who is yuri"))
                caseChecker = 4;
            else if(question.toLowerCase().startsWith("who is"))
                caseChecker = 5;
            else if(question.toLowerCase().startsWith("who are"))
                caseChecker = 6;
            else if(question.toLowerCase().startsWith("what are"))
                caseChecker = 7;
            else if(question.toLowerCase().startsWith("what do you do"))
                caseChecker = 8;
            else if(question.toLowerCase().startsWith("what am i doing"))
                caseChecker = 9;
            else if(question.toLowerCase().startsWith("what are you doing"))
                caseChecker = 10;
            else if(question.toLowerCase().equals("stop"))
                break;

            switch(caseChecker)
            {
                case 0:
                    answer = "My name is Smart-8ball.";
                    break;
                case 1:
                    answer = "I am a 8-ball program written in Java.";
                    break;
                case 2:
                    answer = "It is" + questionOrig.substring(7) + ". ";
                    break;    
                case 3:
                    answer = "Joe mother is a nice person.";
                    break;
                case 4:
                    answer = "Yuri-ally amazing.";
                    break;
                case 5:
                    //smh finally a real 8ball
                    //you can add onto these arrays btw
                    String[] whoIsAns = {"Someone you know.", "Your mother.", "A being that only exists in your imagination.", "Probably someone of slight significance."};
                    int whoIsInt = random.nextInt(whoIsAns.length + 1);
                    answer = whoIsAns[whoIsInt];
                    break;
                case 6: 
                    String[] whoAreAns = {"Some of your friends.", "A group in which each individual shares similar traits to another individual of the same group.", "They are members of a cult."};
                    int whoAreInt = random.nextInt(whoAreAns.length + 1);
                    answer = whoAreAns[whoAreInt];
                    break;
                case 7: 
                    answer = "They are " + questionOrig.substring(8) + ". ";
                    break;
                case 8:
                    answer = "I answer questions.";
                    break;
                case 9:
                    answer = "You are asking me questions.";
                    break;
                case 10:
                    answer = "I'm answering your question.";
                default:
                    answer = "what ???";
            }

            System.out.print("\n- " + answer + "\n\n ---------------------------- \n| Ask me a another question! | \n ---------------------------- \n\n");
        }
    System.out.println("alright");
    //close statement closes the input, something about a data leak idk
    input.close();
    }
}
