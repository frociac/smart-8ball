import java.util.Random;
import java.util.Arrays;

public class AnswerFinder 
{
    public static String aFinder(int q, String question) 
    {
        Random random = new Random();

        //what: 0-7
        //who: 8-12
        //how: 13-16
        //where: 17
        //when: 18
        //why: 19
        //or: 20-21
        //ballDefault: 22
        switch(q)
        {
            case 0:
                return "My name is Smart-8ball.";
            case 1:
                return "I am a 8-ball program written in Java.";
            case 2:
                return "You are asking me questions.";
            case 3:
                return "I'm answering questions.";
            case 4:
                return "I answer questions.";
            case 5:
                return "It is" + question.substring(7) + ". ";
            case 6: 
                return "They are " + question.substring(8) + ". ";
            case 7:
                int somethingInt = random.nextInt(Magic8.ballSomething.length);
                return Magic8.ballSomething[somethingInt];

            case 8:
                return "Joe mother is a nice person.";
            case 9:
                return "Yuri-ally amazing.";
            case 10:
                //smh finally a real 8ball 
                int whoIsInt = random.nextInt(Magic8.ballWhoIs.length);
                return Magic8.ballWhoIs[whoIsInt];
            case 11: 
                int whoAreInt = random.nextInt(Magic8.ballWhoAre.length);
                return Magic8.ballWhoAre[whoAreInt];
            case 12:
                String[] who8ball = new String[Magic8.ballWhoIs.length + Magic8.ballWhoAre.length];
                System.arraycopy(Magic8.ballWhoIs, 0, who8ball, 0, Magic8.ballWhoIs.length);
                System.arraycopy(Magic8.ballWhoAre, 0, who8ball, Magic8.ballWhoIs.length, Magic8.ballWhoAre.length);
                int whoInt = random.nextInt(who8ball.length);
                return who8ball[whoInt];

            case 13:
                return "I'm doing fine, thanks.";
            case 14:
                return "Greetings.";
            case 15:
                return "I think you might already know the answer to that question. If you don't, Google it.";
            case 16:
                int howInt = random.nextInt(Magic8.ballHow.length);
                return Magic8.ballHow[howInt];

            case 17:
                int whereInt = random.nextInt(Magic8.ballPlaces.length);
                return Magic8.ballPlaces[whereInt];

            case 18:
                int whenInt = random.nextInt(Magic8.ballTime.length);
                return Magic8.ballTime[whenInt];

            case 19:
                int whyInt = random.nextInt(Magic8.ballReasons.length);
                return Magic8.ballReasons[whyInt];

            case 20:
                //i might be overcomplicating, but it works. change it if theres a simpler way
                String[] orItems;
                if(question.contains(", ")) {
                    orItems = question.replace("or ", "").split(", ");
                } else {
                    orItems = question.split(" or ", 2);
                }
                int orInt = random.nextInt(orItems.length);
                String orChosenItem = orItems[orInt];
                return orChosenItem.substring(0, 1).toUpperCase() + orChosenItem.substring(1) + ".";

            case 21:
                String[] orChoices = {"The latter.", "The first one.", "The better one."};
                int cOrInt = random.nextInt(orChoices.length);
                return orChoices[cOrInt];

            case 22:
                int defInt = random.nextInt(Magic8.ballDefault.length);
                return Magic8.ballDefault[defInt];

            case 23:
                return "Goodbye.";

            default:
                return "is that a proper question ???";
        }
    }
}