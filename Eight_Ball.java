import java.util.Scanner;
import java.util.Random;

public class Eight_Ball 
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);
    
    while(true)
    {
      System.out.print("Ask me a question! (Use correct English grammar for useful results) ");
      String question = input.nextLine().toLowerCase();
      question = question.replace("?", "");
      // note for brendon: make sure you add contractions such as, what's. I'll add it to your thing
      if(question.startsWith("what is"))
      {
      System.out.print("It is" + question.substring(7) + ". ");
      System.out.println();
      }
    }
  }
}
