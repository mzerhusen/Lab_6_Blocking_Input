import java.util.Scanner;

public class CtoFConverter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int tempCelsius;
        int tempFahrenheit;
        String userError;
        boolean isCelsius = false;

        do
        {
            System.out.print("What is the temperature in Celsius? ");
            if(in.hasNextInt())
            {
                tempCelsius = in.nextInt();
                isCelsius = true;
                in.nextLine();
                tempFahrenheit = (tempCelsius * 9/5) + 32;
                System.out.println("The temperature in Fahrenheit is " + tempFahrenheit);
            }
            else
            {
                userError = in.nextLine();
                System.out.println(userError + " is not a valid input.");
            }
        }
        while(!isCelsius);
    }
}