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
        String userChoice ="y";
        Scanner scnr = new Scanner(System.in);


         while (userChoice.equalsIgnoreCase("y")) { //Using while will continuously loop while user enters, "yes"
            System.out.print("Enter length: ");
            length = scnr.nextDouble();

            System.out.print("Enter the width: ");
            width = scnr.nextDouble();

            System.out.print("Enter the height: ");
            height =scnr.nextDouble();

            area = (length * width);
            System.out.println("The area is " + df.format(area) + " sqft");

            perimeter = 2 * (length + width);
            System.out.println("The perimeter is " + df.format(perimeter) + " feet");

            volume =(length * width* height);
            System.out.println("The volume is " + df.format(volume) + " cubic feet");

            System.out.println("Continue? Type (y/n)");
            userChoice = scnr.next();

        }
        System.out.println("Have a nice day.");//If user enters anything other than yes, will direct here.

    return;

    }


}
