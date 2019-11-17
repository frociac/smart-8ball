import java.util.Random;
import java.util.Arrays;

public class AnswerFinder 
{
    public static String aFinder(int q, String question) 
    {
        Random random = new Random();

        String[] who8ball = new String[Magic8.ballWhoIs.length + Magic8.ballWhoAre.length];
        System.arraycopy(Magic8.ballWhoIs, 0, who8ball, 0, Magic8.ballWhoIs.length);
        System.arraycopy(Magic8.ballWhoAre, 0, who8ball, Magic8.ballWhoIs.length, Magic8.ballWhoAre.length);
        int whoInt = random.nextInt(who8ball.length);
        String strWho = who8ball[whoInt];

        // !question: 0-1
        // what: 2-12
        // who: 13-18
        // how: 19-22
        // where: 23
        // when: 24
        // why: 25
        // or: 26-27
        // ballDefault: 28
        switch(q)
        {
            case 0:
                return "Hmm. If I didn't know better, I'd say you're trying to confuse me";
            case 1:
                return "I'm pretty sure questions don't end with periods";

            case 2:
                return "My name is Smart-8ball";
            case 3:
                return "I am a 8-ball program written in Java";
            case 4:
                return "You are asking me questions";
            case 5:
                return "I'm answering questions";
            case 6:
                return "I answer questions";
            case 7:
                int somethingInt = random.nextInt(Magic8.ballSomething.length);
                return Magic8.ballSomething[somethingInt];
            case 8:
                int colorInt = random.nextInt(Magic8.ballColor.length);
                return Magic8.ballColor[colorInt];
            case 9:
                return "It is" + question.substring(7);
            case 10: 
                return "They are " + question.substring(8);
            case 11:
                String currTime = Magic8.getCurrentTime();
                return currTime;
            case 12:
                int randHour = random.nextInt(12) + 1; // randomly generates a time
                int randMin = random.nextInt(60);
                String[] amPm = {"AM", "PM",};
                int amPmInt = random.nextInt(amPm.length);
                String strRandHour = (randHour < 10 ? "0" : "") + randHour; // turns single digits into 01 format
                String strRandMin = (randMin < 10 ? "0" : "") + randMin;
                return strRandHour + ":" + strRandMin + " " + amPm[amPmInt];

            case 13:
                return "Joe mother is a nice person";
            case 14:
                return "Yuri-ally amazing";
            case 15:
                int whoIsInt = random.nextInt(Magic8.ballWhoIs.length);
                return Magic8.ballWhoIs[whoIsInt];
            case 16: 
                int whoAreInt = random.nextInt(Magic8.ballWhoAre.length);
                return Magic8.ballWhoAre[whoAreInt];
            case 17: 
                if(Magic8.getLastChar(strWho) == "s") 
                    return strWho + "'";
                else 
                    return strWho + "'s";
            case 18:
                return strWho;

            case 19:
                return "I'm doing fine, thanks";
            case 20:
                return "Greetings";
            case 21:
                return "I think you might already know the answer to that question. If you don't, Google it";
            case 22:
                int howInt = random.nextInt(Magic8.ballHow.length);
                return Magic8.ballHow[howInt];

            case 23:
                int whereInt = random.nextInt(Magic8.ballPlaces.length);
                return Magic8.ballPlaces[whereInt];

            case 24:
                int whenInt = random.nextInt(Magic8.ballTime.length);
                return Magic8.ballTime[whenInt];

            case 25:
                int whyInt = random.nextInt(Magic8.ballReasons.length);
                return Magic8.ballReasons[whyInt];

            case 26:
                // i might be overcomplicating, but it works. change it if theres a simpler way
                String[] orItems;
                if(question.contains(", ")) {
                    orItems = question.replace("or ", "").split(", ");
                } else {
                    orItems = question.split(" or ", 2);
                }
                int orInt = random.nextInt(orItems.length);
                String orChosenItem = orItems[orInt];
                return orChosenItem.substring(0, 1).toUpperCase() + orChosenItem.substring(1);
            case 27:
                String[] orChoices = {"The latter", "The first one", "The better one"};
                int cOrInt = random.nextInt(orChoices.length);
                return orChoices[cOrInt];

            case 28:
                int defInt = random.nextInt(Magic8.ballDefault.length);
                return Magic8.ballDefault[defInt];

            case 29:
                return "Goodbye";

            default:
                return "I don't understand";
        }
    }
}