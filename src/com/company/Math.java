import java.util.Scanner;
import java.text.DecimalFormat;


public class Math {

    public static void main(String[] args) {
        double length = 0.0;
        double width = 0.0;
        double height = 0.0;
        double area = 0.0;
        double perimeter = 0.0;
        double volume =0.0;
        DecimalFormat df = new DecimalFormat("#.00"); //Will limit to two spaces after the decimal point
        String userWord = "yes"; //FIX: Need to allow to print either upper or lower case
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter length of any room using the format feet.inches:");
        length = scnr.nextDouble();

        System.out.println("Enter the width of the room using the format feet.inches:");
        width = scnr.nextDouble();

        System.out.println("Enter the height of the same room using the format feet.inches");
        height =scnr.nextDouble();

        area = (length * width);
        System.out.println("The area of the room is " + df.format(area) + " sqft.");

        perimeter = 2 * (length + width);
        System.out.println("The perimeter of the room is " + df.format(perimeter) + " feet.");

        volume =(length * width*height);
        System.out.println("The volume of the room is " + df.format(volume) + " cubic feet.");

        System.out.println("Would you like to measure another room? Please type, yes or no");
        userWord = scnr.next();

        while (userWord.equals("yes")) { //Using while will continuously loop while user enters, "yes"
            System.out.println("Enter length of any room using the format feet.inches:");
            length = scnr.nextDouble();

            System.out.println("Enter the width of any room using the format feet.inches:");
            width = scnr.nextDouble();

            System.out.println("Enter the height of the same room using the format feet.inches");
            height =scnr.nextDouble();

            area = (length * width);
            System.out.println("The area of the room is " + df.format(area) + " sqft");

            perimeter = 2 * (length + width);
            System.out.println("The perimeter of the room is " + df.format(perimeter) + " feet");

            volume =(length * width*height);
            System.out.println("The volume of the room is " + df.format(volume) + " cubic feet");

            System.out.println("Would you like to measure another room? Please type, yes or no");
            userWord = scnr.next();

        }
        System.out.println("Have a nice day.");//If user enters anything other than yes, will direct here.

    return;

    }


}
