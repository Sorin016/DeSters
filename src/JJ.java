import java.util.*;
import java.util.function.Consumer;


 public class JJ extends Exception{
    // class represents user-defined exception
        public JJ(String str)
        {
            // Calling constructor of parent Exception
            super(str);
        }
    }


class CustomExceptions extends Exception {
    public CustomExceptions(String exceptionText) {
        super(exceptionText);
    }
}

// Class that uses above MyException
     class TestThrow3
    {
        public static void main(String args[])
        {
            try
            {
                // throw an object of user defined exception
              //  throw new JJ("This is user-defined exception");
                throw new CustomExceptions("This is user-defined exception");
            }
            catch (CustomExceptions ude)
            {
                System.out.println("Caught the exception");
                // Print the message from MyException object
                System.out.println(ude.getMessage());
            }
        }
    }
