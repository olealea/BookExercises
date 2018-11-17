package CH2_ElementaryProgramming;

import java.util.Scanner;

/** (Convert feet into meters) Write a program that reads a number in feet, converts it
 to meters, and displays the result. One foot is 0.305 meter. Here is a sample run:
        Enter a value for feet: 16.5
        16.5 feet is 5.0325 meters */
public class ex03_ConvertFeetToMeters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value for feet: ");
        double valueInFeet = input.nextDouble();

        //Convert feet into meters
        double valueInMeters = valueInFeet * 0.305;

        System.out.println(valueInFeet + " feet is " + valueInMeters + " meters");
    }
}
