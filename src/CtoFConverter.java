import java.util.Scanner;

public class CtoFConverter{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double celsius = 0;
        double fahrenheit;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("Enter the degrees Celsius: ");

            if (in.hasNextDouble()) {
                celsius = in.nextDouble();
                in.nextLine();

                fahrenheit = (celsius * 1.8) + 32;

                System.out.println("The degrees Fahrenheit is: " + fahrenheit);

                done = true;
            } else {

                trash = in.nextLine();
                System.out.println("\nYou said the temperature was: " + trash);
                System.out.println("Please enter a valid amount.");
            }
        }while(!done);
    }
}
