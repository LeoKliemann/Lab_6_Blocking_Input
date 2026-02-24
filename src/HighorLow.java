import java.util.Scanner;
import java.util.Random;

public class HighorLow{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random randomNumber = new Random();

        int guess = 0;
        int generator = randomNumber.nextInt(10) +1;
        String trash = "";
        boolean done = false;

        do {
            System.out.println("Guess a number between [1-10]: ");
            if(in.hasNextInt()){
                guess = in.nextInt();
                in.nextLine();

                if(1 <= guess && guess <= 10) {
                    done = true;
                }
                else System.out.println("You have included a whole number but it is not in range");
            }
            else{
                trash = in.nextLine();
                System.out.println("\nYou have not entered a valid input: " + trash);
                System.out.println("Please enter a valid input");
            }
        }while(!done);

        if(guess == generator) {
            System.out.println("You got it!");
        }
        else if (guess > generator){
            System.out.println("Too high!");
        }
        else {
            System.out.println("Too Low!");
        }








    }
}
