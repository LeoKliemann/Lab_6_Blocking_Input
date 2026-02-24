import java.util.Scanner;

public class RectangleInfo{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double height = 0;
        double width = 0;
        double area;
        double perimeter;
        double diagonal;
        String trash = "";

        do
        {
            System.out.println("Please enter the rectangles length: ");
            if(in.hasNextDouble())
            {
                height = in.nextDouble();
                in.nextLine();
            }
            else
            {
                trash = in.nextLine();
                System.out.println("\nYou have entered:" + trash);
                System.out.println("Please enter a correct value.");
            }
        }
        while(height <= 0);

        do
        {
            System.out.println("Please enter the rectangles height: ");
            if(in.hasNextDouble())
            {
                width = in.nextDouble();
                in.nextLine();
            }
            else
            {
                trash = in.nextLine();
                System.out.println("\nYou have entered:" + trash);
                System.out.println("Please enter a correct value.");
            }
        }
        while(width <= 0);

        area = height * width;
        perimeter = height + width;
        diagonal = Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));

        System.out.println("The area of your rectangle is: " + area + ", the perimeter is: " + perimeter + " and the length of the diagonal is: " + diagonal);

    }
}

