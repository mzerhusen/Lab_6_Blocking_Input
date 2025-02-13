import java.util.Scanner;
import java.util.Random;

public class HighorLow
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int randomNumber;
        int userGuess = 0;
        String userError = "";
        boolean validGuess = false;

        // Generate the number
        randomNumber = new Random().nextInt(10) + 1;

        // Get the user guess
        do
        {
            System.out.print("Please enter your guess for the random number generated between 1 and 10: ");
            if(in.hasNextInt())
            {
                userGuess = in.nextInt();
                in.nextLine();
                if(userGuess >= 1 && userGuess <= 10)
                {
                    validGuess = true;
                }
                else
                {
                    System.out.println(userGuess + " is an invalid entry. Please enter a valid number between 1 and 10.");
                }
            }
            else
            {
                userError = in.nextLine();
                System.out.println(userError + " is an invalid entry. Please enter a valid number between 1 and 10.");
            }
        }
        while(!validGuess);

        // Outcomes
        if(userGuess == randomNumber)
        {
            System.out.println("Congratulations! The number was " + randomNumber + " and you guessed correctly!");
        }
        else if(userGuess > randomNumber)
        {
            System.out.println("Your guess was high. The number was " + randomNumber + " and your guess was " + userGuess + ".");
        }
        else
        {
            System.out.println("Your guess was low. The number was " + randomNumber + " and your guess was " + userGuess + ".");
        }
    }
}
