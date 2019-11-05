import java.util.Scanner;
import java.util.Random;

public class 8_Ball 
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);
    
    while(true)
    {
      System.out.print("Ask me a question! (Use correct English grammar for useful results)");
      String question = input.nextLine().toLowerCase();
      
      if(question.startsWith("what is")
      {
      System.out.print("It is" + question.substring(7) + ".");
      }
    }
  }
}
