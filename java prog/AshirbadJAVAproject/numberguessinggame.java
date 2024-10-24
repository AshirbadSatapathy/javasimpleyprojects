package AshirbadJAVAproject;
import java.utill.Random;
import java.utill.*;


public class numberguessinggame 
{
    public static void main(String[] args)
    {
        try(Scanner sc=new Scanner(System.in))
        {
            Random random=new Random();


            int secretNumber=random.nextint(100)+1;
            int guess;
            int attempts=0;
            boolean correctGuess = false;

            System.out.println("welcome to the number guessing game!");
            System.out.println(".......................................");
            System.out.println("guess a number between 1 to 100");

            do
            {
                System.out.println("Enter your guess:");
                guess= scanner .nextInt();
                attempts++;

                //check if the guess is correct,too high or too low

                if(guess==secretNumber)
                {
                    correctGuess=true;
                }
                else if(guess<secretNumber)
                {
                    System.out.println("too low! try again:");
                }
                else if(guess>secretNumber)
                {
                    System.out.println("too high! try again:");
                }
            }while(!correctGuess);

            System.out.println("congratulation! you guessed the number" +secretNumber+"correctly");
            System.out.println("number of attempts" +attempts);
        }
    }
}


