import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Magic8 
{
    public static String getLastChar(String s) 
    {
        return s.substring(s.length() - 1); 
    }

    public static int findIndex(String[] arr, String t) // method i copy pasted lol
    { 
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(t)) {
                index = i;
                break;
            }
        }
        return index;
    } 

    public static boolean isSensical(String question) // checks if question is nonsense, returns boolean
    {
        // i built this method initially but after lots of trial and error i dont understand how it even works
        String[] qWords = question.split(" ");
        boolean booFin = true;

        String[] interro = {"who", "what", "when", "where", "why", "how"};
        int interroCount = 0;        
        
        for(String inteWord : interro) {
            for(int i = 0; i < qWords.length; i++) {
                if(qWords.equals(inteWord))
                    interroCount++;
                    break;
            }
        }

        if(interroCount > 1)
            booFin = false;
        else
            booFin = true;

        return booFin; 
    }

    public static String getCurrentTime() 
    {
        Date date = new Date();
        String strDateFormat = "hh:mm a.";
        DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
        String formattedDate = dateFormat.format(date);
        return formattedDate;
    }

	public static String[] ballColor = { // colors 
        "Red",
        "Orange",
        "Yellow",
        "Green",
        "Blue",
        "Violet",
        "Black",
        "White",
        "Brown",
        "Cyan",
    };

	public static String[] ballSomething = { // what is john doing? what will happen tomorrow? what am i eating? 
    	"Something epic", 
    	"Nothing of necessity", 
    	"Your mother", 
        "Something important"
  	};

	public static String[] ballPlaces = { // where...?
		"China",
		"Area 51",
		"A planet in another dimension",
		"Llanfairpwllgwyngyll, a village in Anglesey, Wales"
	};

	public static String[] ballTime = { // when...?
		"Tomorrow, at exactly 4:20pm",
		"In approximately 604,800 seconds",
		"During the winter",
		"Right now",
		"Never"
	};

	public static String[] ballReasons = { // why...?
		"Because that's just how it works",
		"Why not",
		"No reason in particular"
	};

	// also note that both ballWhoIs and ballWhoAre should be able to answer the question "who ate my sandwich"

	public static String[] ballWhoIs = { //who is...?
		"Someone you know",
		"Your mother",
		"Barack Obama",
		"One that exists only in the imagination",
		"Someone of slight significance",
		"John Cena"
	};

	public static String[] ballWhoAre = { // who are...?
		"A group in which each individual shares similar traits to other members of the group",
		"The Second Coming",
		"Some of your friends"
	}; 

	public static String[] ballHow = { // how is john feeling? how did i do on the test? how do birds fly?
		"That's a secret (I am not legally allowed to tell you)",
		"Very impressively",
		"Epically"
	};

	public static String[] ballDefault = {
		"It is certain",
		"Without a doubt",
		"Yes - definitely",
		"Yep",
		"Most likely",
		"Signs point to yes",
		"I am unsure",
		"Perhaps",
		"You do not need to know",
		"Ask your mother",
		"Nope",
		"Most likely not",
		"Certainly... not",
		"Probably not",
		"Definitely not",
		"No"
    };
}