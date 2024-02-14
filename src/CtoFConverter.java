import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double Ctemp;
        double Ftemp;
        String trash;

        boolean done = false;
        do {
            System.out.print("Enter the temperature in Degrees Celsius: ");
            if(in.hasNextDouble())
            {
                done = true;

                Ctemp = in.nextDouble();
                Ftemp = ((9 * Ctemp) / 5) + 32;

                System.out.println(+Ctemp +" Degrees Celsius is " +Ftemp +" Degrees Fahrenheit");
            } else {
                //Not a double
                trash = in.nextLine();
                System.out.println("\nYou said the temperature was: " +trash);
                System.out.println("That is not a valid temperature!");
            }
        } while(!done);
    }
}