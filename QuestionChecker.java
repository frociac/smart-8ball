public class QuestionChecker 
{
    public static int qChecker(String question) 
    {
        // not a question
        if(!Magic8.isSensical(question))
            return 0;
        else if(Magic8.getLastChar(question) == ".")
            return 1;

        // what questions
        else if(question.startsWith("what is your name"))
            return 2;
        else if(question.startsWith("what are you") || question.equals("who are you") || 
                question.equals("what is this"))
            return 3;
        else if(question.equals("what am i doing"))
            return 4;
        else if(question.startsWith("what are you doing"))
            return 5;
        else if(question.equals("what do you do"))
            return 6;
        else if(question.startsWith("what do") || question.startsWith("what does") || 
                question.startsWith("what did") || question.startsWith("what will") || 
                question.startsWith("what would") || question.startsWith("what wont") || 
                question.startsWith("what might") || (question.startsWith("what") && 
                question.contains("doing") && !question.contains("you")))
            return 7;
        else if(question.startsWith("what") && (question.contains("color") || question.contains("colour")))
            return 8;
        else if(question.startsWith("what is"))
            return 9;
        else if(question.startsWith("what are"))
            return 10;
        else if(question.equals("what time is it"))
            return 11;
        else if(question.startsWith("what time"))
            return 12;

        // who questions
        else if(question.startsWith("who is joe")) // xddd funy meme
            return 13;
        else if(question.startsWith("who is yuri"))
            return 14;
        else if(question.startsWith("who is"))
            return 15;
        else if(question.startsWith("who are"))
            return 16;
        else if(question.startsWith("whose"))
            return 17;
        else if(question.startsWith("who"))
            return 18;

        // how questions
        else if(question.equals("how are you") || question.equals("how do you do"))
            return 19;
        else if(question.startsWith("howdy") || question.startsWith("hello") || question.startsWith("hi"))
            return 20;
        else if(question.startsWith("how") && (question.contains(" i ") || question.contains("me") || 
                question.contains("myself")))
            return 21;
        else if(question.startsWith("how"))
            return 22;

        // where 
        else if(question.startsWith("where"))
            return 23;

        // when
        else if(question.startsWith("when"))
            return 24;

        // why
        else if(question.startsWith("why"))
            return 25;

        // or
        else if(question.contains(" or ") && !(question.startsWith("which") || question.startsWith("what") || 
                question.startsWith("when") || question.startsWith("where") || question.startsWith("why") || 
                question.startsWith("who") || question.startsWith("are")))
            return 26;
        else if(question.contains(" or ") && (question.startsWith("which") || question.startsWith("what") || 
                question.startsWith("when") || question.startsWith("where") || question.startsWith("why") || 
                question.startsWith("who") || question.startsWith("are")))
            return 27;

        // ballDefault
        else if(question.startsWith("is") || question.startsWith("are") || question.startsWith("am") || 
                question.startsWith("will") || question.startsWith("would") || question.startsWith("do") || 
                question.startsWith("does") || question.startsWith("did") || question.startsWith("wont") || 
                question.startsWith("might") || question.startsWith("so") || question.startsWith("should") ||
                question.startsWith("can"))
            return 28;

        // stop
        else if(question.equals("stop") || question.equals("x"))
            return 29;

        else
            return -1;
    }
}