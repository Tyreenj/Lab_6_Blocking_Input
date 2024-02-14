import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner metersIn = new Scanner(System.in);
        String metersTrash;

        double meters = 0;
        double miles;
        double feet;
        double inches;

        boolean metersDone = false;
        do {
            System.out.printf("Please enter your measurement in meters: ");

            if(metersIn.hasNextDouble())
            {
                meters = metersIn.nextDouble();

                metersDone = true;
            } else {
                metersTrash = metersIn.nextLine();
                System.out.println("Error! That is not a valid measurement! " +metersTrash);
            }
        } while(!metersDone);

        miles = meters * 0.00062137;
        feet = meters * 3.28084;
        inches = meters * 39.370079;

        System.out.println(+meters +" meters in miles is " +miles);
        System.out.println(+meters +" meters in feet is " +feet);
        System.out.println(+meters +" meters in inches is " +inches);
    }
}
