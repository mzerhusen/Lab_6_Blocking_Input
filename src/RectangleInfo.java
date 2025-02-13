import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        double rectangleHeight = 0.0;
        double rectangleWidth = 0.0;
        double squaredHeight;
        double squaredWidth;
        double rectanglePerimeter;
        double rectangleArea;
        double rectangleDiagonal;
        String userError;
        boolean validHeight = false;
        boolean validWidth = false;

        // Get the height.
        do
        {
            System.out.print("Enter the height of the rectangle: ");
            if(in.hasNextDouble())
            {
                rectangleHeight = in.nextDouble();
                in.nextLine();
                if(rectangleHeight > 0)
                {
                    validHeight = true;
                }
                else
                {
                    System.out.println("The height must be a positive number. You entered " + rectangleHeight + ".");
                }
            }
            else
            {
                userError = in.nextLine();
                System.out.println(userError + "is an invalid entry. Please enter a valid number.");
            }
        }
        while(!validHeight);

        //Get the width.
        do
        {
            System.out.println("Enter the width of the rectangle: ");
            if(in.hasNextDouble())
            {
                rectangleWidth = in.nextDouble();
                in.nextLine();
                if(rectangleWidth > 0)
                {
                    validWidth = true;
                }
                else
                {
                    System.out.println("The width must be a positive number. You entered " + rectangleWidth + ".");
                }
            }
            else
            {
                userError = in.nextLine();
                System.out.println(userError + "is an invalid entry. Please enter a valid number.");
            }
        }
        while(!validWidth);

        // Calculations
        squaredHeight = rectangleHeight * rectangleHeight;
        squaredWidth = rectangleWidth * rectangleWidth;
        rectanglePerimeter = (rectangleHeight * 2) + (rectangleWidth * 2);
        rectangleArea = rectangleHeight * rectangleWidth;
        rectangleDiagonal = Math.sqrt(squaredHeight + squaredWidth);

        // Output
        System.out.println("The perimeter of the rectangle is " + rectanglePerimeter + ".");
        System.out.println("The area of the rectangle is " + rectangleArea + ".");
        System.out.println("The diagonal of the rectangle is " + rectangleDiagonal + ".");
    }
}
