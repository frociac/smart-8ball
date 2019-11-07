import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
 
public class EightBall
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        //i hate java
        String[] something8ball = { //what is john doing? what will happen tomorrow? what am i eating? 
            "Something epic.", 
            "Nothing of importance.", 
            "Your mother.", 
            "Something otherworldly."
        };

        String[] places8ball = { //where...?
            "China.",
            "Area 51.",
            "A planet on another dimension.",
            "Llanfairpwllgwyngyll, a village in Anglesey, Wales."
        };

        String[] time8ball = { //when...?
            "Tomorrow, at exactly 4:20pm.",
            "In approximately 604,800 seconds.",
            "During the winter."
        };

        String[] reasons8ball = { //why...?
            "Because that's just how it works.",
            "Why not?",
            "No reason in particular."
        };

        String[] whoIs8ball = { //who is...?
            "Someone you know.",
            "Your mother.",
            "Barack Obama.",
            "One that exists only in the imagination.",
            "Someone of slight significance."
        };

        String[] whoAre8ball = { //who are...?
            "A group in which each individual shares similar traits to other members of the group.",
            "The Second Coming.",
            "Some of your friends."
        };

        //also note that both whoIs8ball and whoAre8ball should be able to answer the question "who ate my sandwich" 
        String[] who8ball = new String[whoIs8ball.length + whoAre8ball.length];
        System.arraycopy(whoIs8ball, 0, who8ball, 0, whoIs8ball.length);
        System.arraycopy(whoAre8ball, 0, who8ball, whoIs8ball.length, whoAre8ball.length);

        String[] how8ball = { //how is john feeling? how did i do on the test? how do birds fly?
            "That's a secret (I am not legally allowed to tell you).",
            "Very impressively.",
            "Epically."
        };

        String[] default8ball = {
            "It is certain.",
            "It is decidedly so.",
            "Without a doubt.",
            "Yes - definitely.",
            "You may rely on it.",
            "As I see it, yes.",
            "Most likely.",
            "Outlook good.",
            "Yes.",
            "Signs point to yes.",
            "I am unsure.",
            "Perhaps.",
            "It is unecessary to tell you now.",
            "Probably not.",
            "Definitely not.",
            "No."
        };

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
            questionOrig = questionOrig.replace("?", "").replace(".", "").replace("!", "");

            //also im so big brain for this:
            String question = questionOrig.toLowerCase().replace("'", "").replace("whats", "what is");
            question = question.replace("whatre", "what are").replace("whens", "when is");
            question = question.replace("wheres", "where is").replace("whose", "who").replace("whos", "who is");
            question = question.replace("whys", "why is").replace("hows", "how is");

            String answer = "placeholder";

            //what questions
            if(question.startsWith("what is your name"))
                caseChecker = 0;
            else if(question.startsWith("what are you") || question.equals("who are you") || question.equals("what is this"))
                caseChecker = 1;
            else if(question.equals("what am i doing"))
                caseChecker = 2;
            else if(question.startsWith("what are you doing"))
                caseChecker = 3;
            else if(question.equals("what do you do"))
                caseChecker = 4;
            else if(question.startsWith("what is"))
                caseChecker = 5;
            else if(question.startsWith("what are"))
                caseChecker = 6;
            else if(question.startsWith("what do") || question.startsWith("what does") || question.startsWith("what did") || question.startsWith("what will") || question.startsWith("what would") || question.startsWith("what wont") || question.startsWith("what might") || (question.startsWith("what") && question.contains("doing") && !question.contains("you")))
                caseChecker = 7;

            //who questions
            else if(question.startsWith("who is joe")) //xddd funy meme
                caseChecker = 8;
            else if(question.startsWith("who is yuri"))
                caseChecker = 9;
            else if(question.startsWith("who is"))
                caseChecker = 10;
            else if(question.startsWith("who are"))
                caseChecker = 11;
            else if(question.startsWith("who"))
                caseChecker = 12;

            //how questions
            else if(question.equals("how are you") || question.equals("how do you do"))
                caseChecker = 13;
            else if(question.startsWith("howdy") || question.startsWith("hello") || question.startsWith("hi"))
                caseChecker = 14;
            else if(question.startsWith("how") && (question.contains(" i ") || question.contains("me") || question.contains("myself")))
                caseChecker = 15;
            else if(question.startsWith("how"))
                caseChecker = 16;

            //where 
            else if(question.startsWith("where"))
                caseChecker = 17;

            //when
            else if(question.startsWith("when"))
                caseChecker = 18;

            //why
            else if(question.startsWith("why"))
                caseChecker = 19;

            else if(question.equals("stop"))
                break;


            //what: 0-7
            //who: 8-12
            //how: 13-16
            //where: 17
            //when: 18
            //why: 19
            switch(caseChecker)
            {
                case 0:
                    answer = "My name is Smart-8ball.";
                    break;
                case 1:
                    answer = "I am a 8-ball program written in Java.";
                    break;
                case 2:
                    answer = "You are asking me questions.";
                    break;
                case 3:
                    answer = "I'm answering questions.";
                    break;
                case 4:
                    answer = "I answer questions.";
                    break;
                case 5:
                    answer = "It is" + questionOrig.substring(7) + ". ";
                    break;    
                case 6: 
                    answer = "They are " + questionOrig.substring(8) + ". ";
                    break;
                case 7:
                    int somethingInt = random.nextInt(something8ball.length);
                    answer = something8ball[somethingInt];
                    break;

                case 8:
                    answer = "Joe mother is a nice person.";
                    break;
                case 9:
                    answer = "Yuri-ally amazing.";
                    break;
                case 10:
                    //smh finally a real 8ball 
                    int whoIsInt = random.nextInt(whoIs8ball.length);
                    answer = whoIs8ball[whoIsInt];
                    break;
                case 11: 
                    int whoAreInt = random.nextInt(whoAre8ball.length);
                    answer = whoAre8ball[whoAreInt];
                    break;
                case 12:
                    int whoInt = random.nextInt(who8ball.length);
                    answer = who8ball[whoInt];
                    break;

                case 13:
                    answer = "I'm doing fine, thanks.";
                    break;
                case 14:
                    answer = "Greetings.";
                    break;
                case 15:
                    answer = "I think you might already know the answer to that question. If you don't, Google it.";
                    break;
                case 16:
                    int howInt = random.nextInt(how8ball.length);
                    answer = how8ball[howInt];
                    break;

                case 17:
                    int whereInt = random.nextInt(places8ball.length);
                    answer = places8ball[whereInt];
                    break;

                case 18:
                    int whenInt = random.nextInt(time8ball.length);
                    answer = time8ball[whenInt];
                    break;

                case 19:
                    int whyInt = random.nextInt(reasons8ball.length);
                    answer = reasons8ball[whyInt];
                    break;

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
