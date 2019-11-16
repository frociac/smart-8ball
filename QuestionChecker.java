public class QuestionChecker 
{
    public static int qChecker(String question) 
    {
        //what questions
        if(question.startsWith("what is your name"))
           return 0;
        else if(question.startsWith("what are you") || question.equals("who are you") || question.equals("what is this"))
            return 1;
        else if(question.equals("what am i doing"))
            return 2;
        else if(question.startsWith("what are you doing"))
            return 3;
        else if(question.equals("what do you do"))
            return 4;
        else if(question.startsWith("what is"))
            return 5;
        else if(question.startsWith("what are"))
            return 6;
        else if(question.startsWith("what do") || question.startsWith("what does") || question.startsWith("what did") || question.startsWith("what will") || question.startsWith("what would") || question.startsWith("what wont") || question.startsWith("what might") || (question.startsWith("what") && question.contains("doing") && !question.contains("you")))
            return 7;

        //who questions
        else if(question.startsWith("who is joe")) //xddd funy meme
            return 8;
        else if(question.startsWith("who is yuri"))
            return 9;
        else if(question.startsWith("who is"))
            return 10;
        else if(question.startsWith("who are"))
            return 11;
        else if(question.startsWith("who"))
            return 12;

        //how questions
        else if(question.equals("how are you") || question.equals("how do you do"))
            return 13;
        else if(question.startsWith("howdy") || question.startsWith("hello") || question.startsWith("hi"))
            return 14;
        else if(question.startsWith("how") && (question.contains(" i ") || question.contains("me") || question.contains("myself")))
            return 15;
        else if(question.startsWith("how"))
            return 16;

        //where 
        else if(question.startsWith("where"))
            return 17;

        //when
        else if(question.startsWith("when"))
            return 18;

        //why
        else if(question.startsWith("why"))
            return 19;

        //or
        else if(question.contains(" or ") && !(question.startsWith("which") || question.startsWith("what") || question.startsWith("when") || question.startsWith("where") || question.startsWith("why") || question.startsWith("who") || question.startsWith("are")))
            return 20;

        else if(question.contains(" or ") && (question.startsWith("which") || question.startsWith("what") || question.startsWith("when") || question.startsWith("where") || question.startsWith("why") || question.startsWith("who") || question.startsWith("are")))
            return 21;

        //ballDefault
        else if(question.startsWith("is") || question.startsWith("are") || question.startsWith("am") || question.startsWith("will") || question.startsWith("would") || question.startsWith("do") || question.startsWith("does") || question.startsWith("did") || question.startsWith("wont") || question.startsWith("might") || question.startsWith("so") || question.startsWith("should"))
            return 22;

        //stop
        else if(question.equals("stop") || question.equals("x"))
            return 23;

        else
            return -1;
    }
}