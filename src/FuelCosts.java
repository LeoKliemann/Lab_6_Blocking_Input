import java.sql.SQLOutput;
import java.util.Scanner;

public class FuelCosts{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double gallonsInTank = 0;
        double milesPerGallon = 0;
        double pricePerGallon = 0;
        double hundredMilesCost;
        double distanceTravelled;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.println("Enter the amount of gallons in your tank: ");
            if(in.hasNextDouble())
            {
                gallonsInTank = in.nextDouble();
                in.nextLine();
            }
            else
            {
                trash = in.nextLine();
                System.out.println("\nYou have entered:");
                System.out.println("Please enter a correct value.");
            }
        }
        while(gallonsInTank <= 0);

        do
        {
            System.out.println("Enter the gas mileage (in MPG) your vehicle has: ");
            if(in.hasNextDouble())
            {
                milesPerGallon = in.nextDouble();
                in.nextLine();
            }
            else
            {
                trash = in.nextLine();
                System.out.println("\nYou have entered:");
                System.out.println("Please enter a correct value.");
            }
        }
        while(milesPerGallon <= 0);

        do
        {
            System.out.println("Enter the price per gallon of gas: ");
            if(in.hasNextDouble())
            {
                pricePerGallon = in.nextDouble();
                in.nextLine();
            }
            else
            {
                trash = in.nextLine();
                System.out.println("\nYou have entered:");
                System.out.println("Please enter a correct value.");
            }
        }
        while(pricePerGallon <= 0);

        hundredMilesCost = (100 / milesPerGallon) * pricePerGallon;
        distanceTravelled = gallonsInTank * milesPerGallon;

        System.out.println("The cost to drive 100 miles is: " + hundredMilesCost + " and the car can drive: " + distanceTravelled + " miles.");
    }
}
