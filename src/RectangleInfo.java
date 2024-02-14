import jdk.jshell.SourceCodeAnalysis;
import java.lang.Math;
import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args)
    {
        Scanner widthIn = new Scanner(System.in);
        String widthTrash;
        Scanner heightIn = new Scanner(System.in);
        String heightTrash;

        double width = 0;
        double height = 0;
        double area;
        double perimeter;
        double diagonal;

        boolean widthDone = false;
        do {
            System.out.printf("Enter the width of your rectangle: ");

            if(widthIn.hasNextDouble())
            {
                width = widthIn.nextDouble();

                widthDone = true;
            } else {
                widthTrash = widthIn.nextLine();
                System.out.println("That is not a valid width! " +widthTrash);
            }
        } while(!widthDone);

        boolean heightDone = false;
        do {
            System.out.printf("Enter the height of your rectangle: ");

            if(heightIn.hasNextDouble())
            {
                height = heightIn.nextDouble();

                heightDone = true;
            } else {
                heightTrash = heightIn.nextLine();
                System.out.println("That is not a valid height! " +heightTrash);
            }
        } while(!heightDone);

        area = width * height;
        perimeter = width + width + height + height;
        diagonal = Math.sqrt((width * width) + (height * height));

        System.out.println("The area of your rectangle is: " +area);
        System.out.println("The perimeter of your rectangle is: " +perimeter);
        System.out.println("The diagonal of your rectangle is: " +diagonal);
    }
}
