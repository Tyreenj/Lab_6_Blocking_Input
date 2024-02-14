import java.util.Scanner;
import java.util.Random;

public class HighorLow {
    public static void main(String[] args) {
        Scanner guessIn = new Scanner(System.in);
        String guessTrash;

        Random gen = new Random();
        int val = gen.nextInt(10) + 1;

        int guessInt = 0;

        boolean guessDone = false;
        do {
            System.out.printf("I have a random number 1-10, guess what it is: ");

            if(guessIn.hasNextInt())
            {
                guessInt = guessIn.nextInt();
                if(guessInt > 0 && guessInt < 11)
                {
                    guessDone = true;
                } else {
                    System.out.println("That is not between 1 and 10! " +guessInt);
                }
            } else {
                guessTrash = guessIn.nextLine();

                System.out.println("That is not a valid number! " +guessTrash);
            }
        } while(!guessDone);

        if(guessInt == val)
        {
            System.out.println("You guessed correctly! " +val);
        } else if(guessInt > val) {
            System.out.println("You guessed too high! " + val);
        } else {
            System.out.println("You guessed too low! " +val);
        }
    }
}
