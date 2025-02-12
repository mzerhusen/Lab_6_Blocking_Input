import java.util.Scanner;

public class FuelCosts
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double fuelCapacity = 0.0;
        double fuelEfficiency = 0.0;
        double fuelPrice = 0.0;
        double fullTank;
        double hundredMilesGallons;
        double hundredMilesCost;
        String userError;
        boolean validCapacity = false;
        boolean validEfficiency = false;
        boolean validPrice = false;

        // Get valid fuel tank capacity process
        do
        {
            System.out.print("How many gallons of fuel can your tank hold? ");
            if(in.hasNextDouble())
            {
                fuelCapacity = in.nextDouble();
                in.nextLine();
                if(fuelCapacity > 0)
                {
                    validCapacity = true;
                }
                else
                {
                    System.out.println("Capacity must be a positive number.");
                }
            }
            else
            {
                userError = in.nextLine();
                System.out.println(userError + " is not a valid entry.");
            }
        }
        while(!validCapacity);

        // Get valid fuel efficiency process
        do
        {
            System.out.print("How many miles can your vehicle drive per gallon of fuel? ");
            if(in.hasNextDouble())
            {
                fuelEfficiency = in.nextDouble();
                in.nextLine();
                if(fuelEfficiency > 0)
                {
                    validEfficiency = true;
                }
                else
                {
                    System.out.println("Miles per gallon must be a positive number.");
                }
            }
            else
            {
                userError = in.nextLine();
                System.out.println(userError + " is not a valid entry.");
            }
        }
        while(!validEfficiency);

        // Get valid fuel price process
        do
        {
            System.out.print("What is the price of fuel in dollars? (x.xx) ");
            if(in.hasNextDouble())
            {
                fuelPrice = in.nextDouble();
                in.nextLine();
                if(fuelPrice > 0)
                {
                    validPrice = true;
                }
                else
                {
                    System.out.println("Price must be a positive number.");
                }
            }
            else
            {
                userError = in.nextLine();
                System.out.println(userError + " is not a valid entry.");
            }
        }
        while(!validPrice);

        hundredMilesGallons = (100 / fuelEfficiency);
        hundredMilesCost = hundredMilesGallons * fuelPrice;
        System.out.printf("It will cost %3.2f to drive 100 miles.%n", hundredMilesCost);
        fullTank = (fuelCapacity * fuelEfficiency);
        System.out.println("On a full tank, you'll be able to drive " + fullTank + " miles.");
    }
}
