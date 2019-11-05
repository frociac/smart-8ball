import java.util.Scanner;
import java.util.Random;
 
public class Eight_Ball
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    while(true)
    {
        int caseChecker = -1;
        //you wanted to use a Random class, so here (yes i control c, and control v)
        Random random = new Random();
	//5 is excluded, so really it's 0 through 4
        int randomInt = random.nextInt(5);
        System.out.println("Random number generated is : " + randomInt);
        System.out.print("Ask me a question! (Use correct English grammar for useful results) ");
        //got rid of toLowerCase() because it adjusted the String Question and lowercased names (see next comment)
        String question = input.nextLine();
        question = question.replace("?", "");
        question = question.replace(".", "");
        //instead i just put the toLowerCase() in here
        if(question.toLowerCase().startsWith("what is"))
            caseChecker = 0;
        else if(question.toLowerCase().startsWith("who is"))
            caseChecker = 1;
        else if(question.toLowerCase().equals("who are you"))
            caseChecker = 2;
        else if(question.toLowerCase().startsWith("who are"))
            caseChecker = 3;
        else if(question.toLowerCase().equals("stop"))
            break;
        switch(caseChecker)
        {
            case 0:
                System.out.println("It is" + question.substring(7) + ". ");
                break;    
            case 1:
                System.out.println("They are" + question.substring(6) + ". ");
                break;
            case 2:
                System.out.println("I am me.");
                break;
            case 3:
                System.out.println("They are" + question.substring(7) + ". ");
                break;
            default:
                System.out.println("what.");
 
        }
    }
    System.out.println("alright");
    //close statement closes the input, something about a data leak idk
    input.close();
  }
}
