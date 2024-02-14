import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args)
    {
        Scanner gasIn = new Scanner(System.in);
        String gasTrash;
        Scanner efficiencyIn = new Scanner(System.in);
        String efficiencyTrash;
        Scanner priceIn = new Scanner(System.in);
        String priceTrash;

        double currentGas = 0;
        double fuelEfficiency = 0;
        double gasPrice = 0;
        double costPerHundred;
        double howFar;

        boolean gasDone = false;
        boolean efficiencyDone = false;
        boolean priceDone = false;
        do {
            System.out.printf("Please enter the number of gallons of gas in your car: ");

            if(gasIn.hasNextDouble())
            {
                currentGas = gasIn.nextDouble();

                gasDone = true;
            } else {
                gasTrash = gasIn.nextLine();
                System.out.println("You said you have " +gasTrash +" gallons in your car.");
                System.out.println("That is not a valid number of gallons!");
            }
        } while(!gasDone);
        do {
            System.out.printf("Please enter the fuel efficiency of your car in miles per gallon: ");

            if(efficiencyIn.hasNextDouble())
            {
                efficiencyDone = true;

                fuelEfficiency = efficiencyIn.nextDouble();
            } else {
                efficiencyTrash = efficiencyIn.nextLine();
                System.out.println("You said you can go " +efficiencyTrash +" miles for every gallon");
                System.out.println("That is not a valid number of miles!");
            }
        } while(!efficiencyDone);
        do {
            System.out.printf("Please enter the price of a gallon of gas: ");

            if(priceIn.hasNextDouble())
            {
                priceDone = true;

                gasPrice = priceIn.nextDouble();
            } else {
                priceTrash = priceIn.nextLine();
                System.out.println("You said the price of gas is $" +priceTrash);
                System.out.println("That is not a valid price!");
            }
        } while(!priceDone);

        costPerHundred = (100 / fuelEfficiency) * gasPrice;
        howFar = currentGas * fuelEfficiency;

        System.out.println("Your cost per hundred miles is " +costPerHundred);
        System.out.println("You could go " +howFar +" miles with your current gas");
    }
}
